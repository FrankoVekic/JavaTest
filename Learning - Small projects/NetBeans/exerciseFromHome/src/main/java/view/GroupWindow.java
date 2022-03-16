package view;

import controller.ProcessCourse;
import controller.ProcessGroup;
import controller.ProcessProfessor;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.edunova.model.Course;
import model.edunova.model.Group;
import model.edunova.model.Professor;
import util.CatchException;
import util.Util;

public class GroupWindow extends javax.swing.JFrame {

    private ProcessGroup process;

    public GroupWindow() {
        initComponents();
        process = new ProcessGroup();
        setTitle(Util.getTitle(" Groups"));
        load();
        loadCourses();
        loadProfessors();
        
    }
    
    private void loadProfessors(){
         DefaultComboBoxModel<Professor> ms = new DefaultComboBoxModel<>();
        Professor professor = new Professor();
        professor.setId(Long.valueOf(0));
        professor.setName("Not");
        professor.setSurname("chosen");
        ms.addElement(professor);
        new ProcessProfessor().read().forEach(s->{ms.addElement(s);});
        cmbProfessors.setModel(ms);
    }
    
    private void loadCourses(){
        DefaultComboBoxModel<Course> ms = new DefaultComboBoxModel<>();
        Course course = new Course();
        course.setId(Long.valueOf(0));
        course.setName("Not chosen.");
        ms.addElement(course);
        new ProcessCourse().read().forEach(s->{ms.addElement(s);});
        cmbCourses.setModel(ms);
    }

    private void load() {
        DefaultListModel<Group> g = new DefaultListModel<>();
        List<Group> entities = process.read();
        
        for (Group p : entities) {
            g.addElement(p);
        }
        lstEntities.setModel(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntities = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbCourses = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbProfessors = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntities.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitiesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntities);

        jLabel1.setText("Name");

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

        jLabel2.setText("Course");

        jLabel3.setText("Professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbCourses, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnCreate)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDelete))
                        .addComponent(cmbProfessors, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel2))
                .addContainerGap(621, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProfessors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreate)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
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
            
        
    }//GEN-LAST:event_lstEntitiesValueChanged

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            process.setEntity(new Group());
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
        e.setCourse((Course)cmbCourses.getSelectedItem());
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (process.getEntity() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "You must select a course first.");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<Course> cmbCourses;
    private javax.swing.JComboBox<Professor> cmbProfessors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Group> lstEntities;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
