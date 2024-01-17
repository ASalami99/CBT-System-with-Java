/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cbt_project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author abdul
 */
public class Admin_home extends javax.swing.JFrame {

    public String Hash(String c) {
        try {
            MessageDigest msgDigest = MessageDigest.getInstance("MD5");
            msgDigest.update((new String(c)).getBytes("UTF8"));
            String passHash = new String(msgDigest.digest());
            return passHash;
        } catch (Exception ex) {

            return c;
        }
    }

    /**
     * Creates new form Student_Registration2
     */
    public Admin_home() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField11 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField15 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton18 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setFont(new java.awt.Font("SimSun-ExtB", 0, 36)); // NOI18N
        jLabel13.setText("Admin Home");

        jLabel7.setText("First Name");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Accounting", "Business Administration", "Computer Science", "Economics", "Electrical Engineering", "Finance", "Information Science And Media Studies (ISMS)", "Mass Communication", "Mechanical Engineering", "Software Engineering" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Last Name");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Level", "100 Level", "200 Level", "300 Level", "400 Level", "500 Level" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Other Names");

        jRadioButton1.setText("Male");

        jLabel10.setText("Gender");

        jRadioButton2.setText("Female");

        jLabel11.setText("Department");

        jLabel14.setText("Matriculation Number");

        jLabel12.setText("Level");

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jButton1.setText("Create Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        jLabel4.setText("Password");

        jButton21.setText("Auto-Generate Password");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1)
                    .addComponent(jTextField11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton21)))
                .addGap(173, 173, 173))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton21))
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register Student", jPanel2);

        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel2.setText("Select File to insert multiple students");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton10.setText("Browse");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matriculation Number", "First Name", "Last Name", "Other Names", "Gender", "Department", "Level", "Email", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton11.setText("Upload");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(379, 379, 379)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 308, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(532, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton10)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton11))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10))
                    .addContainerGap(557, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Register Multiple Students", jPanel3);

        jLabel16.setText("Gender");

        jLabel20.setText("First Name");

        jRadioButton4.setText("Female");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Accounting", "Business Administration", "Computer Science", "Economics", "Electrical Engineering", "Finance", "Information Science And Media Studies (ISMS)", "Mass Communication", "Mechanical Engineering", "Software Engineering" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel17.setText("Matriculation Number");

        jLabel21.setText("Last Name");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Level", "100 Level", "200 Level", "300 Level", "400 Level", "500 Level" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel18.setText("Department");

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel19.setText("Level");

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Other Names");

        jRadioButton3.setText("Male");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel22.setText("Email");

        jLabel24.setText("Password");

        jLabel25.setText("Enter the Matriculation Number of the Student who's Infromation you would like to update");

        jButton7.setText("Re-generate Password");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel38.setText("Username");

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField5)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField8)
                                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(44, 44, 44)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                                .addComponent(jTextField13))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(164, 164, 164)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel25)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel38)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel24)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton13))
                .addGap(238, 238, 238))
        );

        jTabbedPane1.addTab("Search/Update/Delete Student Record", jPanel4);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question", "OptionA", "OptionB", "OptionC", "OptionD", "Answer"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jButton6.setText("Browse");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Select file to upload multiple questions");

        jButton8.setText("Upload");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton17.setText("Clear");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel33.setText("Option A");

        jLabel34.setText("Option B:");

        jLabel35.setText("Option C:");

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jLabel36.setText(" Option D:");

        jLabel37.setText("Answer");

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jLabel39.setText("Question");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jButton18.setText("Insert");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField27)
                                .addComponent(jTextField26)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButton18)
                .addGap(296, 296, 296)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addGap(198, 198, 198))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton17)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton18)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Upload Test Questions", jPanel5);

        jLabel40.setText("Set Number of Questions:");

        jLabel41.setText("Set Time Duration for Test:");

        jLabel42.setText("Hours:");

        jLabel43.setText("Minutes:");

        jLabel44.setText("Seconds:");

        jButton19.setText("Create Test");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel45.setText("Set Test Name");

        jTextField14.setText("e.g CSC_101");
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField28KeyTyped(evt);
            }
        });

        jTextField29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField29KeyTyped(evt);
            }
        });

        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });
        jTextField30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField30KeyTyped(evt);
            }
        });

        jTextField31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField31KeyTyped(evt);
            }
        });

        jButton22.setText("Delete Test");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton22))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField14)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField31))
                .addContainerGap(552, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton22))
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Test", jPanel7);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matriculation Number", "First Name", "Last Name", "Middle Name", "Score"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jLabel5.setText("Enter Matriculation Number of Student whose score you want to see");

        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField23KeyTyped(evt);
            }
        });

        jButton23.setText("View Score");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("View All Student Scores");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("Save Scores to CSV File");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton24)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Student Scores", jPanel8);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Enter the Matriculation Number of the student whose script you want to view");

        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton14.setText("Print Script");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField16)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(483, 483, 483))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View Student Script", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");

            PreparedStatement ps = con.prepareStatement("SELECT MatriculationNumber, Score FROM student_result_info");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String matriculationNumber = rs.getString("MatriculationNumber");
                String score = rs.getString("Score");

                PreparedStatement xs = con.prepareStatement("SELECT FirstName, LastName, OtherNames FROM student_info WHERE MatriculationNumber=?");
                xs.setString(1, matriculationNumber);
                ResultSet ts = xs.executeQuery();

                if (ts.next()) {
                    String firstName = ts.getString("FirstName");
                    String lastName = ts.getString("LastName");
                    String otherNames = ts.getString("OtherNames");

                    String data[] = {matriculationNumber, score, firstName, lastName, otherNames};
                    DefaultTableModel td = (DefaultTableModel) jTable3.getModel();
                    td.addRow(data);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try {
            String viewscoreno = jTextField23.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");

            PreparedStatement ps = con.prepareStatement("select MatriculationNumber, Score from student_result_info where MatriculationNumber=?");
            PreparedStatement xs = con.prepareStatement("select FirstName, LastName, OtherNames from student_info where MatriculationNumber=?");

            ps.setString(1, viewscoreno);
            xs.setString(1, viewscoreno);

            ResultSet rs = ps.executeQuery();
            ResultSet ts = xs.executeQuery();

            while (rs.next() && ts.next()) {
                String data[] = {rs.getString(1), ts.getString(1), ts.getString(2), ts.getString(3), rs.getString(2)};
                DefaultTableModel td = (DefaultTableModel) jTable3.getModel();
                td.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try {
            String testname = jTextField14.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the drive
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999..."); //establishing connection
            PreparedStatement ps = con.prepareStatement("delete from test_info where Test_Name = ?");
            ps.setString(1, testname);
            int rs = ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, testname + " test record succesfully deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField31KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter Number of Questions in digits.");
        }
    }//GEN-LAST:event_jTextField31KeyTyped

    private void jTextField30KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField30KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter the seconds in digits.");
        }
    }//GEN-LAST:event_jTextField30KeyTyped

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField29KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter the minutes in digits.");
        }
    }//GEN-LAST:event_jTextField29KeyTyped

    private void jTextField28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter the hours in digits.");
        }
    }//GEN-LAST:event_jTextField28KeyTyped

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try {
            String testname = jTextField14.getText();

            String noq = jTextField31.getText();
            int no_of_questions = Integer.parseInt(noq);

            String hrs = jTextField28.getText();
            int hours = Integer.parseInt(hrs);

            String mins = jTextField29.getText();
            int minutes = Integer.parseInt(mins);

            String scs = jTextField30.getText();
            int seconds = Integer.parseInt(scs);

            int totalduration = hours * 3600 + minutes * 60 + seconds;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");   //loading the drive
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                PreparedStatement ps = con.prepareStatement("insert into test_info values(?,?,?)");

                ps.setString(1, testname);
                ps.setInt(2, no_of_questions);
                ps.setInt(3, totalduration);

                int rs = ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Test set!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String question = jTextArea2.getText();
        String optionA = jTextField24.getText();
        String optionB = jTextField25.getText();
        String optionC = jTextField26.getText();
        String optionD = jTextField27.getText();
        String answer = jTextField22.getText();

        String data[] = {question, optionA, optionB, optionC, optionD, answer};
        DefaultTableModel td = (DefaultTableModel) jTable2.getModel();
        td.addRow(data);

        jTextArea2.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField22.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTextField15.setText("");
        jTextField22.setText("");
        jTextArea2.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        DefaultTableModel td = (DefaultTableModel) jTable2.getModel();
        td.setRowCount(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
            String insertQuery = "INSERT INTO test_questions VALUES (?, ?, ?, ?, ?, ?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String path = "jdbc:mysql://localhost:3306/cbt_project";
            String user = "root";
            String pass = "password999...";
            Connection con = DriverManager.getConnection(path, user, pass);
            PreparedStatement preparedStatement = con.prepareStatement(insertQuery);

            for (int row = 0; row < jTable2.getRowCount(); row++) {
                for (int col = 0; col < jTable2.getColumnCount(); col++) {
                    Object value = jTable2.getValueAt(row, col);
                    preparedStatement.setObject(col + 1, value);
                }

                preparedStatement.executeUpdate();
                //populate_table();
            }

            JOptionPane.showMessageDialog(rootPane, "Questions Uploaded");
            tableModel.setRowCount(0);
            jTextField15.setText("");
            jTextField22.setText("");
            jTextArea2.setText("");
            jTextField24.setText("");
            jTextField25.setText("");
            jTextField26.setText("");
            jTextField27.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Comma Separated Values", "csv");
        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.addChoosableFileFilter(filter);
        int open = jFileChooser1.showOpenDialog(null);
        if (open != JFileChooser.APPROVE_OPTION) {
            return;
        } else {
            String filename = jFileChooser1.getSelectedFile().getAbsolutePath().toString();
            String file = jFileChooser1.getSelectedFile().getName().toString();
            jTextField15.setText(filename);
            if (!filename.contains(".csv")) {
                filename = filename + ".csv";
            }
            try {
                String line;
                DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
                BufferedReader br = new BufferedReader(new FileReader(jFileChooser1.getSelectedFile()));
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    tableModel.addRow(data);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error Reading File");
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            String Matno = jTextField5.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the drive
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999..."); //establishing connection
            PreparedStatement ps = con.prepareStatement("delete from student_info where MatriculationNumber = ?");
            ps.setString(1, Matno);
            int rs = ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, Matno + " record succesfully deleted");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jComboBox3.setSelectedIndex(0);
            jComboBox4.setSelectedIndex(0);
            jTextField8.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
            jPasswordField2.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChars = "<>,.?/}]{[+_-)(!@#$%^&*=";
        String combination = upper + lower + num + specialChars;
        int len = 8;
        char[] rpassword = new char[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            rpassword[i] = combination.charAt(r.nextInt(combination.length()));
        }
        jPasswordField2.setText(new String(rpassword));// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        buttonGroup1.clearSelection();
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jTextField12.setText("");
        jTextField13.setText("");
        jPasswordField2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String matno = jTextField5.getText();
            String firstname = jTextField6.getText();
            String lastname = jTextField7.getText();
            String othernames = jTextField8.getText();
            String gender = null;
            if (jRadioButton3.isSelected()) {
                gender = "Male";
            } else if (jRadioButton4.isSelected()) {
                gender = "Female";
            }
            String department = jComboBox3.getSelectedItem().toString();
            String level = jComboBox4.getSelectedItem().toString();
            String email = jTextField12.getText();
            String username = jTextField13.getText();

            try {
                String password4 = jPasswordField2.getText();
                String enpass1 = Hash(password4);

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                PreparedStatement ps = con.prepareStatement("update student_info set FirstName=?, LastName=?, OtherNames=?, Gender=?, Department=?, Level=?, Email=?, Username=?, Password=? where MatriculationNumber=? ");

                ps.setString(1, firstname);
                ps.setString(2, lastname);
                ps.setString(3, othernames);
                ps.setString(4, gender);
                ps.setString(5, department);
                ps.setString(6, level);
                ps.setString(7, email);
                ps.setString(8, username);
                ps.setString(9, enpass1);
                ps.setString(10, matno);
                int rs = ps.executeUpdate();

                //sending email part
                String subject = "Username and password for " + firstname + lastname + " for the new CBT system\n";        // TODO add your handling code here:
                String receiver = email;
                String body = "Hello " + firstname + ",\nPlease find your updated username and password for the new cbt system attached in the email below.\n"
                        + "Your Email: " + email + "\n"
                        + "Your Password: " + password4 + "\n"
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
                    JOptionPane.showMessageDialog(rootPane, "Record Updated.");

                } catch (MessagingException e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String Matno = jTextField5.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the drive
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999..."); //establishing connec
            PreparedStatement ps = con.prepareStatement("select * from student_info where MatriculationNumber=?");
            ps.setString(1, Matno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText(rs.getString(4));
                String gender = rs.getString(5);
                if (gender.equalsIgnoreCase("Male")) {
                    jRadioButton3.setSelected(true);
                } else {
                    jRadioButton4.setSelected(true);
                }
                jComboBox3.setSelectedItem(rs.getString(6));
                jComboBox4.setSelectedItem(rs.getString(7));
                jTextField12.setText(rs.getString(8));
                jTextField13.setText(rs.getString(9));
                jPasswordField2.setText(rs.getString(10));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Could Not Find Student.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Matriculation Number can only contain digits.");
        }    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            String insertQuery = "INSERT INTO student_info VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_registration", "root", "password999...");
            String path = "jdbc:mysql://localhost:3306/cbt_project";
            String user = "root";
            String pass = "password999...";
            Connection con = DriverManager.getConnection(path, user, pass);
            PreparedStatement preparedStatement = con.prepareStatement(insertQuery);

            for (int row = 0; row < jTable1.getRowCount(); row++) {
                for (int col = 0; col < jTable1.getColumnCount(); col++) {
                    Object value = jTable1.getValueAt(row, col);
                    preparedStatement.setObject(col + 1, value);
                }

                preparedStatement.executeUpdate();
            }

            JOptionPane.showMessageDialog(rootPane, "Records Inserted");
            tableModel.setRowCount(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Comma Separated Values", "csv");
        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.addChoosableFileFilter(filter);
        int open = jFileChooser1.showOpenDialog(null);
        if (open != JFileChooser.APPROVE_OPTION) {
            return;
        } else {
            String filename = jFileChooser1.getSelectedFile().getAbsolutePath().toString();
            String file = jFileChooser1.getSelectedFile().getName().toString();
            jTextField10.setText(filename);
            if (!filename.contains(".csv")) {
                filename = filename + ".csv";
            }
            try {
                String line;
                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                BufferedReader br = new BufferedReader(new FileReader(jFileChooser1.getSelectedFile()));
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    tableModel.addRow(data);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error Reading File");
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTextField10.setText("");
        DefaultTableModel td = (DefaultTableModel) jTable1.getModel();
        td.setRowCount(0);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        //Auto-generated random password
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChars = "<>,.?/}]{[+_-)(!@#$%^&*=";
        String combination = upper + lower + num + specialChars;
        int len = 8;
        char[] ppassword = new char[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            ppassword[i] = combination.charAt(r.nextInt(combination.length()));
        }
        jPasswordField1.setText(new String(ppassword));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        buttonGroup1.clearSelection();
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField11.setText("");
        jPasswordField1.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String matno = jTextField4.getText();
            String firstname = jTextField1.getText();
            String lastname = jTextField2.getText();
            String othernames = jTextField3.getText();
            String gender = null;
            if (jRadioButton1.isSelected()) {
                gender = "Male";
            } else if (jRadioButton2.isSelected()) {
                gender = "Female";
            }
            String department = jComboBox1.getSelectedItem().toString();
            String level = jComboBox2.getSelectedItem().toString();
            String email = jTextField11.getText();
            String username = jTextField9.getText();

            try {

                String password1 = jPasswordField1.getText();
                String enpass = Hash(password1);

                Class.forName("com.mysql.cj.jdbc.Driver");   //loading the drive
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999...");
                PreparedStatement ps = con.prepareStatement("insert into student_info values(?,?,?,?,?,?,?,?,?,?)");

                ps.setString(1, matno);
                ps.setString(2, firstname);
                ps.setString(3, lastname);
                ps.setString(4, othernames);
                ps.setString(5, gender);
                ps.setString(6, department);
                ps.setString(7, level);
                ps.setString(8, email);
                ps.setString(9, username);
                ps.setString(10, enpass);

                int rs = ps.executeUpdate();

                //sending email section
                String subject = "Password for " + firstname + lastname + " for the new CBT system\n";        // TODO add your handling code here:
                String receiver = email;
                String body = "Hello " + firstname + ",\nPlease find your username and password for the new cbt system attached in the email below.\n"
                        + "Your Email: " + email + "\n"
                        + "Your Password: " + password1 + "\n"
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
                    JOptionPane.showMessageDialog(rootPane, "User " + firstname + " has been successfully created. Please check your email for confirmation.");

                } catch (MessagingException e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
                
                
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                buttonGroup1.clearSelection();
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jTextField11.setText("");
                jTextField9.setText("");
                jPasswordField1.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Matriculation Number can only contain digits.");
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save as CSV");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try ( FileWriter fw = new FileWriter(fileToSave);  BufferedWriter bw = new BufferedWriter(fw)) {

                for (int i = 0; i < jTable3.getRowCount(); i++) {
                    for (int j = 0; j < jTable3.getColumnCount(); j++) {
                        bw.write(jTable3.getValueAt(i, j).toString());
                        if (j < jTable3.getColumnCount() - 1) {
                            bw.write(",");  // Add comma between values
                        }
                    }
                    bw.newLine();
                }

                JOptionPane.showMessageDialog(this, "Successfully exported as CSV", "Information", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jTextField23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Matriculation Number can only contain digits.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23KeyTyped

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //String viewscriptno = jTextField16.getText();
        try {
            String viewscriptno = jTextField16.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the drive
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbt_project", "root", "password999..."); //establishing connec
            PreparedStatement ps = con.prepareStatement("select * from student_script_info where MatriculationNumber=?");
            ps.setString(1, viewscriptno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jTextArea1.append("Question: " + rs.getString(2) + "\n");
                jTextArea1.append("A. " + rs.getString(3) + "\n");
                jTextArea1.append("B. " + rs.getString(4) + "\n");
                jTextArea1.append("C. " + rs.getString(5) + "\n");
                jTextArea1.append("D. " + rs.getString(6) + "\n");
                jTextArea1.append("Correct Answer " + rs.getString(7) + "\n");
                jTextArea1.append("Student Answer " + rs.getString(8) + "\n\n");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Could Not Find Student.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            jTextArea1.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_home().setVisible(true);
            }
        });

//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Admin_home();
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
