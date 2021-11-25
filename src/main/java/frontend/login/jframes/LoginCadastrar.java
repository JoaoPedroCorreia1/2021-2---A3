package frontend.login.jframes;

import backend.client.UsuariosClient;
import backend.models.Usuario;
import backend.service.login.ValidadorCadastrarUsuario;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JLabel;

public class LoginCadastrar extends javax.swing.JFrame {

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
            java.util.logging.Logger.getLogger(LoginCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCadastrar().setVisible(true);
            }
        });
    }
    
    public LoginCadastrar() {
        initComponents();
        inicializarComponentes();
    }

    private void inicializarComponentes () {
        
        // mensagens de erro
        mensagensDeErro = new ArrayList<>();
                
        mensagensDeErro.addAll(
                
                Arrays.asList(
                        erroNomeCompleto,
                        erroNomeDeUsuario,
                        erroEmail,
                        erroSenha,
                        erroConfirmarSenha,
                        erroTelefone
                )
                
        );
        
        mensagensDeErro.forEach( 
                erro -> {
                    erro.setVisible(false);
                }
        );
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitle = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scrollPaneCadastro = new javax.swing.JScrollPane();
        panelCadastro = new javax.swing.JPanel();
        erroEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        tituloEmail = new javax.swing.JLabel();
        erroSenha = new javax.swing.JLabel();
        tituloSenha = new javax.swing.JLabel();
        erroConfirmarSenha = new javax.swing.JLabel();
        tituloConfirmarSenha = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        erroTelefone = new javax.swing.JLabel();
        tituloTelefone = new javax.swing.JLabel();
        textFieldNomeCompleto = new javax.swing.JTextField();
        tituloNomeCompleto = new javax.swing.JLabel();
        erroNomeCompleto = new javax.swing.JLabel();
        textFieldNomeDeUsuario = new javax.swing.JTextField();
        tituloNomeDeUsuario = new javax.swing.JLabel();
        erroNomeDeUsuario = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        passwordFieldSenha = new javax.swing.JPasswordField();
        passwordFieldConfirmarSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(1295, 737));
        setResizable(false);
        setSize(new java.awt.Dimension(1295, 737));

        panelTitle.setBackground(new java.awt.Color(140, 143, 157));
        panelTitle.setPreferredSize(new java.awt.Dimension(1295, 40));

        jLabel3.setText("Cadastro");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(620, 620, 620))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollPaneCadastro.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneCadastro.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPaneCadastro.setPreferredSize(new java.awt.Dimension(1295, 737));

        panelCadastro.setPreferredSize(new java.awt.Dimension(1295, 800));

        erroEmail.setForeground(new java.awt.Color(242, 13, 13));
        erroEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroEmail.setText("erro!");
        erroEmail.setPreferredSize(new java.awt.Dimension(453, 18));

        textFieldEmail.setToolTipText("");
        textFieldEmail.setPreferredSize(new java.awt.Dimension(453, 35));
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        tituloEmail.setText("E-mail");

        erroSenha.setForeground(new java.awt.Color(242, 13, 13));
        erroSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroSenha.setText("erro!");
        erroSenha.setPreferredSize(new java.awt.Dimension(453, 18));

        tituloSenha.setText("Senha");

        erroConfirmarSenha.setForeground(new java.awt.Color(242, 13, 13));
        erroConfirmarSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroConfirmarSenha.setText("erro!");
        erroConfirmarSenha.setPreferredSize(new java.awt.Dimension(453, 18));

        tituloConfirmarSenha.setText("Confirmar Senha");

        textFieldTelefone.setToolTipText("");
        textFieldTelefone.setPreferredSize(new java.awt.Dimension(453, 35));
        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });

        erroTelefone.setForeground(new java.awt.Color(242, 13, 13));
        erroTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroTelefone.setText("erro!");
        erroTelefone.setPreferredSize(new java.awt.Dimension(453, 18));

        tituloTelefone.setText("Telefone");

        textFieldNomeCompleto.setToolTipText("");
        textFieldNomeCompleto.setPreferredSize(new java.awt.Dimension(453, 35));
        textFieldNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeCompletoActionPerformed(evt);
            }
        });

        tituloNomeCompleto.setText("Nome Completo");

        erroNomeCompleto.setForeground(new java.awt.Color(242, 13, 13));
        erroNomeCompleto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroNomeCompleto.setText("erro!");
        erroNomeCompleto.setPreferredSize(new java.awt.Dimension(453, 18));

        textFieldNomeDeUsuario.setToolTipText("");
        textFieldNomeDeUsuario.setPreferredSize(new java.awt.Dimension(453, 35));
        textFieldNomeDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDeUsuarioActionPerformed(evt);
            }
        });

        tituloNomeDeUsuario.setText("Nome de Usuário");

        erroNomeDeUsuario.setForeground(new java.awt.Color(242, 13, 13));
        erroNomeDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroNomeDeUsuario.setText("erro!");
        erroNomeDeUsuario.setPreferredSize(new java.awt.Dimension(453, 18));

        botaoVoltar.setText("Voltar");
        botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseClicked(evt);
            }
        });
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setMaximumSize(new java.awt.Dimension(127, 40));
        botaoCadastrar.setMinimumSize(new java.awt.Dimension(127, 40));
        botaoCadastrar.setPreferredSize(new java.awt.Dimension(127, 40));
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseClicked(evt);
            }
        });
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        passwordFieldSenha.setPreferredSize(new java.awt.Dimension(453, 35));

        passwordFieldConfirmarSenha.setPreferredSize(new java.awt.Dimension(453, 35));

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(erroNomeDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tituloNomeDeUsuario)
                                    .addComponent(textFieldNomeDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(erroNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloNomeCompleto)
                            .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(erroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tituloTelefone)
                                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(erroConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                                    .addComponent(tituloConfirmarSenha)
                                    .addGap(337, 337, 337)))
                            .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(erroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                                    .addComponent(tituloSenha)
                                    .addGap(410, 410, 410)))
                            .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(erroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tituloEmail)
                                    .addComponent(textFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(passwordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(573, 573, 573)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(431, Short.MAX_VALUE))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloNomeCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(erroNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(tituloNomeDeUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNomeDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(erroNomeDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(tituloEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tituloSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tituloConfirmarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tituloTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        scrollPaneCadastro.setViewportView(panelCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPaneCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollPaneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeCompletoActionPerformed

    private void textFieldNomeDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDeUsuarioActionPerformed

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        new Login()
                .setVisible(true);                          
    }//GEN-LAST:event_botaoVoltarMouseClicked

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseClicked
              
        boolean usuarioValido = ValidadorCadastrarUsuario.eValido(
                textFieldNomeCompleto.getText(), 
                textFieldNomeDeUsuario.getText(),
                textFieldEmail.getText(),
                passwordFieldSenha.getText(), 
                passwordFieldConfirmarSenha.getText(), 
                textFieldTelefone.getText()
        );
        
        if(usuarioValido)
        {
            
            Usuario usuario = new Usuario(
                textFieldNomeCompleto.getText(), 
                textFieldNomeDeUsuario.getText(),
                textFieldEmail.getText(),
                passwordFieldSenha.getText(), 
                textFieldTelefone.getText()
            );
            
            
            UsuariosClient.inserir(usuario);
            
            resetarFields();
            
        }
        
    }//GEN-LAST:event_botaoCadastrarMouseClicked

    private void resetarFields()
    {
        textFieldNomeCompleto.setText("");
        textFieldNomeDeUsuario.setText("");
        textFieldEmail.setText("");
        passwordFieldSenha.setText("");
        passwordFieldConfirmarSenha.setText("");
        textFieldTelefone.setText("");
    }
    
    

    private List<JLabel> mensagensDeErro;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel erroConfirmarSenha;
    private javax.swing.JLabel erroEmail;
    private javax.swing.JLabel erroNomeCompleto;
    private javax.swing.JLabel erroNomeDeUsuario;
    private javax.swing.JLabel erroSenha;
    private javax.swing.JLabel erroTelefone;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPasswordField passwordFieldConfirmarSenha;
    private javax.swing.JPasswordField passwordFieldSenha;
    private javax.swing.JScrollPane scrollPaneCadastro;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeCompleto;
    private javax.swing.JTextField textFieldNomeDeUsuario;
    private javax.swing.JTextField textFieldTelefone;
    private javax.swing.JLabel tituloConfirmarSenha;
    private javax.swing.JLabel tituloEmail;
    private javax.swing.JLabel tituloNomeCompleto;
    private javax.swing.JLabel tituloNomeDeUsuario;
    private javax.swing.JLabel tituloSenha;
    private javax.swing.JLabel tituloTelefone;
    // End of variables declaration//GEN-END:variables
}
