/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cbt_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author abdul
 */
public class Test extends javax.swing.JFrame {

    List<String> Questions = new ArrayList<>();
    List<String> OptionA = new ArrayList<>();
    List<String> OptionB = new ArrayList<>();
    List<String> OptionC = new ArrayList<>();
    List<String> OptionD = new ArrayList<>();
    List<String> Answers = new ArrayList<>();
    List<String> StudentAnswer = new ArrayList<>();
    String yourOption = "";

    int i = 0;
    int duration;
    int remainingTime;
    StringBuilder resultText = new StringBuilder();
    String testCode;
    int noq;
    int score;

    public Test(String testCode) {
        this.testCode = testCode;
        initComponents();
        addRadioButtonsToGroup();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the drive
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999..."); //establishing connection
            String sqlQuery = "SELECT Questions, OptionA, OptionB, OptionC, OptionD, Answers FROM test_questions";
            PreparedStatement pst = con.prepareStatement(sqlQuery);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String value = rs.getString("Questions");
                String value1 = rs.getString("OptionA");
                String value2 = rs.getString("OptionB");
                String value3 = rs.getString("OptionC");
                String value4 = rs.getString("OptionD");
                String value5 = rs.getString("Answers");

                Questions.add(value);
                OptionA.add(value1);
                OptionB.add(value2);
                OptionC.add(value3);
                OptionD.add(value4);
                Answers.add(value5);
            }

