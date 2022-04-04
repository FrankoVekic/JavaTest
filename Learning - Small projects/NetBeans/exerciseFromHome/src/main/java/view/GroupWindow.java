package view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controller.ProcessCourse;
import controller.ProcessGroup;
import controller.ProcessProfessor;
import controller.ProcessStudent;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.edunova.model.Course;
import model.edunova.model.Group;
import model.edunova.model.Professor;
import model.edunova.model.Student;
import util.CatchException;
import util.Util;

public class GroupWindow extends javax.swing.JFrame {

    private ProcessGroup process;
    private ProcessStudent processStudent;

    public GroupWindow() {
        initComponents();
        process = new ProcessGroup();
        processStudent = new ProcessStudent();
        setTitle(Util.getTitle(" Groups"));
        load();
        loadCourses();
        loadProfessors();
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
        dpBeginningDate.setSettings(dps);
        lstStudentsInGroup.setCellRenderer(new StudentView());

    }

    private void loadProfessors() {
        DefaultComboBoxModel<Professor> ms = new DefaultComboBoxModel<>();
        Professor professor = new Professor();
        professor.setId(Long.valueOf(0));
        professor.setName("Not");
        professor.setSurname("chosen");
        ms.addElement(professor);
        new ProcessProfessor().read().forEach(s -> {
            ms.addElement(s);
        });
        cmbProfessors.setModel(ms);
    }

    private void loadCourses() {
        DefaultComboBoxModel<Course> ms = new DefaultComboBoxModel<>();
        Course course = new Course();
        course.setId(Long.valueOf(0));
        course.setName("Not chosen.");
        ms.addElement(course);
        new ProcessCourse().read().forEach(s -> {
            ms.addElement(s);
        });
        cmbCourses.setModel(ms);
    }
    
