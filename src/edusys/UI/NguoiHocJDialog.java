package EduSys.UI;

import edusys.DAO.LearnerDAO;
import edusys.DAO.StudentDAO;
import edusys.Service.AuthService;
import edusys.Service.DateService;
import edusys.Service.ImageService;
import edusys.Service.MessageService;
import edusys.Service.ValidateService;
import edusys.model.Learner;
import edusys.model.ValidConstrain;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class NguoiHocJDialog extends javax.swing.JFrame {

    public NguoiHocJDialog() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLearner = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtManh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        txtSoDt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Quản lý người học");

        tblLearner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NH", "Họ và tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email", "Ma NV", "Ngày tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(tblLearner);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách", jPanel1);

        jLabel2.setText("Mã người học");

        jLabel3.setText("Họ và tên");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Địa chỉ email");

        jLabel6.setText("Ghi chú");

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
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextIndexMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Mới");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextIndexMouseClicked(evt);
            }
        });
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
        btnLastIndex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextIndexMouseClicked(evt);
            }
        });
        btnLastIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastIndexActionPerformed(evt);
            }
        });
        jPanel4.add(btnLastIndex);

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        jLabel9.setText("Điện thoại");

        jLabel10.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu))
                            .addComponent(txtSoDt, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtNgaySinh, txtSoDt});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtManh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoNam)
                        .addComponent(rdoNu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoDt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rdoNam, rdoNu, txtEmail, txtHoTen, txtManh, txtNgaySinh, txtSoDt});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel3, jPanel4});

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
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLearnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLearnerMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblLearner.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblLearnerMouseClicked

    private void btnLastIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastIndexActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastIndexActionPerformed

    private void btnNextIndexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextIndexMouseClicked

    }//GEN-LAST:event_btnNextIndexMouseClicked

    private void btnNextIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextIndexActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextIndexActionPerformed

    private void btnPreviousIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousIndexActionPerformed
        this.previous();
    }//GEN-LAST:event_btnPreviousIndexActionPerformed

    private void btnFirstIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstIndexActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstIndexActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validateForm(false)) {
            this.update();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (validateForm(true)) {
            this.insert();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        fillTable();
    }//GEN-LAST:event_txtSearchKeyTyped

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
            java.util.logging.Logger.getLogger(NguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NguoiHocJDialog().setVisible(true);
        });
    }

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblLearner;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtManh;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoDt;
    // End of variables declaration//GEN-END:variables
    LearnerDAO learnerDAO = new LearnerDAO();
    StudentDAO studentDAO = new StudentDAO();
    int row = -1;

    void init() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Quản lý người học");
        setIconImage(ImageService.getAppIcon());
        fillTable();
        this.updateStatus();
    }
    List<Learner> listLearner;

    void fillTable() {
        DefaultTableModel tableModel = (DefaultTableModel) tblLearner.getModel();
        tableModel.setRowCount(0);
        try {
            String keyWord = txtSearch.getText();
            listLearner = learnerDAO.selectBySearch(keyWord);
            listLearner.stream().forEachOrdered((Learner learner) -> {
                tableModel.addRow(new Object[]{
                    learner.getMaNH(),
                    learner.getHoTen(),
                    learner.isGioiTinh() ? "Nam" : "Nữ",
                    DateService.toString(learner.getNgaySinh(), "dd/MM/yyyy"),
                    learner.getDienThoai(),
                    learner.getEmail(),
                    learner.getMaNV(),
                    DateService.toString(learner.getNgayDK(), "dd/MM/yyyy")
                });
            });
        } catch (Exception e) {
            MessageService.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void setForm(Learner learner) {
        txtManh.setText(learner.getMaNH());
        txtHoTen.setText(learner.getHoTen());
        if (learner.isGioiTinh()) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtNgaySinh.setText(DateService.toString(learner.getNgaySinh(), "dd/MM/yyyy"));
        txtSoDt.setText(learner.getDienThoai());
        txtEmail.setText(learner.getEmail());
        txtGhiChu.setText(learner.getGhiChu());
    }

    Learner getForm() {
        Learner learner = new Learner();
        learner.setMaNH(txtManh.getText());
        learner.setHoTen(txtHoTen.getText());
        learner.setGioiTinh(rdoNam.isSelected());
        learner.setNgaySinh(DateService.toDate(txtNgaySinh.getText(), "dd/MM/yyyy"));
        learner.setDienThoai(txtSoDt.getText());
        learner.setEmail(txtEmail.getText());
        learner.setGhiChu(txtGhiChu.getText());
        learner.setMaNV(AuthService.user.getMaNV());
        return learner;
    }

    void clearForm() {
        Learner learner = new Learner();
        this.setForm(learner);
        this.row = -1;
        this.updateStatus();
    }

    void insert() {
        Learner learner = this.getForm();
        try {
            learnerDAO.insert(learner);
            this.fillTable();
            this.clearForm();
            MessageService.alert(this, "Thêm người học thành công");
        } catch (Exception e) {
            MessageService.alert(this, "Thêm người học thất bại");
        }
    }

    void update() {
        Learner learner = this.getForm();
        try {
            learnerDAO.update(learner);
            this.fillTable();
            MessageService.alert(this, "Cập nhật thông tin người học thành công!");
        } catch (Exception e) {
            MessageService.alert(this, "Cập nhật thông tin người học thất bại!");
        }
    }

    void delete() {
        if (!AuthService.isManager()) {
            MessageService.alert(this, "Bạn không có quyền xóa người học");
        } else {
            String manh = txtManh.getText();
            if (this.studentDAO.isLeanerInStudent(manh)) {
                if (MessageService.confirm(this, "Người học này đang có trong bảng học viên bạn có thực sự muốn xóa người học này không?")) {
                    try {
                        learnerDAO.deleteLearnerInStudent(manh, manh);
                        this.fillTable();
                        this.clearForm();
                        MessageService.alert(this, "Đã xóa người học!");
                    } catch (Exception e) {
                        MessageService.alert(this, "Xóa thất bại");
                    }
                }
            } else {
                if (MessageService.confirm(this, "Bạn có thực sự muốn xóa người học này không?")) {
                    try {
                        learnerDAO.delete(manh);
                        this.fillTable();
                        this.clearForm();
                        MessageService.alert(this, "Đã xóa người học!");
                    } catch (Exception e) {
                        MessageService.alert(this, "Xóa thất bại");
                    }
                }
            }
        }
    }

    void edit() {
        String manh = (String) tblLearner.getValueAt(this.row, 0);
        Learner learner = learnerDAO.selectByID(manh);
        this.setForm(learner);
        tabs.setSelectedIndex(1);
        this.updateStatus();
    }

    void updateStatus() {
        boolean edit = this.row >= 0;
        boolean first = this.row == 0;
        boolean last = this.row == tblLearner.getRowCount() - 1;

        txtManh.setEditable(!edit);
        btnAdd.setEnabled(!edit);
        btnEdit.setEnabled(edit);
        btnDelete.setEnabled(edit);

        btnFirstIndex.setEnabled(!first && edit);
        btnLastIndex.setEnabled(!last && edit);
        btnNextIndex.setEnabled(!last && edit);
        btnPreviousIndex.setEnabled(!first && edit);
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
        if (this.row < tblLearner.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblLearner.getRowCount() - 1;
        this.edit();
    }

    boolean validateForm(boolean isInsert) {
        if (ValidateService.isEmpty(
                new ValidConstrain(txtManh, "mã người học"),
                new ValidConstrain(txtHoTen, "họ tên người học"),
                new ValidConstrain(txtNgaySinh, "ngày sinh người học"),
                new ValidConstrain(txtSoDt, "số điện thoại"),
                new ValidConstrain(txtEmail, "email")
        )) {
            return false;
        }
        String macd_pattern = "^[a-zA-Z0-9_.-]{0,7}";
        if (!txtManh.getText().matches(macd_pattern)) {
            MessageService.alert(this, "Vui lòng nhập mã người học bằng số và chữ và dưới 8 ký tự");
            txtManh.getText();
            return false;
        }
        if (isInsert) {
            for (Learner learner : listLearner) {
                if (learner.getMaNH().equalsIgnoreCase(txtManh.getText())) {
                    MessageService.alert(this, "Trùng mã người học");
                    txtManh.requestFocus();
                    return false;
                }
            }
        }
        String date_pattern = "^(0?[1-9]|[12][0-9]|3[01])[/.](0?[1-9]|1[012])[/.](19|20)?[0-9]{2}$";
        if (!txtNgaySinh.getText().matches(date_pattern)) {
            MessageService.alert(this, "Nhập sai định dạng ngày sinh: dd/MM/yyyy");
            txtNgaySinh.requestFocus();
            return false;
        }
        String sdt_pattern = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
        if (!txtSoDt.getText().matches(sdt_pattern)) {
            MessageService.alert(this, "Nhập sai định dạng số điện thoại");
            txtSoDt.requestFocus();
            return false;
        }
        String email_pattern = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
        if (!txtEmail.getText().matches(email_pattern)) {
            MessageService.alert(this, "Nhập sai định dạng email");
            txtEmail.requestFocus();
            return false;
        }
        return true;
    }
}