            PreparedStatement noqStatement = con.prepareStatement("SELECT No_of_Questions FROM test_info WHERE Test_Code=?");
            noqStatement.setString(1, testCode);
            ResultSet noqResult = noqStatement.executeQuery();
            if (noqResult.next()) {
                noq = noqResult.getInt(1);
            }
            setQuestionAndOptions();

        } catch (Exception e) {
            //  JOptionPane.showMessageDialog(rootPane, e);
        }

        jLabel1.setText(testCode);
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the drive
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999..."); //establishing connec
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM test_info where Test_Code=?");
            ps.setString(1, testCode);
            ResultSet hs = ps.executeQuery();
            while (hs.next()) {
                duration = hs.getInt(3); //This is the total amount of seconds gotten from the database

                String formattedTime = formatTime(duration);
                jLabel2.setText(formattedTime);
                remainingTime = duration;

                new Thread(() -> {
                    while (remainingTime > 0) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                            remainingTime--;

                            // Update the timer label on the Event Dispatch Thread (EDT)
                            java.awt.EventQueue.invokeLater(() -> {
                                jLabel2.setText(formatTime(remainingTime));
                            });
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    java.awt.EventQueue.invokeLater(() -> {
                        jLabel2.setText("Time remaining: 00:00:00");
                        JOptionPane.showMessageDialog(rootPane, "Time Up", "Time Up", JOptionPane.INFORMATION_MESSAGE);

                        String email = Home.getUserEmail();

                        int score = 0;
                        String youranswer = "";
                        String cananswer = "";
                        for (int i = 0; i < noq - 1; i++) {
                            youranswer = StudentAnswer.get(i);
                            cananswer = Answers.get(i);
                            if (cananswer.equals(youranswer)) {
                                score++;
                            }
                        }
                        String subject = "Test score for CBT";        // TODO add your handling code here:
                        String receiver = email;
                        String body = "Please find your test score below.\n"
                                + "Your Score: " + score + "/" + noq + "\n"
                                + "Have a good day!";
                        String senderEmail = "abdullahsalami909@gmail.com";
                        String senderPassword = "twjtowmgmsnfitml";
                        Properties props = new Properties();
                        props.put("mail.smtp.auth", "true");
                        props.put("mail.smtp.starttls.enable", "true");
                        props.put("mail.smtp.host", "smtp.gmail.com");
                        props.put("mail.smtp.port", "587");

                        Session session = Session.getInstance(props,
                                new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(senderEmail, senderPassword);
                            }
                        });

                        try {
                            Message message = new MimeMessage(session);
                            message.setFrom(new InternetAddress(senderEmail));
                            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
                            message.setSubject(subject);
                            message.setText(body);
                            Transport.send(message);
                            JOptionPane.showMessageDialog(rootPane, "Please check your email for your score.");
                        } catch (MessagingException e) {
                            JOptionPane.showMessageDialog(rootPane, e);
                        }
//
                        String matno = null;
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                            PreparedStatement zs = con.prepareStatement("SELECT MatriculationNumber FROM student_info WHERE Email=?");
                            zs.setString(1, email);

                            ResultSet rs = zs.executeQuery();

                            if (rs.next()) {
                                matno = rs.getString("MatriculationNumber");
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, e);
                        }
//
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                            // PreparedStatement psInsert = con.prepareStatement("INSERT INTO student_script_info VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

                            for (int index = 0; index < noq - 1; index++) {
                                PreparedStatement psInsert = con.prepareStatement("INSERT INTO student_script_info VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                                // Set values for the prepared statement
                                psInsert.setString(1, matno);
                                psInsert.setString(2, Questions.get(index));
                                psInsert.setString(3, OptionA.get(index));
                                psInsert.setString(4, OptionB.get(index));
                                psInsert.setString(5, OptionC.get(index));
                                psInsert.setString(6, OptionD.get(index));
                                psInsert.setString(7, Answers.get(index));
                                psInsert.setString(8, StudentAnswer.size() > index ? StudentAnswer.get(index) : "Not answered");

                                // Execute the update
                                int rs = psInsert.executeUpdate();
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, e);
                        }

                        for (int index = 0; index < noq - 1; index++) {
                            resultText.append("Question ").append(index + 1).append(": ").append(Questions.get(index)).append("\n");
                            resultText.append("A. ").append(OptionA.get(index)).append("\n");
                            resultText.append("B. ").append(OptionB.get(index)).append("\n");
                            resultText.append("C. ").append(OptionC.get(index)).append("\n");
                            resultText.append("D. ").append(OptionD.get(index)).append("\n");
                            resultText.append("Correct Answer: ").append(Answers.get(index)).append("\n");
                            resultText.append("Your Answer: ").append(StudentAnswer.size() > index ? StudentAnswer.get(index) : "Not answered").append("\n");
                            resultText.append("\n");
                        }

                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                            PreparedStatement zs = con.prepareStatement("insert into student_result_info values(?,?,?)");

                            zs.setString(1, matno);
                            zs.setString(1, email);
                            zs.setInt(2, score);

                            int rs = zs.executeUpdate();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, e);
                        }

                        ViewScript vsp = new ViewScript();
                        vsp.jTextArea1.setText(resultText.toString());
                        vsp.setVisible(true);
                    }
                    );
                }
                )
                        .start();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void addRadioButtonsToGroup() {
        // Add radio buttons to the ButtonGroup
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
    }

    private String formatTime(int seconds) {
        int remainingHours = seconds / 3600;
        int remainingMinutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return String.format("Time remaining: %02d:%02d:%02d", remainingHours, remainingMinutes, remainingSeconds);
    }

    private void setQuestionAndOptions() {
        // Check if the current question index is within the valid range
        if (i < noq) {
            jTextArea1.setText(i + 1 + "." + Questions.get(i));
            jRadioButton1.setText(OptionA.get(i));
            jRadioButton2.setText(OptionB.get(i));
            jRadioButton3.setText(OptionC.get(i));
            jRadioButton4.setText(OptionD.get(i));
            buttonGroup1.clearSelection();
            jTextArea1.setEditable(false);

            yourOption = StudentAnswer.get(i);

            if (yourOption != null) {
                switch (yourOption) {
                    case "A":
                        jRadioButton1.setSelected(true);
                        break;
                    case "B":
                        jRadioButton2.setSelected(true);
                        break;
                    case "C":
                        jRadioButton3.setSelected(true);
                        break;
                    case "D":
                        jRadioButton4.setSelected(true);
                        break;
                    default:
                        buttonGroup1.clearSelection();
                }
            }
        } else {
            // Display a message when the last question is reached
            JOptionPane.showMessageDialog(rootPane, "This is the last question!");
        }
    }

    private void updateStudentAnswerList() {
        // Check if the current index is within the bounds of the StudentAnswer list
        if (i < StudentAnswer.size()) {
            StudentAnswer.set(i, yourOption);
        } else {
            StudentAnswer.add(yourOption);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        jRadioButton3.setText("jRadioButton3");

        jRadioButton4.setText("jRadioButton4");

        jButton1.setText("Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3)))
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to submit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.YES_OPTION) {
                int score = 0;
                String youranswer = "";
                String cananswer = "";
                for (int i = 0; i < noq - 1; i++) {
                    youranswer = StudentAnswer.get(i);
                    cananswer = Answers.get(i);
                    if (cananswer.equals(youranswer)) {
                        score++;
                    }
                }

                String email = Home.getUserEmail();
                String subject = "Test score for CBT";        // TODO add your handling code here:
                String receiver = email;
                String body = "Please find your test score below.\n"
                        + "Your Score: " + score + "/" + noq + "\n"
                        + "Have a good day!";
                String senderEmail = "abdullahsalami909@gmail.com";
                String senderPassword = "twjtowmgmsnfitml";
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

                Session session = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(senderEmail, senderPassword);
                    }
                });

                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(senderEmail));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
                    message.setSubject(subject);
                    message.setText(body);
                    Transport.send(message);
                    JOptionPane.showMessageDialog(rootPane, "Please check your email for your score.");
                } catch (MessagingException e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

                String matno = null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                    PreparedStatement ps = con.prepareStatement("SELECT MatriculationNumber FROM student_info WHERE Email=?");
                    ps.setString(1, email);

                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        matno = rs.getString("MatriculationNumber");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                    // PreparedStatement psInsert = con.prepareStatement("INSERT INTO student_script_info VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

                    for (int index = 0; index < noq - 1; index++) {
                        PreparedStatement psInsert = con.prepareStatement("INSERT INTO student_script_info VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                        // Set values for the prepared statement
                        psInsert.setString(1, matno);
                        psInsert.setString(2, Questions.get(index));
                        psInsert.setString(3, OptionA.get(index));
                        psInsert.setString(4, OptionB.get(index));
                        psInsert.setString(5, OptionC.get(index));
                        psInsert.setString(6, OptionD.get(index));
                        psInsert.setString(7, Answers.get(index));
                        psInsert.setString(8, StudentAnswer.size() > index ? StudentAnswer.get(index) : "Not answered");

                        // Execute the update
                        int rs = psInsert.executeUpdate();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

                StringBuilder resultText = new StringBuilder();

                for (int index = 0; index < noq; index++) {
                    resultText.append("Question ").append(index + 1).append(": ").append(Questions.get(index)).append("\n");
                    resultText.append("A. ").append(OptionA.get(index)).append("\n");
                    resultText.append("B. ").append(OptionB.get(index)).append("\n");
                    resultText.append("C. ").append(OptionC.get(index)).append("\n");
                    resultText.append("D. ").append(OptionD.get(index)).append("\n");
                    resultText.append("Correct Answer: ").append(Answers.get(index)).append("\n");
                    resultText.append("Your Answer: ").append(StudentAnswer.size() > index ? StudentAnswer.get(index) : "Not answered").append("\n");
                    resultText.append("\n");
                }

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                    PreparedStatement ps = con.prepareStatement("insert into student_result_info values(?,?,?)");

                    ps.setString(1, matno);
                    ps.setString(2, email);
                    ps.setInt(3, score);

                    int rs = ps.executeUpdate();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

                ViewScript vsp = new ViewScript();
                vsp.jTextArea1.setText(resultText.toString());
                vsp.setVisible(true);
                dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (i == noq - 1) {
            JOptionPane.showMessageDialog(rootPane, "This is the last question!");
        }

        if (i < noq - 1) {
            if (jRadioButton1.isSelected()) {
                yourOption = jRadioButton1.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton2.isSelected()) {
                yourOption = jRadioButton2.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton3.isSelected()) {
                yourOption = jRadioButton3.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton4.isSelected()) {
                yourOption = jRadioButton4.getText();
                StudentAnswer.add(yourOption);
            }
            i = i + 1;
            setQuestionAndOptions();
        } else if (i == noq - 1) {
            if (jRadioButton1.isSelected()) {
                yourOption = jRadioButton1.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton2.isSelected()) {
                yourOption = jRadioButton2.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton3.isSelected()) {
                yourOption = jRadioButton3.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton4.isSelected()) {
                yourOption = jRadioButton4.getText();
                StudentAnswer.add(yourOption);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This is the last question!");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (i == 0) {
            JOptionPane.showMessageDialog(rootPane, "This is the first question!");
        }
        if (i < noq - 1) {
            if (jRadioButton1.isSelected()) {
                yourOption = jRadioButton1.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton2.isSelected()) {
                yourOption = jRadioButton2.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton3.isSelected()) {
                yourOption = jRadioButton3.getText();
                StudentAnswer.add(yourOption);
            } else if (jRadioButton4.isSelected()) {
                yourOption = jRadioButton4.getText();
                StudentAnswer.add(yourOption);
            }
        }

        i = i - 1;

        jTextArea1.setText(i + 1 + ". " + Questions.get(i));
        jRadioButton1.setText(OptionA.get(i));
        jRadioButton2.setText(OptionB.get(i));
        jRadioButton3.setText(OptionC.get(i));
        jRadioButton4.setText(OptionD.get(i));
        buttonGroup1.clearSelection();

        if (!StudentAnswer.isEmpty()) {
            yourOption = StudentAnswer.get(i);
            if (yourOption.equals(jRadioButton1.getText())) {
                jRadioButton1.setSelected(true);
            } else if (yourOption.equals(jRadioButton2.getText())) {
                jRadioButton2.setSelected(true);
            } else if (yourOption.equals(jRadioButton3.getText())) {
                jRadioButton3.setSelected(true);
            } else if (yourOption.equals(jRadioButton4.getText())) {
                jRadioButton4.setSelected(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // Instantiate Test_home to get user input
            Test_home testHome = new Test_home();
            testHome.setVisible(true);

            // Wait for user input
            // Once the user has provided the input (e.g., by clicking a button),
            // retrieve the test code and pass it to the Test frame constructor
            String testCode = testHome.getTestCode();
            Test testFrame = new Test(testCode);
            testFrame.setVisible(true);
        });

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Test().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
