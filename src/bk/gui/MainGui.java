/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bk.gui;

import com.detect.language.ReadFile;
import com.detect.language.WordMatch;
import huanpc.learning.eng.Constant;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import nbAlgorithm.NBEngMail;
import nbAlgorithm.NBVieMail;

/**
 *
 * @author duylx
 */
public class MainGui extends javax.swing.JFrame {

    /**
     * Creates new form MainGui
     */
    private ReadFile rf;
    private WordMatch wm;
    private NBEngMail nb;
    private NBVieMail nbvn;
    protected static String pathOfFile;

    public MainGui() {
        initComponents();
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
        testButton = new javax.swing.JButton();
        linkSpamSet = new javax.swing.JTextField();
        linkHamSet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numHam = new javax.swing.JTextField();
        numSpam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbProSpam = new javax.swing.JTextField();
        vnCheckBox = new javax.swing.JCheckBox();
        elCheckBox = new javax.swing.JCheckBox();
        btnPhanDoan = new javax.swing.JButton();
        loadBtnSetSpam = new javax.swing.JButton();
        loadBtnSetHam = new javax.swing.JButton();
        loadBtnEmail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lbProHam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        testButton.setBackground(new java.awt.Color(51, 255, 51));
        testButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        testButton.setText("TEST");
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        linkSpamSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        linkSpamSet.setText("Đường dẫn");
        linkSpamSet.setEnabled(false);

        linkHamSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        linkHamSet.setText("Đường dẫn");
        linkHamSet.setEnabled(false);
        linkHamSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkHamSetActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Văn bản email nhập tại đây"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setBackground(new java.awt.Color(0, 255, 51));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("KẾT QUẢ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Số email thường");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Số email rác");

