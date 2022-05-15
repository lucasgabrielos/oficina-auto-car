
package Oficina.View.TelaLogin;

import Oficina.Controller.UsuarioController;
import Oficina.Model.Usuario;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
         this.setSize(900,500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextNome = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextRG = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TextCPF = new javax.swing.JFormattedTextField();
        BtnCadastrar = new javax.swing.JButton();
        TextTelefone = new javax.swing.JFormattedTextField();
        TextSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaCadastro");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 140, 70, 22);
        getContentPane().add(TextNome);
        TextNome.setBounds(310, 90, 250, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 100, 70, 20);

        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });
        getContentPane().add(TextEmail);
        TextEmail.setBounds(310, 130, 250, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 180, 80, 20);

        BtnVoltar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.setPreferredSize(new java.awt.Dimension(80, 22));
        getContentPane().add(BtnVoltar);
        BtnVoltar.setBounds(70, 400, 90, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 220, 90, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 260, 60, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RG:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 300, 33, 22);

        TextRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRGActionPerformed(evt);
            }
        });
        getContentPane().add(TextRG);
        TextRG.setBounds(310, 290, 250, 30);

        jLabel13.setFont(new java.awt.Font("Arial Black", 2, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cadastre - se");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 10, 280, 34);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(24, 0, 0, 0);

        try {
            TextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCPFActionPerformed(evt);
            }
        });
        getContentPane().add(TextCPF);
        TextCPF.setBounds(310, 250, 250, 30);

        BtnCadastrar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCadastrar);
        BtnCadastrar.setBounds(670, 400, 117, 40);

        try {
            TextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(TextTelefone);
        TextTelefone.setBounds(310, 210, 250, 30);
        getContentPane().add(TextSenha);
        TextSenha.setBounds(310, 170, 250, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Oficina/View/Imagens/Tela de cadastro_1.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 880, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LimparCamposCadastro(java.awt.event.ActionEvent evt){
        TextNome.setText("");
        TextEmail.setText("");
        TextSenha.setText("");
        TextTelefone.setText("");
        TextCPF.setText("");
        TextRG.setText("");
    }
    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    private void TextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCPFActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        String Nome = TextNome.getText();
        String Email = TextEmail.getText();
        String Senha = TextSenha.getText();
        if(Senha.length() > 6){
            JOptionPane.showMessageDialog(null, "Digite uma senha de 6 digitos!");
            return;
        }
        String Telefone = TextTelefone.getText();
        String Cpf = TextCPF.getText();
        String Rg = TextRG.getText();
        if(Rg.length() > 8){
            JOptionPane.showMessageDialog(null, "Digite um RG válido!");
            return;
        }
        
        try {
             boolean Sucesso;
            Sucesso = UsuarioController.ValidarUsuario(Nome, Email, Senha, Telefone, Cpf, Rg);
        
            if(Sucesso == true){
                Usuario u = new Usuario(Nome,Email, Senha,Telefone,Cpf, Rg );
//                new UsuarioController().CadastrarUsuario(u);
                UsuarioController.CadastrarUsuario(u);
                
                JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
                this.LimparCamposCadastro(evt);
                this.dispose();//Fecha o Jframe atual
            }else{
                JOptionPane.showMessageDialog(null, "Campos não preenchidos corretamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error:" + e);
        }
       
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void TextRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRGActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextRGActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JFormattedTextField TextCPF;
    private javax.swing.JFormattedTextField TextEmail;
    private javax.swing.JFormattedTextField TextNome;
    private javax.swing.JFormattedTextField TextRG;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JFormattedTextField TextTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