    private void loadStudents(){
        DefaultListModel<Student> s = new DefaultListModel<>();
        List<Student> entities;
        
        if(chbSurname.isSelected()){
            entities = processStudent.readBeginSurname(txtSearch.getText().trim());
        }else {
            entities = processStudent.read(txtSearch.getText());
        }
        
        Collections.sort(entities, new StudentComparator());
    
        for(Student p : entities){
            s.addElement(p);
        }
        lstStudentsInSchool.setModel(s);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstStudentsInSchool = new javax.swing.JList<>();
        chbSurname = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStudentsInGroup = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        btnExportJson = new javax.swing.JButton();
        btnSendEmail = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        dpBeginningDate = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        cmbCourses = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntities = new javax.swing.JList<>();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        cmbProfessors = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRemoveStudent = new javax.swing.JButton();
        btnAddStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Search for a name, surname or OIB.");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        jScrollPane3.setViewportView(lstStudentsInSchool);

        chbSurname.setText("Beginning of surname");

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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(lstStudentsInGroup);

        jLabel5.setText("Students in Group");

        btnExportJson.setText("Export JSON");
        btnExportJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportJsonActionPerformed(evt);
            }
        });

        btnSendEmail.setText("Send Email");
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExportJson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSendEmail)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExportJson)
                    .addComponent(btnSendEmail)))
        );

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Course");

        jLabel3.setText("Professor");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lstEntities.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntities.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitiesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntities);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setText("Beginning date");

        jLabel1.setText("Name");

        jLabel6.setText("Groups");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpBeginningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbCourses, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnCreate)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnUpdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnDelete))
                                .addComponent(cmbProfessors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpBeginningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreate)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))))
                .addContainerGap())
        );

        btnRemoveStudent.setText(">>");
        btnRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStudentActionPerformed(evt);
            }
        });

        btnAddStudent.setText("<<");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddStudent)
                .addGap(51, 51, 51)
                .addComponent(btnRemoveStudent)
                .addGap(111, 111, 111))
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
        if (e.getCourse() == null) {
            cmbCourses.setSelectedIndex(0);
        } else {
            cmbCourses.setSelectedItem(e.getCourse());
        }
        cmbCourses.setSelectedItem(e.getCourse());

        if (e.getProfessor() == null) {
            cmbProfessors.setSelectedIndex(0);
        } else {
            cmbProfessors.setSelectedItem(e.getProfessor());
        }

        if (e.getBeginningDate() != null) {
            dpBeginningDate.setDate(e.getBeginningDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            dpBeginningDate.setDate(null);
        }

        DefaultListModel<Student> s = new DefaultListModel<>();
        if (e.getStudents() != null) {
           Collections.sort(e.getStudents(),new StudentComparator());
          //  e.getStudents().forEach(p -> {
           //     s.addElement(p);
          //  });
          s.addAll(e.getStudents());
        }
        lstStudentsInGroup.setModel(s);

    }//GEN-LAST:event_lstEntitiesValueChanged

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            if (process.getEntity() == null) {
                process.setEntity(new Group());
            }
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
        e.setCourse((Course) cmbCourses.getSelectedItem());
        e.setProfessor((Professor) cmbProfessors.getSelectedItem());
        if(dpBeginningDate.getDate()!=null){
            e.setBeginningDate(Date.from(dpBeginningDate.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        }
        else {
            e.setBeginningDate(null);
        }

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
        if (process.getEntity() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "You have to select a course first.");
            return;
        }

        if (JOptionPane.showConfirmDialog(getRootPane(),
                "Are you sure you want to delete \"" + process.getEntity().getName() + "\"?", "Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            process.delete();
            load();
        } catch (CatchException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadStudents();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loadStudents();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        DefaultListModel<Student> m;
        
        if(process.getEntity()!=null){
            m = (DefaultListModel<Student>)lstStudentsInGroup.getModel();
        }else {
            process.setEntity(new Group());
            process.getEntity().setStudents(new ArrayList<>());
            checkData();
            m = new DefaultListModel<>();
            lstStudentsInGroup.setModel(m);
        }
        
        if(process.getEntity().getStudents()==null){
            process.getEntity().setStudents(new ArrayList<>());
        }
        
        for(Student p : lstStudentsInSchool.getSelectedValuesList()){
            if(!studentExistsInGroup(m, p)){
                process.getEntity().getStudents().add(p);
                m.addElement(p);
            }
        }
        lstStudentsInGroup.repaint();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStudentActionPerformed
        DefaultListModel<Student> s = (DefaultListModel<Student>)lstStudentsInGroup.getModel();
        for(Student p : lstStudentsInGroup.getSelectedValuesList()){
            s.removeElement(p);
            for(Student mp : process.getEntity().getStudents()){
                if(mp.getId().equals(p.getId())){
                    process.getEntity().getStudents().remove(mp);
                    break;
                }
            }
            process.getEntity().getStudents().removeAll(lstStudentsInGroup.getSelectedValuesList());
            
        }
        lstStudentsInGroup.repaint();
    }//GEN-LAST:event_btnRemoveStudentActionPerformed

    private void btnExportJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportJsonActionPerformed
        ExclusionStrategy strategy = new ExclusionStrategy(){
            @Override
            public boolean shouldSkipField(FieldAttributes fa) {
               if(fa.getDeclaringClass()==Course.class && fa.getName().equals("groups")){
                   return true;
               }
               if(fa.getDeclaringClass()==Professor.class && fa.getName().equals("groups")){
                   return true;
               }
               if(fa.getDeclaringClass()==Student.class && fa.getName().equals("groups")){
                   return true;
               }
               return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> type) {
               return false;
            }
            
        };
        
        Gson gson = new GsonBuilder()
                .setExclusionStrategies(strategy)
                .setPrettyPrinting()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .create();
        
        
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        jfc.setSelectedFile(new File(System.getProperty("user.home") +
                File.separator + "groups.json"));
        if(jfc.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(jfc.getSelectedFile(), StandardCharsets.UTF_8));
                
                writer.write(gson.toJson(process.read()));
                writer.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnExportJsonActionPerformed

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        new GroupSendEmail(process.getEntity().getStudents()).setVisible(true);
    }//GEN-LAST:event_btnSendEmailActionPerformed

    private boolean studentExistsInGroup(DefaultListModel<Student> m, Student p) {
        for(int i=0;i<m.size();i++){
            if(m.get(i).getId().equals(p.getId())){
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExportJson;
    private javax.swing.JButton btnRemoveStudent;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chbSurname;
    private javax.swing.JComboBox<Course> cmbCourses;
    private javax.swing.JComboBox<Professor> cmbProfessors;
    private com.github.lgooddatepicker.components.DatePicker dpBeginningDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Group> lstEntities;
    private javax.swing.JList<Student> lstStudentsInGroup;
    private javax.swing.JList<Student> lstStudentsInSchool;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}