        numHam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        numHam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numHamActionPerformed(evt);
            }
        });

        numSpam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        numSpam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSpamActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("XÁC SUẤT");

        lbProSpam.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbProSpam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbProSpamActionPerformed(evt);
            }
        });

        vnCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vnCheckBox.setText("VN");
        vnCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vnCheckBoxActionPerformed(evt);
            }
        });

        elCheckBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        elCheckBox.setText("EL");
        elCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elCheckBoxActionPerformed(evt);
            }
        });

        btnPhanDoan.setText("Phán đoán");
        btnPhanDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhanDoanActionPerformed(evt);
            }
        });

        loadBtnSetSpam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        loadBtnSetSpam.setText("Chọn tập test mail rác");
        loadBtnSetSpam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadBtnSetSpamMouseEntered(evt);
            }
        });
        loadBtnSetSpam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnSetSpamActionPerformed(evt);
            }
        });

        loadBtnSetHam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        loadBtnSetHam.setText("Chọn tập test mail thường");
        loadBtnSetHam.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loadBtnSetHamMouseMoved(evt);
            }
        });
        loadBtnSetHam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnSetHamActionPerformed(evt);
            }
        });

        loadBtnEmail.setText("Chọn");
        loadBtnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnEmailActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("LỌC EMAIL SPAM");

        jButton6.setText("Phát hiện NN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setText("LEARN");

        lbProHam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbProHamActionPerformed(evt);
            }
        });

        jLabel2.setText("P(RÁc)");

        jLabel7.setText("P(THƯỜNG)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numSpam, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProSpam, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProHam, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numHam, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(loadBtnSetSpam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(vnCheckBox))
                                .addComponent(testButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7))
                            .addGap(11, 11, 11)
                            .addComponent(elCheckBox))
                        .addComponent(loadBtnSetHam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(linkSpamSet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(linkHamSet, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jButton6)
                        .addGap(44, 44, 44)
                        .addComponent(loadBtnEmail)
                        .addGap(43, 43, 43)
                        .addComponent(btnPhanDoan)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vnCheckBox)
                            .addComponent(elCheckBox))
                        .addGap(18, 18, 18)
                        .addComponent(testButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadBtnSetSpam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(linkSpamSet, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loadBtnSetHam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(linkHamSet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(loadBtnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPhanDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numSpam, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numHam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbProSpam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(lbProHam, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkHamSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkHamSetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkHamSetActionPerformed

    private void btnPhanDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhanDoanActionPerformed
        try {

            wm = new WordMatch();
            if (wm.detectVN(jTextArea1.getText().toString())) {
                System.out.println("Ngôn ngữ tiếng Việt");
//                nbv = new NBEngMail("learning_vietnamese_words", "1", true);
//                nbv.mailClassify()
            } else {
                nb = new NBEngMail("learning_words_2", "1", false);
                System.out.println("Ngôn ngữ tiếng Anh");

                if (nb.mailClassify(pathOfFile)) {
                    JOptionPane.showMessageDialog(null, "Thư Spam", null, JOptionPane.OK_OPTION);
                } else {
                    JOptionPane.showMessageDialog(null, "Thư thường", null, JOptionPane.OK_OPTION);
                }
                System.out.println(pathOfFile);
            }

        } catch (Exception e) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_btnPhanDoanActionPerformed

    private void loadBtnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnEmailActionPerformed
        try {
            if (rf == null) {
                rf = new ReadFile();
            }
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "JPG & GIF Images", "jpg", "gif", "txt", "sms");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: "
                        + chooser.getSelectedFile().getName());
                try {
                    String text_mail = rf.getContent(chooser.getSelectedFile());
                    pathOfFile = chooser.getSelectedFile().getAbsolutePath();
                    jTextArea1.setText(text_mail);
                } catch (IOException ex) {
                    Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_loadBtnEmailActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            if (wm == null) {
                wm = new WordMatch();
            }
            if (wm.detectVN(jTextArea1.getText().toString())) {
                System.out.println("Ngôn ngữ tiếng Việt");
                vnCheckBox.setSelected(true);
                elCheckBox.setSelected(false);
            } else {
                System.out.println("Ngôn ngữ tiếng Anh");
                elCheckBox.setSelected(true);
                vnCheckBox.setSelected(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void numSpamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSpamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSpamActionPerformed

    private void vnCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vnCheckBoxActionPerformed
        if (vnCheckBox.isSelected()) {
            elCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_vnCheckBoxActionPerformed

    private void elCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elCheckBoxActionPerformed
        if (elCheckBox.isSelected()) {
            vnCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_elCheckBoxActionPerformed

    private void loadBtnSetSpamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnSetSpamActionPerformed
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            int returnVal = chooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("Bạn đã chọn thư mục có đường dẫn:  "
                        + chooser.getSelectedFile().getAbsolutePath());
                linkSpamSet.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadBtnSetSpamActionPerformed

    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        // if (nb == null)
//            nb = new NBEngMail("learning_words_2", "1", false);
//            //double[] tmp = nb.mailClassifyTest(linkSpamSet.getText(), linkHamSet.getText());
//            double[] tmp = nb.mailClassifyTest(Constant.DATA_TEST_NO_HTML_2[0], Constant.DATA_TEST_NO_HTML_2[1]);
//            lbProSpam.setText(String.valueOf(tmp[0]));
//            lbProHam.setText(String.valueOf(tmp[1]));

        if ((elCheckBox.isSelected() == false) && (vnCheckBox.isSelected() == false)) {
            JOptionPane.showMessageDialog(null, "Bạn phải lựa chọn ngôn ngữ tập dữ liệu", null, WIDTH);
        } else if (elCheckBox.isSelected()) {
            // path 1: Spam; path 2: Ham
            nb = new NBEngMail("learning_words_2", "1", false);
            double[] tmp = nb.mailClassifyTest(linkSpamSet.getText(), linkHamSet.getText());
            lbProSpam.setText(String.valueOf(tmp[0]));
            lbProHam.setText(String.valueOf(tmp[1]));
        } else {
            nbvn = new NBVieMail("learning_vietnamese_words", "1", false);
            double[] tmp = nbvn.mailClassifyTest(linkSpamSet.getText(), linkHamSet.getText());
            lbProSpam.setText(String.valueOf(tmp[0]));
            lbProHam.setText(String.valueOf(tmp[1]));
            numSpam.setText(String.valueOf(tmp[2]));
            numHam.setText(String.valueOf(tmp[3]));
        }
    }//GEN-LAST:event_testButtonActionPerformed

    private void numHamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numHamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numHamActionPerformed

    private void lbProSpamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbProSpamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbProSpamActionPerformed

    private void lbProHamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbProHamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbProHamActionPerformed

    private void loadBtnSetSpamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadBtnSetSpamMouseEntered
        loadBtnSetSpam.setToolTipText("Bạn hãy chọn email bất kỳ trong cả tập mail rác");
    }//GEN-LAST:event_loadBtnSetSpamMouseEntered

    private void loadBtnSetHamMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadBtnSetHamMouseMoved
        loadBtnSetHam.setToolTipText("Bạn hãy chọn email bất kỳ trong cả tập mail thường");
    }//GEN-LAST:event_loadBtnSetHamMouseMoved

    private void loadBtnSetHamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnSetHamActionPerformed
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            int returnVal = chooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("Bạn đã chọn thư mục: "
                        + chooser.getSelectedFile().getAbsolutePath());
                linkHamSet.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadBtnSetHamActionPerformed

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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhanDoan;
    private javax.swing.JCheckBox elCheckBox;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lbProHam;
    private javax.swing.JTextField lbProSpam;
    private javax.swing.JTextField linkHamSet;
    private javax.swing.JTextField linkSpamSet;
    private javax.swing.JButton loadBtnEmail;
    private javax.swing.JButton loadBtnSetHam;
    private javax.swing.JButton loadBtnSetSpam;
    private javax.swing.JTextField numHam;
    private javax.swing.JTextField numSpam;
    private javax.swing.JButton testButton;
    private javax.swing.JCheckBox vnCheckBox;
    // End of variables declaration//GEN-END:variables
}
