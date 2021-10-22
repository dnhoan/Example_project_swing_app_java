
package UI;

import Service.AuthService;
import Service.DateService;
import Service.MessageService;
import java.util.Date;
import Service.ImageService;
import java.awt.Desktop;
import java.io.File;

public class EduSysJFrame extends javax.swing.JFrame {

    public EduSysJFrame() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnLogOut = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnThematic = new javax.swing.JButton();
        btnLearner = new javax.swing.JButton();
        btnCourse = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnGuide = new javax.swing.JButton();
        lblStatus = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniLogIn = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniChangePassword = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniThematic = new javax.swing.JMenuItem();
        mniCourse = new javax.swing.JMenuItem();
        mniLearner = new javax.swing.JMenuItem();
        mniStudent = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniEmployee = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniTranscript = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniLearnersStatistic = new javax.swing.JMenuItem();
        mniThematicPoint = new javax.swing.JMenuItem();
        mniRevenue = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniGuide = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniAbout = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        btnLogOut.setText("Đăng xuất");
        btnLogOut.setFocusable(false);
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogOut.setMargin(new java.awt.Insets(2, 15, 2, 15));
        btnLogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogOut);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        btnExit.setText("Kết thúc");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setMargin(new java.awt.Insets(2, 15, 2, 15));
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);
        jToolBar1.add(jSeparator6);

        btnThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        btnThematic.setText("Chuyên đề");
        btnThematic.setFocusable(false);
        btnThematic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThematic.setMargin(new java.awt.Insets(2, 15, 2, 15));
        btnThematic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThematicActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThematic);

        btnLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        btnLearner.setText("Người học");
        btnLearner.setFocusable(false);
        btnLearner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLearner.setMargin(new java.awt.Insets(2, 15, 2, 15));
        btnLearner.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnerActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLearner);

        btnCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Certificate.png"))); // NOI18N
        btnCourse.setText("Khóa học");
        btnCourse.setFocusable(false);
        btnCourse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCourse.setMargin(new java.awt.Insets(2, 15, 2, 15));
        btnCourse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCourse);

        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        btnStudent.setText("Học viên");
        btnStudent.setFocusable(false);
        btnStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStudent.setMargin(new java.awt.Insets(2, 15, 2, 15));
        btnStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        jToolBar1.add(btnStudent);

        btnGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        btnGuide.setText("Hướng dẫn");
        btnGuide.setFocusable(false);
        btnGuide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuide.setMargin(new java.awt.Insets(2, 15, 2, 15));
        btnGuide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuideActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuide);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        jLabel1.setText("Hệ quản lý đào tạo");

        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clock.png"))); // NOI18N
        lblTime.setText("Time");

        javax.swing.GroupLayout lblStatusLayout = new javax.swing.GroupLayout(lblStatus);
        lblStatus.setLayout(lblStatusLayout);
        lblStatusLayout.setHorizontalGroup(
            lblStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        lblStatusLayout.setVerticalGroup(
            lblStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/wallpaperflare.com_wallpaper (4).jpg"))); // NOI18N

        mnuHeThong.setText("Hệ thống");

        mniLogIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Login.png"))); // NOI18N
        mniLogIn.setText("Đăng nhập");
        mniLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogInActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniLogIn);

        mniLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        mniLogOut.setText("Đăng xuất");
        mniLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogOutActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniLogOut);
        mnuHeThong.add(jSeparator1);

        mniChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        mniChangePassword.setText("Đổi mật khẩu");
        mniChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChangePasswordActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniChangePassword);
        mnuHeThong.add(jSeparator2);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        mniExit.setText("Kết thúc");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniExit);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniThematic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        mniThematic.setText("Chuyên đề");
        mniThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThematicActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniThematic);

        mniCourse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Certificate.png"))); // NOI18N
        mniCourse.setText("Khóa học");
        mniCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCourseActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniCourse);

        mniLearner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        mniLearner.setText("Người học");
        mniLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLearnerActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniLearner);

        mniStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Boy.png"))); // NOI18N
        mniStudent.setText("Học viên");
        mniStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStudentActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniStudent);
        mnuQuanLy.add(jSeparator4);

        mniEmployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        mniEmployee.setText("Nhân viên");
        mniEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmployeeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniEmployee);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setText("Thống kê");

        mniTranscript.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniTranscript.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Card file.png"))); // NOI18N
        mniTranscript.setText("Bảng điểm");
        mniTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTranscriptActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTranscript);
        mnuThongKe.add(jSeparator3);

        mniLearnersStatistic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniLearnersStatistic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        mniLearnersStatistic.setText("Lượng người học");
        mniLearnersStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLearnersStatisticActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniLearnersStatistic);

        mniThematicPoint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniThematicPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bar chart.png"))); // NOI18N
        mniThematicPoint.setText("Điểm chuyên đề");
        mniThematicPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThematicPointActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniThematicPoint);

        mniRevenue.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniRevenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dollar.png"))); // NOI18N
        mniRevenue.setText("Doanh thu");
        mniRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRevenueActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniRevenue);

        jMenuBar1.add(mnuThongKe);

        mnuTroGiup.setText("Trợ giúp");

        mniGuide.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        mniGuide.setText("Hướng dẫn sử dụng");
        mniGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuideActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGuide);
        mnuTroGiup.add(jSeparator5);

        mniAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Brick house.png"))); // NOI18N
        mniAbout.setText("Giới thiệu sản phẩm");
        mniAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAboutActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniAbout);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogInActionPerformed
        new DangNhapJDialog().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniLogInActionPerformed

    private void mniLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogOutActionPerformed
        logOut();
    }//GEN-LAST:event_mniLogOutActionPerformed

    private void mniThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThematicActionPerformed
       openThematic();
    }//GEN-LAST:event_mniThematicActionPerformed

    private void mniLearnersStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLearnersStatisticActionPerformed
        openStatistic(1);
    }//GEN-LAST:event_mniLearnersStatisticActionPerformed

    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed
        openAbout();
    }//GEN-LAST:event_mniAboutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exit();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
       logOut();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThematicActionPerformed
        openThematic();
    }//GEN-LAST:event_btnThematicActionPerformed

    private void btnLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearnerActionPerformed
        // TODO add your handling code here:
        openLearner();
    }//GEN-LAST:event_btnLearnerActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        // TODO add your handling code here:
        openCourse();
    }//GEN-LAST:event_btnCourseActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        openStudent();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuideActionPerformed
        openGuide();
    }//GEN-LAST:event_btnGuideActionPerformed

    private void mniChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChangePasswordActionPerformed
        openChangePassword();
    }//GEN-LAST:event_mniChangePasswordActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        exit();
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCourseActionPerformed
       openCourse();
    }//GEN-LAST:event_mniCourseActionPerformed

    private void mniLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLearnerActionPerformed
        openLearner();
    }//GEN-LAST:event_mniLearnerActionPerformed

    private void mniStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStudentActionPerformed
        openStudent();
    }//GEN-LAST:event_mniStudentActionPerformed

    private void mniEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmployeeActionPerformed
        openEmployee();
    }//GEN-LAST:event_mniEmployeeActionPerformed

    private void mniTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTranscriptActionPerformed
        openStatistic(0);
    }//GEN-LAST:event_mniTranscriptActionPerformed

    private void mniThematicPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThematicPointActionPerformed
        openStatistic(2);
    }//GEN-LAST:event_mniThematicPointActionPerformed

    private void mniRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRevenueActionPerformed
        openStatistic(3);
    }//GEN-LAST:event_mniRevenueActionPerformed

    private void mniGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuideActionPerformed
       openGuide();
    }//GEN-LAST:event_mniGuideActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new EduSysJFrame().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuide;
    private javax.swing.JButton btnLearner;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnThematic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel lblStatus;
    private javax.swing.JLabel lblTime;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniChangePassword;
    private javax.swing.JMenuItem mniCourse;
    private javax.swing.JMenuItem mniEmployee;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniGuide;
    private javax.swing.JMenuItem mniLearner;
    private javax.swing.JMenuItem mniLearnersStatistic;
    private javax.swing.JMenuItem mniLogIn;
    private javax.swing.JMenuItem mniLogOut;
    private javax.swing.JMenuItem mniRevenue;
    private javax.swing.JMenuItem mniStudent;
    private javax.swing.JMenuItem mniThematic;
    private javax.swing.JMenuItem mniThematicPoint;
    private javax.swing.JMenuItem mniTranscript;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    // End of variables declaration//GEN-END:variables
    void init() {
        setLocationRelativeTo(null);
        setTitle("Màn hình chính");
        setIconImage(ImageService.getAppIcon());
        startTime();
    }
    
    void startTime() {
        Thread t;
        t = new Thread(() -> {
            while (true) {
                Date date = new Date();
                lblTime.setText(DateService.toString(date,"HH:mm:ss a"));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    break;
                }
            }
        });
        t.start();
    }
    
    void openChangePassword() {
        if(AuthService.isLogin()) {
            new DoiMatKhauJDialog().setVisible(true);
        } else {
            MessageService.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    void logOut() {
        AuthService.clear();
        new DangNhapJDialog().setVisible(true);
        this.dispose();
    }
    
    void exit() {
        if(MessageService.confirm(this, "Bạn muốn kết thúc làm việc?")){
            AuthService.clear();
            System.exit(0);
        }
    }
    
    void openEmployee() {
        if(AuthService.isLogin()) {
            if (AuthService.isManager()) {
                new NhanVienJDialog().setVisible(true);
            } else {
                MessageService.alert(this, "Bạn không có quyền xem nhân viên");
            }
        } else {
            MessageService.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openThematic() {
        if(AuthService.isLogin()) {
            new ChuyenDeJDialog().setVisible(true);
        } else {
            MessageService.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openCourse() {
        if(AuthService.isLogin()) {
            new KhoaHocJDialog().setVisible(true);
        } else {
            MessageService.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openLearner() {
        if(AuthService.isLogin()) {
            new NguoiHocJDialog().setVisible(true);
        } else {
            MessageService.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openStudent() {
        if(AuthService.isLogin()) {
            new HocVienJDialog().setVisible(true);
        } else {
            MessageService.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openStatistic(int tabIndex) {
        if(AuthService.isLogin()) {
            if(AuthService.isLogin()) {
                if(tabIndex == 3 && !AuthService.isManager()) {
                    MessageService.alert(this, "Bạn không có quyền xem doanh thu");
                } else {
                    ThongKeJdialog statistic = new ThongKeJdialog();
                    statistic.setVisible(true);
                    statistic.selectTab(tabIndex);
                }
            }
        } else {
            MessageService.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openGuide() {
        try {
            Desktop.getDesktop().browse(new File("guide/home.html").toURI());
        } catch (Exception e) {
            MessageService.alert(this, "Không tìm thấy file hướng dẫn");
        }
    }
    void openAbout() {
            new GioiThieuJDialog().setVisible(true);
    }
}
