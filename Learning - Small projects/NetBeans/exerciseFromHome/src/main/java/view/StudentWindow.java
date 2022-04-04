package view;

import controller.ProcessStudent;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.edunova.model.Professor;
import model.edunova.model.Student;
import util.CatchException;
import util.Util;

public class StudentWindow extends javax.swing.JFrame {

    private ProcessStudent process;

    public StudentWindow() {
        initComponents();
        process = new ProcessStudent();
        lstEntities.setCellRenderer(new PersonView());
        setTitle(Util.getTitle(" Students"));
        
    }

    private void load() {
        DefaultListModel<Student> s = new DefaultListModel<>();
        List<Student> entities;
        if(chbSurname.isSelected()){
            entities = process.readBeginSurname(txtSearch.getText());
        }
        else {
           entities = process.read(txtSearch.getText());
        }
        
        Collections.sort(entities, new StudentComparator());
        
        
        for (Student p : entities) {
            s.addElement(p);
        }
        lstEntities.setModel(s);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnChangeSurnames = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtNewSurname = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntities = new javax.swing.JList<>();
        chbSurname = new javax.swing.JCheckBox();
        txtContractCount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMassive = new javax.swing.JTextPane();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Search for a name, surname or OIB.");

        btnChangeSurnames.setText("Change all");
        btnChangeSurnames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSurnamesActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel8.setText("Change all surnames");

        lstEntities.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntities.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitiesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntities);

        chbSurname.setText("Beginning of surname");

        txtContractCount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("Surname");

        jLabel6.setText("Generate");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        txtSurname.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setText("Email");

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setText("OIB");

        txtOib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOibActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel5.setText("Contract Count");

        jScrollPane2.setViewportView(txtMassive);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addComponent(jLabel7)
                    .addComponent(chbSurname)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNewSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChangeSurnames))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtName)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txtSurname)
                        .addComponent(txtEmail)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addComponent(txtOib)
                        .addComponent(txtContractCount, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(7, 7, 7)
                .addComponent(chbSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeSurnames))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContractCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreate)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitiesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitiesValueChanged
        if (evt.getValueIsAdjusting() || lstEntities.getSelectedValue() == null) {
            return;
        }
        
        process.setEntity(lstEntities.getSelectedValue());
        var e = process.getEntity();
        txtName.setText(e.getName());
        txtSurname.setText(e.getSurname());
        txtEmail.setText(e.getEmail());
        txtOib.setText(e.getOib());
        txtContractCount.setText(e.getContractCount());
            
        if(e.getGroups()!=null && e.getGroups().size()>0){
            btnDelete.setEnabled(false);
        }
        else {
            btnDelete.setEnabled(true);
        }
    }//GEN-LAST:event_lstEntitiesValueChanged

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            process.setEntity(new Student());
            checkData();
            process.create();
            load();
        } catch (CatchException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }

    private void checkData() {
        var e = process.getEntity();
        e.setName(txtName.getText());
        e.setSurname(txtSurname.getText());
        e.setEmail(txtEmail.getText());
        e.setOib(txtOib.getText());
        e.setContractCount(txtContractCount.getText());
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (process.getEntity() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "You must select a course to change.");
            return;
        }

        checkData();
        try {
            process.update();
            load();
        } catch (CatchException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(process.getEntity()==null){
            JOptionPane.showMessageDialog(getRootPane(), "You have to select a course first.");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(getRootPane(), 
                "Are you sure you want to delete \"" + process.getEntity().getName() + "\"?", "Delete", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }
        
        try {
            process.delete();
            load();
        } catch (CatchException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtOibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOibActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        txtOib.setText(Util.generateOib());
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        load();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnChangeSurnamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSurnamesActionPerformed
        DefaultListModel<Student> s = (DefaultListModel<Student>) lstEntities.getModel();
        Student student;
        for(int i = 0; i<s.size();i++ ){
            student = s.getElementAt(i);
            student.setSurname(txtNewSurname.getText().trim());
            process.setEntity(student);
            try {
                process.update();
            } catch (CatchException ce) {
            }
            txtSearch.setText(txtNewSurname.getText());
            chbSurname.setSelected(true);
            load();
        }
    }//GEN-LAST:event_btnChangeSurnamesActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String[] rows = txtMassive.getText().split("\n");
        String[] data;
        String[] nameSurname;
        Student s;
        
        for(String p : rows){
            if(p.trim().isEmpty()){
                continue;
            }
            data = p.split("\t");
            nameSurname = data[0].split(" ");
            s = new Student();
            s.setName(nameSurname[0]);
            s.setSurname(nameSurname[1]);
            s.setEmail(data[1]);
            s.setContractCount("2015/22");
            s.setOib(Util.generateOib());
            
            process.setEntity(s);
            try {
                process.create();
            } catch (CatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeSurnames;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chbSurname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Student> lstEntities;
    private javax.swing.JTextField txtContractCount;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextPane txtMassive;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNewSurname;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
