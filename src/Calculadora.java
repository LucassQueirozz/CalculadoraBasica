/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        pnlRes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDiv = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnRes = new javax.swing.JButton();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        lblOp = new javax.swing.JLabel();
        pnlRes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setText("Calculadora v0.1.0");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 121, -1));

        btnDiv.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDiv.setMaximumSize(new java.awt.Dimension(54, 24));
        btnDiv.setMinimumSize(new java.awt.Dimension(54, 24));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 60, 60));

        btnSub.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnSub.setText("-");
        btnSub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 60, 60));

        btnMult.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnMult.setText("*");
        btnMult.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        getContentPane().add(btnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 60, 60));

        btnSoma.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnSoma.setText("+");
        btnSoma.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 60, 60));

        btnRes.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnRes.setText("=");
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });
        getContentPane().add(btnRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, 115));

        txtN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 32, 60, -1));

        txtN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 32, 60, -1));

        lblOp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblOp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOp.setText("+");
        getContentPane().add(lblOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 34, 24, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Resultado ");

        lblRes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRes.setText("0");

        javax.swing.GroupLayout pnlResLayout = new javax.swing.GroupLayout(pnlRes);
        pnlRes.setLayout(pnlResLayout);
        pnlResLayout.setHorizontalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlResLayout.setVerticalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRes))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        // TODO add your handling code here:
        lblOp.setText("*");
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        lblOp.setText("/");
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        // TODO add your handling code here:
        lblOp.setText("+");
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        lblOp.setText("-");
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        // TODO add your handling code here:
        double n1 = Integer.parseInt(txtN1.getText());
        double n2 = Integer.parseInt(txtN2.getText());
        double res = 0;
        switch (lblOp.getText()) {
            case "+":
                res = n1 + n2;
                Double.toString(res);
                break;
            
            case "-":
                res = n1 - n2;
                Double.toString(res);
                break;
            
            case "*":
                res = n1 * n2;
                Double.toString(res);
                break;
                
            case "/":
                res = n1 / n2;
                Double.toString(res);
                break;              
        }
        pnlRes.setVisible(true);
        lblRes.setText(res + "");
        
    }//GEN-LAST:event_btnResActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnRes;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblOp;
    private javax.swing.JLabel lblRes;
    private javax.swing.JPanel pnlRes;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    // End of variables declaration//GEN-END:variables
}
