/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import assignment.Profile;
import assignment.ProfileHist;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shaiz Akhtar
 */
public class DisplayEmployee extends javax.swing.JPanel {

    /**
     * Creates new form DisplayEmployee
     */
    ProfileHist history;
    public DisplayEmployee(ProfileHist history) {
        
        initComponents();
        this.history=history;
        jEmployeeId.setEditable(false);
        
        adddata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPhoto = new javax.swing.JLabel();
        jEmployeeId = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jAge = new javax.swing.JTextField();
        jLevel = new javax.swing.JTextField();
        jTeamInfo = new javax.swing.JTextField();
        jDesignation = new javax.swing.JTextField();
        jPhoneNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jGender = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jbtnView = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSearch = new javax.swing.JTextField();
        jFind = new javax.swing.JButton();
        jRefresh = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(700, 900));

        jLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLevelActionPerformed(evt);
            }
        });

        jTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeamInfoActionPerformed(evt);
            }
        });

        jDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDesignationActionPerformed(evt);
            }
        });

        jPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPhoneNumberActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Employee Id");

        jEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Age");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Email");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Start Date");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Level");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Team Info");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Designation");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Phone Number");

        jGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Upload Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAge, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebtn)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(475, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel12)
                                                            .addComponent(jPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addComponent(jDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(updatebtn)
                                                .addContainerGap())
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(JPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(242, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Display Employee Details");

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start date", "Level", "Team Info", "Designation", "phone number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        jbtnView.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbtnView.setText("View");
        jbtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Employee Id", "Level", "Team Info", "Designation", "Phone Number" }));

        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });

        jFind.setText("Find");
        jFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindActionPerformed(evt);
            }
        });

        jRefresh.setText("Refresh");
        jRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnView)
                .addGap(18, 18, 18)
                .addComponent(jbtnDelete)
                .addGap(126, 126, 126))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jFind)
                        .addGap(18, 18, 18)
                        .addComponent(jRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFind)
                    .addComponent(jRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnView)
                    .addComponent(jbtnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLevelActionPerformed

    private void jTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeamInfoActionPerformed

    private void jDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDesignationActionPerformed

    private void jPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPhoneNumberActionPerformed

    private void jEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow=tblEmp.getSelectedRow();
        if(selectedrow<0)
        {
            JOptionPane.showMessageDialog(this,"No rows are selected to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        Profile selectedprofile=(Profile) model.getValueAt(selectedrow, 0);
        history.deleteProfile(selectedprofile);
        JOptionPane.showMessageDialog(this,"Selected row is deleted successfully");
        adddata();
        
       jName.setText(""); //TODO
       jEmployeeId.setText("");
       jAge.setText("");
       jGender.setText("");
       jDateChooser1.setDate(null);
       jLevel.setText("");
       jTeamInfo.setText("");
       jDesignation.setText("");
       jPhoneNumber.setText("");
       jEmail.setText("");
      JPhoto.setIcon(null);
      jSearch.setText("");
       
        
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenderActionPerformed

    private void jbtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedrow=tblEmp.getSelectedRow();
       
        if(selectedrow<0)
        {
            JOptionPane.showMessageDialog(this,"No rows are selected");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        Profile selectedprofile=(Profile) model.getValueAt(selectedrow, 0);
        jName.setText(selectedprofile.getName());
        jEmployeeId.setText(String.valueOf(selectedprofile.getEmpId()));
        jAge.setText(String.valueOf(selectedprofile.getAge()));
        jGender.setText(selectedprofile.getGender());
        jDateChooser1.setDate(selectedprofile.getStartDate());
        jLevel.setText(selectedprofile.getLevel());
        jTeamInfo.setText(selectedprofile.getTeamInfo());
        jDesignation.setText(selectedprofile.getPositionTitle());
        jPhoneNumber.setText(String.valueOf(selectedprofile.getPhoneNumber()));
        jEmail.setText(selectedprofile.getEmail());
        JPhoto.setIcon(selectedprofile.getPhoto());
//        ImageDisplay();
        jSearch.setText("");
        
        
    }//GEN-LAST:event_jbtnViewActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchActionPerformed

    private boolean genderValidation(String gender){
        String regex = "(Male|Female|Other)"; 
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(gender);
        return matcher.matches();
    
    }
    
    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
       //System.out.println("Sta");
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        model.setRowCount(0);
        if(jbtnView.isValid()){
        String name =jName.getText();
        
        int empid= Integer.parseInt(jEmployeeId.getText());
       
       
        
        
        
        
        
        Date date = jDateChooser1.getDate();
        String level =jLevel.getText();
        String team =jTeamInfo.getText();
        String designation =jDesignation.getText();
        
        
        String email =jEmail.getText();
        
        
        
        
        
        ArrayList<Profile> profileHist = history.getHistory();
        Profile tempEmployee = new Profile();
        
        tempEmployee.setName(name);
        tempEmployee.setEmpId(empid);
         try{
            
        int age= Integer.parseInt(jAge.getText());
        
        if(age>18 && age<60)
        {
           tempEmployee.setAge(age);
         
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Age should be more than 18 and lessthan 60");
            return;
        }
        
        
        }
        
        
        
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null, "Please enter a valid age and age should be greater than 18");  
            return;
        }
        String gender =jGender.getText();
        if(!genderValidation(gender))
        {
             JOptionPane.showMessageDialog(jComboBox1, "Please enter valid gender");
             return;
        }
        tempEmployee.setGender(gender);
        tempEmployee.setStartDate(date);
        tempEmployee.setLevel(level);
        tempEmployee.setTeamInfo(team);
        tempEmployee.setPositionTitle(designation);
           try{     
         String phNumber = jPhoneNumber.getText();      
           int length = 0;
                
          if(phNumber.length()==10) {
              tempEmployee.setPhoneNumber(phNumber);
          } 
          else {
              JOptionPane.showMessageDialog(this, "Please enter valid phone number");
              return;
          }
        } catch(Exception e) {
            
            JOptionPane.showMessageDialog(this, "Please enter valid phone number");
        }

        
        
        tempEmployee.setEmail(email);
        tempEmployee.setPhoto((ImageIcon)JPhoto.getIcon());
        JOptionPane.showConfirmDialog(jComboBox1, "Please Confirm to update");
        history.updateProfile(tempEmployee, profileHist); //update
        adddata(); //refresh
        
        
        JOptionPane.showMessageDialog(this,"Data updated successfully");
        
       jName.setText(""); //TODO
       jEmployeeId.setText("");
       jAge.setText("");
       jGender.setText("");
       jDateChooser1.setDate(null);
       jLevel.setText("");
       jTeamInfo.setText("");
       jDesignation.setText("");
       jPhoneNumber.setText("");
       jEmail.setText("");
      JPhoto.setIcon(null);
      jSearch.setText("");
        
        }
        
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void jFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindActionPerformed
        // TODO add your handling code here:
        ArrayList<Profile> tempList = new ArrayList<>();
        //drop down value & searchbox value
        String dropDownValue = jComboBox1.getSelectedItem().toString();
        String searchByValue = jSearch.getText();
        //ProfileHist method call
        if(dropDownValue.equals("Name")){
            tempList = history.searchByName(searchByValue, tempList, history.getHistory());
        } 
        else if (dropDownValue.equals("Employee Id"))
        {
            tempList = history.searchById(searchByValue, tempList, history.getHistory());
        }
        else if (dropDownValue.equals("Team Info"))
        {
            tempList = history.searchByTeam(searchByValue, tempList, history.getHistory());
        }
        else if(dropDownValue.equals("Designation"))
        {
            tempList=history.searchByDesignation(searchByValue,tempList,history.getHistory());
        }
        else if(dropDownValue.equals("Level"))
        {
            tempList=history.searchByLevel(searchByValue,tempList,history.getHistory());
        }
        else if(dropDownValue.equals("Phone Number"))
        {
            tempList=history.searchByPhone(searchByValue,tempList,history.getHistory());
        }
        
        
        if(tempList.isEmpty()){
            JOptionPane.showMessageDialog(null, "No Data Found!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        model.setRowCount(0);
        

        for (Profile p: tempList)
        {
            Object[] row = new Object[10];
            row[0]= p;
            row[1]= p.getEmpId();
            row[2]=p.getAge();
            row[3]=p.getGender();
            String startDate = new SimpleDateFormat("yyyy-MM-dd").format(p.getStartDate());
            row[4]=startDate;
            row[5]=p.getLevel();
            row[6]=p.getTeamInfo();
            row[7]=p.getPositionTitle();
            row[8]=p.getPhoneNumber();
            row[9]=p.getEmail();
            model.addRow(row);
        }
        
    }//GEN-LAST:event_jFindActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File pic = chooser.getSelectedFile();
        if(pic==null)
        {
            JOptionPane.showMessageDialog(null, "Please upload image ");
            return;
        }
        String filename = pic.getAbsolutePath();
        ImageIcon icon = new ImageIcon(filename);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon dimension = new ImageIcon(imgScale);
        JPhoto.setIcon( dimension);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshActionPerformed
        // TODO add your handling code here:
        adddata();
        jSearch.setText("");
        
    }//GEN-LAST:event_jRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JPhoto;
    private javax.swing.JTextField jAge;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JTextField jDesignation;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jEmployeeId;
    private javax.swing.JButton jFind;
    private javax.swing.JTextField jGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLevel;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPhoneNumber;
    private javax.swing.JButton jRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTeamInfo;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnView;
    private javax.swing.JTable tblEmp;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    private void adddata() {
        
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        model.setRowCount(0);
        for (Profile p: history.getHistory())
        {
            Object[] row = new Object[10];
            row[0]= p;
            row[1]= p.getEmpId();
            row[2]=p.getAge();
            row[3]=p.getGender();
            String startDate = new SimpleDateFormat("yyyy-MM-dd").format(p.getStartDate());
            row[4]=startDate;
            row[5]=p.getLevel();
            row[6]=p.getTeamInfo();
            row[7]=p.getPositionTitle();
            row[8]=p.getPhoneNumber();
            row[9]=p.getEmail();
            model.addRow(row);
           
           
        }
        }
        
       
}
