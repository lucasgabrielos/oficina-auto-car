package Oficina.View.TelaLogin;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setSize(900,500);  
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Email = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        InputSenha = new javax.swing.JPasswordField();
        InputEmail = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        Email.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        Email.setText("Email:");
        getContentPane().add(Email);
        Email.setBounds(10, 180, 140, 20);

        Senha.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        Senha.setText("Senha:");
        getContentPane().add(Senha);
        Senha.setBounds(10, 270, 90, 20);

        btEntrar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar);
        btEntrar.setBounds(10, 370, 90, 35);

        btSair.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(790, 420, 70, 35);

        btCadastrar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btCadastrar.setText("Cadastre-se");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar);
        btCadastrar.setBounds(110, 370, 130, 35);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel4.setText("Oficina Auto Car");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 330, 50);

        InputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(InputSenha);
        InputSenha.setBounds(10, 310, 230, 30);

        InputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEmailActionPerformed(evt);
            }
        });
        getContentPane().add(InputEmail);
        InputEmail.setBounds(10, 220, 230, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Oficina/View/Imagens/Imagens.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, 0, 920, 470);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 850, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEmailActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_InputEmailActionPerformed

    private void InputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputSenhaActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
       // TODO add your handling code here:
      String email = InputEmail.getText();
      if(email == "teste"){
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
            return;
      }
      new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_btEntrarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        new TelaCadastro().setVisible(true); 
    }//GEN-LAST:event_btCadastrarActionPerformed

  private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private void SetExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JFormattedTextField InputEmail;
    private javax.swing.JPasswordField InputSenha;
    private javax.swing.JLabel Senha;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables


}
