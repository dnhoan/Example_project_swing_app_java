package UI;

import DAO.EmployeeDAO;
import Service.AuthService;
import Service.ImageService;
import Service.MessageService;
import Service.ValidateService;
import Model.Employee;
import Model.ValidConstrain;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class NhanVienJDialog extends javax.swing.JFrame {

    public NhanVienJDialog() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanvien = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnFirstIndex = new javax.swing.JButton();
        btnPreviousIndex = new javax.swing.JButton();
        btnNextIndex = new javax.swing.JButton();
        btnLastIndex = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Quản lý nhân viên quản trị");

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NV", "Mật khẩu", "Họ và tên", "Vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách", jPanel1);

        jLabel2.setText("Mã nhân viên");

        jLabel3.setText("Mật khẩu");

        jLabel4.setText("Xác nhận mật khẩu");

        jLabel5.setText("Họ và tên");

        jLabel6.setText("Vai trò");

        buttonGroup1.add(rdoTruongPhong);
        rdoTruongPhong.setText("Trưởng phòng");

        buttonGroup1.add(rdoNhanvien);
        rdoNhanvien.setText("Nhân viên");

        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd);

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnFirstIndex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFirstIndex.setText("|<");
        btnFirstIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstIndexActionPerformed(evt);
            }
        });
        jPanel4.add(btnFirstIndex);

        btnPreviousIndex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPreviousIndex.setText("<<");
        btnPreviousIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousIndexActionPerformed(evt);
            }
        });
        jPanel4.add(btnPreviousIndex);

        btnNextIndex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNextIndex.setText(">>");
        btnNextIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextIndexActionPerformed(evt);
            }
        });
        jPanel4.add(btnNextIndex);

        btnLastIndex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLastIndex.setText(">|");
        btnLastIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastIndexActionPerformed(evt);
            }
        });
        jPanel4.add(btnLastIndex);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtManv, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdoTruongPhong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNhanvien))
                            .addComponent(txtConfirmPassword)
                            .addComponent(txtPassword))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHoTen, txtManv});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTruongPhong)
                    .addComponent(rdoNhanvien))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtHoTen, txtManv});

        tabs.addTab("Cập nhật", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextIndexActionPerformed
        next();
    }//GEN-LAST:event_btnNextIndexActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblEmployee.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (validateForm(false)) {
            insert();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validateForm(false)) {
            update();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstIndexActionPerformed
        first();
    }//GEN-LAST:event_btnFirstIndexActionPerformed

    private void btnPreviousIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousIndexActionPerformed
        previous();
    }//GEN-LAST:event_btnPreviousIndexActionPerformed

    private void btnLastIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastIndexActionPerformed
        last();
    }//GEN-LAST:event_btnLastIndexActionPerformed

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
//            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NhanVienJDialog().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirstIndex;
    private javax.swing.JButton btnLastIndex;
    private javax.swing.JButton btnNextIndex;
    private javax.swing.JButton btnPreviousIndex;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNhanvien;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtManv;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    EmployeeDAO employeeDAO = new EmployeeDAO();
    int row = -1;

    void init() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Quản lý nhân viên");
        rdoTruongPhong.setSelected(true);
        setIconImage(ImageService.getAppIcon());
        fillTable();
        this.updateStatus();
    }

    List<Employee> listEmp = new ArrayList<>();

    void fillTable() {
        DefaultTableModel modelTable = (DefaultTableModel) tblEmployee.getModel();
        modelTable.setRowCount(0);
        try {
            this.listEmp = employeeDAO.selectAll();
            this.listEmp.stream().forEachOrdered((Employee emp) -> {
                modelTable.addRow(new Object[]{
                    emp.getMaNV(),
                    emp.getMatKhau(),
                    emp.getHoTen(),
                    emp.isVaiTro() ? "Trưởng phòng" : "Nhân viên"
                });
            });
        } catch (Exception e) {
            MessageService.alert(this, "Lỗi try vấn dữ liệu");
        }
    }

    void setForm(Employee emp) {
        txtManv.setText(emp.getMaNV());
        txtHoTen.setText(emp.getHoTen());
        txtPassword.setText(emp.getMatKhau());
        txtConfirmPassword.setText(emp.getMatKhau());
        if (emp.isVaiTro()) {
            rdoTruongPhong.setSelected(true);
        } else {
            rdoNhanvien.setSelected(true);
        }
    }

    void clearForm() {
        Employee emp = new Employee();
        this.setForm(emp);
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String manv = (String) tblEmployee.getValueAt(this.row, 0);
        Employee emp = employeeDAO.selectByID(manv);
        this.setForm(emp);
        tabs.setSelectedIndex(1);
        this.updateStatus();
    }

    Employee getForm() {
        Employee emp = new Employee();
        emp.setMaNV(txtManv.getText());
        emp.setHoTen(txtHoTen.getText());
        emp.setMatKhau(txtPassword.getText());
        emp.setVaiTro(rdoTruongPhong.isSelected());
        return emp;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblEmployee.getRowCount() - 1);

        txtManv.setEditable(!edit);
        btnAdd.setEnabled(!edit);
        btnEdit.setEnabled(edit);
        btnDelete.setEnabled(edit);

        btnFirstIndex.setEnabled(edit && !first);
        btnLastIndex.setEnabled(edit && !last);
        btnNextIndex.setEnabled(edit && !last);
        btnPreviousIndex.setEnabled(edit && !first);
    }

    void insert() {
        Employee emp = getForm();
        String confirmPassword = txtConfirmPassword.getText();
        if (confirmPassword.equalsIgnoreCase(emp.getMatKhau())) {
            try {
                employeeDAO.insert(emp);
                this.fillTable();
                this.clearForm();
                MessageService.alert(this, "Thêm mới thành công");
            } catch (Exception e) {
                MessageService.alert(this, "Thêm mới thất bại");
            }
        } else {
            MessageService.alert(this, "Xác nhận mật khẩu không đúng");
        }
    }

    void update() {
        Employee emp = getForm();
        String confirmPassword = txtConfirmPassword.getText();
        if (confirmPassword.equalsIgnoreCase(emp.getMatKhau())) {
            try {
                employeeDAO.update(emp);
                this.fillTable();
                MessageService.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                MessageService.alert(this, "Cập nhật thất bại");
            }
        } else {
            MessageService.alert(this, "Xác nhận mật khẩu không đúng");
        }
    }

    void delete() {
        if (!AuthService.isManager()) {
            MessageService.alert(this, "Bạn không có quyền xóa nhân viên");
        } else {
            String manv = txtManv.getText();
            if (manv.equals(AuthService.user.getMaNV().trim())) {
                MessageService.alert(this, "Bạn không được xóa chính bạn");
            } else if (MessageService.confirm(this, "Bạn có thực sự muốn xóa nhân viên này không?")) {
                try {
                    employeeDAO.delete(manv);
                    this.fillTable();
                    this.clearForm();
                    MessageService.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    MessageService.alert(this, "Xóa thất bại");
                }
            }

        }
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void previous() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblEmployee.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblEmployee.getRowCount() - 1;
        this.edit();
    }

    boolean validateForm(boolean isInsert) {
        if (ValidateService.isEmpty(
                new ValidConstrain(txtManv, "mã nhân viên"),
                new ValidConstrain(txtPassword, "mật khẩu"),
                new ValidConstrain(txtConfirmPassword, "xác nhận mật khẩu"),
                new ValidConstrain(txtHoTen, "họ tên"))) {
            return false;
        }
        String macd_pattern = "^[a-zA-Z0-9_.-]{0,20}";
        if(!txtManv.getText().trim().matches(macd_pattern)) {
            MessageService.alert(this, "Vui lòng nhập mã nhân viên bằng số và chữ và dưới 20 ký tự");
            txtManv.getText();
            return false;
        }
        if (isInsert) {
            for (Employee emp : this.listEmp) {
                if (emp.getMaNV().trim().equalsIgnoreCase(txtManv.getText())) {
                    MessageService.alert(this, "Mã nhân viên đã tồn tại");
                    txtManv.requestFocus();
                    return false;
                }
            }
        }
        String p_name = "^[a-zA-Z\\s]+";
        if (!txtHoTen.getText().matches(p_name)) {
            MessageService.alert(this, "Nhập họ và tên sai định dạng");
            return false;
        }
        return true;
    }
}
