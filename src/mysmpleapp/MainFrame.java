/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysmpleapp;

/**
 *
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        TxtA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtC = new javax.swing.JTextField();
        btnCalculator = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtba = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtbc = new javax.swing.JTextField();
        txtca = new javax.swing.JTextField();
        txtcb = new javax.swing.JTextField();
        txtcc = new javax.swing.JTextField();
        txtda = new javax.swing.JTextField();
        txtdb = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCTb = new javax.swing.JButton();
        btnCb = new javax.swing.JButton();
        btnCTc = new javax.swing.JButton();
        btnCc = new javax.swing.JButton();
        btnCTd = new javax.swing.JButton();
        btnCd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello World");

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel1.setText("+");

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel2.setText("=");

        btnCalculator.setText("calculate");
        btnCalculator.setToolTipText("");
        btnCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculatorActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel3.setText("-");

        jLabel4.setText("=");

        jLabel5.setText("*");

        jLabel6.setText("=");

        jLabel7.setText("/");

        jLabel8.setText("=");

        btnCTb.setText("calculate");
        btnCTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTbActionPerformed(evt);
            }
        });

        btnCb.setText("Clear");
        btnCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCbActionPerformed(evt);
            }
        });

        btnCTc.setText("calculate");
        btnCTc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTcActionPerformed(evt);
            }
        });

        btnCc.setText("Clear");
        btnCc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCcActionPerformed(evt);
            }
        });

        btnCTd.setText("calculate");
        btnCTd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTdActionPerformed(evt);
            }
        });

        btnCd.setText("Clear");
        btnCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtca, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(txtda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdb, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCTc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCTd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCd))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtba)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbb, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(TxtB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCTb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCb))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalculator)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(TxtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculator)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCTb)
                    .addComponent(btnCb)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCTc)
                    .addComponent(btnCc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCTd)
                    .addComponent(btnCd))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculatorActionPerformed
        // TODO add your handling code here:
        
        String a = TxtA.getText();
        String b = TxtB.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA+intB;
        
        String c = Integer.toString(intC);
        
        TxtC.setText(c); 
        
    }//GEN-LAST:event_btnCalculatorActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
        TxtA.setText("");
        TxtB.setText("");
        TxtC.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTbActionPerformed
        // TODO add your handling code here:
        
        String a = txtba.getText();
        String b = txtbb.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA+intB;
        
        String c = Integer.toString(intC);
        
        txtbc.setText(c);
        
    }//GEN-LAST:event_btnCTbActionPerformed

    private void btnCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCbActionPerformed
        // TODO add your handling code here:
        
        txtba.setText("");
        txtbb.setText("");
        txtbc.setText("");
        
    }//GEN-LAST:event_btnCbActionPerformed

    private void btnCTcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTcActionPerformed
        // TODO add your handling code here:
        
        String a = txtca.getText();
        String b = txtcb.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA+intB;
        
        String c = Integer.toString(intC);
        
        txtcc.setText(c);
        
    }//GEN-LAST:event_btnCTcActionPerformed

    private void btnCcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCcActionPerformed
        // TODO add your handling code here:
        
        txtca.setText("");
        txtcb.setText("");
        txtcc.setText("");
        
    }//GEN-LAST:event_btnCcActionPerformed

    private void btnCTdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTdActionPerformed
        // TODO add your handling code here:
        
        String a = txtda.getText();
        String b = txtdb.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA+intB;
        
        String c = Integer.toString(intC);
        
        txtdc.setText(c);
        
    }//GEN-LAST:event_btnCTdActionPerformed

    private void btnCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCdActionPerformed
        // TODO add your handling code here:
        
        txtda.setText("");
        txtdb.setText("");
        txtdc.setText("");
        
    }//GEN-LAST:event_btnCdActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtA;
    private javax.swing.JTextField TxtB;
    private javax.swing.JTextField TxtC;
    private javax.swing.JButton btnCTb;
    private javax.swing.JButton btnCTc;
    private javax.swing.JButton btnCTd;
    private javax.swing.JButton btnCalculator;
    private javax.swing.JButton btnCb;
    private javax.swing.JButton btnCc;
    private javax.swing.JButton btnCd;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtba;
    private javax.swing.JTextField txtbb;
    private javax.swing.JTextField txtbc;
    private javax.swing.JTextField txtca;
    private javax.swing.JTextField txtcb;
    private javax.swing.JTextField txtcc;
    private javax.swing.JTextField txtda;
    private javax.swing.JTextField txtdb;
    private javax.swing.JTextField txtdc;
    // End of variables declaration//GEN-END:variables
}
