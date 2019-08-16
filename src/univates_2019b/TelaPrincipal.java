/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univates_2019b;

/**
 *
 * @author yuri.mattiuz
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    Pessoa pessoa1;
    Pessoa pessoa2;
 
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        pessoa1 = new Pessoa();
        pessoa2 = new Pessoa();
        
        pessoa1.setCodigo(1);
        pessoa1.setNome("Juca");
        pessoa1.setEndereco("Lajeado");
        pessoa1.setTelefone("190");
        pessoa1.setValorConta(500);
        pessoa1.setChequeEspecial(200);
        
        pessoa2.setCodigo(2);
        pessoa2.setNome("João");
        pessoa2.setValorConta(1000);
        pessoa2.setChequeEspecial(100);
        
        //String.valueOf() <= Converte qualquer coisa para String
        lblNome1.setText(pessoa1.getNome());
        lblValor1.setText(String.valueOf(pessoa1.getValorConta()));
        lblChequeEspecial1.setText(String.valueOf(pessoa1.getChequeEspecial()));
        
        lblNome2.setText(pessoa2.getNome());
        lblValor2.setText(String.valueOf(pessoa2.getValorConta()));
        lblChequeEspecial2.setText(String.valueOf(pessoa2.getChequeEspecial()));
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblNomeTXT1 = new javax.swing.JLabel();
        lblNomeTXT2 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblValor3 = new javax.swing.JLabel();
        lblValor4 = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        lbChequeEspecialTXT = new javax.swing.JLabel();
        lbChequeEspecialTXT2 = new javax.swing.JLabel();
        lblChequeEspecial1 = new javax.swing.JLabel();
        lblChequeEspecial2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnTransfere1 = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
        btnTransfere2 = new javax.swing.JButton();
        txtTransferencia1 = new javax.swing.JTextField();
        txtTransferencia2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeTXT1.setText("NOME:");

        lblNomeTXT2.setText("NOME:");

        lblNome1.setText("Nome:");

        lblNome2.setText("Nome:");

        lblValor3.setText("SALDO:");

        lblValor4.setText("SALDO:");

        lblValor1.setText("Saldo");

        lblValor2.setText("Saldo");

        lbChequeEspecialTXT.setText("CHEQUE ESPECIAL:");

        lbChequeEspecialTXT2.setText("CHEQUE ESPECIAL:");

        lblChequeEspecial1.setText("Especial");

        lblChequeEspecial2.setText("Especial");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-close-window-24.png"))); // NOI18N
        btnSair.setText("Sair222");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnTransfere1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-replace-24.png"))); // NOI18N
        btnTransfere1.setText("Transferência");
        btnTransfere1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfere1ActionPerformed(evt);
            }
        });

        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-printer-24.png"))); // NOI18N
        btnImprimir1.setText("Imprimir");
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });

        btnTransfere2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-replace-24.png"))); // NOI18N
        btnTransfere2.setText("Transferência");
        btnTransfere2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfere2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeTXT1)
                            .addComponent(lblNome1)
                            .addComponent(lblValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbChequeEspecialTXT)
                            .addComponent(lblChequeEspecial1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransferencia1)
                            .addComponent(btnTransfere1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(btnImprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTransfere2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(lblChequeEspecial2)
                            .addComponent(lbChequeEspecialTXT2)
                            .addComponent(lblValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome2)
                            .addComponent(lblNomeTXT2)
                            .addComponent(lblValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransferencia2)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTXT1)
                    .addComponent(lblNomeTXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(lblNome2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 6, Short.MAX_VALUE)
                        .addComponent(lblValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbChequeEspecialTXT)
                    .addComponent(lbChequeEspecialTXT2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChequeEspecial1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChequeEspecial2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTransferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTransferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransfere1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransfere2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnTransfere1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfere1ActionPerformed
        try{
            double transf = Double.parseDouble(txtTransferencia1.getText());
            if(pessoa1.credito(transf) == true){
                pessoa2.debito(transf);
            }
            lblValor1.setText(String.valueOf(pessoa1.getValorConta()));
            lblValor2.setText(String.valueOf(pessoa2.getValorConta()));
            txtTransferencia1.setText("0");
        
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
      
    }//GEN-LAST:event_btnTransfere1ActionPerformed

    private void btnTransfere2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfere2ActionPerformed
        
        try{
            double transf = Double.parseDouble(txtTransferencia2.getText());
            if(pessoa2.credito(transf) == true){
                pessoa1.debito(transf);
            }
            lblValor1.setText(String.valueOf(pessoa2.getValorConta()));
            lblValor2.setText(String.valueOf(pessoa1.getValorConta()));
            txtTransferencia2.setText("0");
        
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnTransfere2ActionPerformed

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
        // TODO add your handling code here:
        try {
            //tabelaDados.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnImprimir1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTransfere1;
    private javax.swing.JButton btnTransfere2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbChequeEspecialTXT;
    private javax.swing.JLabel lbChequeEspecialTXT2;
    private javax.swing.JLabel lblChequeEspecial1;
    private javax.swing.JLabel lblChequeEspecial2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNomeTXT1;
    private javax.swing.JLabel lblNomeTXT2;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JLabel lblValor3;
    private javax.swing.JLabel lblValor4;
    private javax.swing.JTextField txtTransferencia1;
    private javax.swing.JTextField txtTransferencia2;
    // End of variables declaration//GEN-END:variables
}
