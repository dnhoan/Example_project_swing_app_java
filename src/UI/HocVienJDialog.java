package UI;

import DAO.CourseDAO;
import DAO.LearnerDAO;
import DAO.StudentDAO;
import DAO.ThematicDAO;
import Service.AuthService;
import Service.DateService;
import Service.ImageService;
import Service.MessageService;
import Model.Course;
import Model.Learner;
import Model.Student;
import Model.Thematic;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class HocVienJDialog extends javax.swing.JFrame {

    public HocVienJDialog() {
        initComponents();
        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        btnUpdatePoint = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblLearner = new javax.swing.JTable();
        jPanel33 = new javax.swing.JPanel();
        txtSearchBox = new javax.swing.JTextField();
        btnAddToStudent = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        cboThematic = new javax.swing.JComboBox<>();
        jPanel32 = new javax.swing.JPanel();
        cboCourse = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Mã HV", "Mã NH", "Họ tên", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tblStudent);

        btnUpdatePoint.setText("Cập nhật điểm");
        btnUpdatePoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePointActionPerformed(evt);
            }
        });

        btnRemove.setText("Xóa khỏi khóa học");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdatePoint)))
                .addContainerGap())
        );

        jPanel27Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRemove, btnUpdatePoint});

        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdatePoint)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel27Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRemove, btnUpdatePoint});

        tabs.addTab("Học viên", jPanel27);

        tblLearner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã NH", "Ho và tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLearnerMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(tblLearner);

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        txtSearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchBoxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchBox)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddToStudent.setText("Thêm vào khóa học");
        btnAddToStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddToStudent))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(btnAddToStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabs.addTab("Người học", jPanel28);

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chuyên đề", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 102, 255))); // NOI18N

        cboThematic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThematic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThematicItemStateChanged(evt);
            }
        });
        cboThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThematicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboThematic, 0, 241, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboThematic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khóa học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 102, 255))); // NOI18N
        jPanel32.setForeground(new java.awt.Color(153, 102, 255));
        jPanel32.setToolTipText("");

        cboCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCourseItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboCourse, 0, 241, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel31, jPanel32});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThematicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboThematicActionPerformed

    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked

    }//GEN-LAST:event_tblStudentMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        this.deleteStudent();

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdatePointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePointActionPerformed
        this.updatePoint();
    }//GEN-LAST:event_btnUpdatePointActionPerformed

    private void btnAddToStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToStudentActionPerformed
        this.insertStudent();
    }//GEN-LAST:event_btnAddToStudentActionPerformed

    private void tblLearnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLearnerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblLearnerMouseClicked

    private void cboThematicItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThematicItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            this.fillToComboCourse();
        }
    }//GEN-LAST:event_cboThematicItemStateChanged

    private void cboCourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCourseItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            this.fillToTableLearner();
            this.fillToTableStudent();
        }
    }//GEN-LAST:event_cboCourseItemStateChanged

    private void txtSearchBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBoxKeyTyped
        this.fillToTableLearner();
    }//GEN-LAST:event_txtSearchBoxKeyTyped

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HocVienJDialog().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToStudent;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdatePoint;
    private javax.swing.JComboBox<String> cboCourse;
    private javax.swing.JComboBox<String> cboThematic;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblLearner;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables

    CourseDAO courseDAO = new CourseDAO();
    LearnerDAO learnerDAO = new LearnerDAO();
    StudentDAO studentDAO = new StudentDAO();
    ThematicDAO thematicDAO = new ThematicDAO();
    DefaultTableModel tblLearnerModel;
    DefaultTableModel tblStudentModel;
    List<Learner> learnersList = new ArrayList<>();
    List<Student> studentsList = new ArrayList<>();
    List<Thematic> thematicsList = new ArrayList<>();
    List<Course> coursesList = new ArrayList<>();

    void init() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(ImageService.getAppIcon());
        this.setTitle("Quản lý học viên");
        this.fillToComboThematic();
    }

    void fillToComboThematic() {
        thematicsList = thematicDAO.selectAll();
        DefaultComboBoxModel cboThematicModel = (DefaultComboBoxModel) cboThematic.getModel();
        cboThematicModel.removeAllElements();
        thematicsList.forEach(thematic -> {
            cboThematicModel.addElement(thematic);
        });
        this.fillToComboCourse();
    }

    void fillToComboCourse() {
        Thematic thematic = (Thematic) cboThematic.getSelectedItem();
        String macd = thematic.getMaCD();
        coursesList = this.courseDAO.selectByThematic(macd);
        DefaultComboBoxModel cboCourseModel = (DefaultComboBoxModel) cboCourse.getModel();
        cboCourseModel.removeAllElements();
        if (coursesList.size() > 0) {
            coursesList.forEach(course -> {
                cboCourseModel.addElement(course);
            });
        }
        this.fillToTableStudent();
    }

    void fillToTableStudent() {
        DefaultTableModel tblStudentModel = (DefaultTableModel) tblStudent.getModel();
        tblStudentModel.setRowCount(0);
        Course course = (Course) cboCourse.getSelectedItem();
        if (course != null) {
            int makh = course.getMaKH();
            studentsList = this.studentDAO.selectStudentByCourse(makh);
            for (int i = 0; i < studentsList.size(); i++) {
                Student student = studentsList.get(i);
                String hoten = learnerDAO.selectByID(student.getMaNH()).getHoTen();
                tblStudentModel.addRow(new Object[]{
                    i + 1,
                    student.getMaHV(),
                    student.getMaNH(),
                    hoten,
                    student.getDiem()
                });
            }
        }
        this.fillToTableLearner();
    }

    void fillToTableLearner() {
        DefaultTableModel tblLearnerModel = (DefaultTableModel) tblLearner.getModel();
        tblLearnerModel.setRowCount(0);
        Course course = (Course) cboCourse.getSelectedItem();
        if (course != null) {
            int makh = course.getMaKH();
            String keyWord = txtSearchBox.getText();
            learnersList = this.learnerDAO.selectByLearnersNotInCourse(makh, keyWord);
            learnersList.forEach(learner -> {
                tblLearnerModel.addRow(new Object[]{
                    learner.getMaNH(),
                    learner.getHoTen(),
                    learner.isGioiTinh() ? "Nam" : "Nữ",
                    DateService.toString(learner.getNgaySinh(), "dd/MM/yyyy"),
                    learner.getDienThoai(),
                    learner.getEmail()
                });
            });
        }
    }

    void insertStudent() {
        Course course = (Course) cboCourse.getSelectedItem();
        try {
            for (int row : tblLearner.getSelectedRows()) {
                Student student = new Student();
                student.setMaKH(course.getMaKH());
                student.setDiem(0);
                student.setMaNH((String) tblLearner.getValueAt(row, 0));
                studentDAO.insert(student);
            }
            this.fillToTableStudent();
            this.tabs.setSelectedIndex(0);
            MessageService.alert(this, "Thêm học viên thành công");
        } catch (Exception e) {
            MessageService.alert(this, "Thêm học viên thất bại");
        }
    }

    void deleteStudent() {
        if (!AuthService.isManager()) {
            MessageService.alert(this, "Bạn không có quyền xóa học viên này");
        } else {
            if (MessageService.confirm(this, "Bạn có thực sự muốn xóa học viên đang chọn không")) {

                try {
                    for (int row : tblStudent.getSelectedRows()) {
                        int mahv = (int) tblStudent.getValueAt(row, 1);
                        studentDAO.delete(mahv);
                    }
                    MessageService.alert(this, "Xóa học viên thành công");
                    this.fillToTableStudent();
                } catch (Exception e) {
                    MessageService.alert(this, "Xóa học viên thất bại");
                    e.printStackTrace();
                }
            }
        }
    }

    void updatePoint() {
        try {
            for (int i = 0; i < tblStudent.getRowCount(); i++) {
                try {
                    float diem = (float) tblStudent.getValueAt(i, 4);
                    if (diem < 0 || diem > 10) {
                        MessageService.alert(this, "Nhập điểm trong khoảng 0-10");
                        tblStudent.setRowSelectionInterval(i, i);
                        return;
                    }
                    int mahv = (int) tblStudent.getValueAt(i, 1);
                    Student student = studentDAO.selectByID(mahv);
                    student.setDiem(diem);
                    studentDAO.update(student);
                } catch (Exception e) {
                    MessageService.alert(this, "Vui lòng nhập điểm bằng số");
                    tblStudent.setRowSelectionInterval(i, i);
                    return;
                }
            }
            this.fillToTableStudent();
            MessageService.alert(this, "Cập nhật điểm thành công");
        } catch (Exception e) {
            MessageService.alert(this, "Cập nhật điểm thất bại");
            e.printStackTrace();
        }
    }
}
