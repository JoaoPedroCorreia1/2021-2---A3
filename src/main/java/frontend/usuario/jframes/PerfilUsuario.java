/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend.usuario.jframes;

import database.dao.UsuarioDAO;
import backend.controllers.AplicacaoController;
import backend.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author joao
 */
public class PerfilUsuario extends javax.swing.JFrame {

    public PerfilUsuario() {
        initComponents();
        inicializarComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldEmail = new javax.swing.JTextField();
        tituloEmail = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        tituloTelefone = new javax.swing.JLabel();
        textFieldNomeCompleto = new javax.swing.JTextField();
        tituloNomeCompleto = new javax.swing.JLabel();
        textFieldNomeUsuario = new javax.swing.JTextField();
        tituloNomeUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1295, 697));

        textFieldEmail.setToolTipText("");
        textFieldEmail.setEnabled(false);
        textFieldEmail.setPreferredSize(new java.awt.Dimension(453, 35));
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        tituloEmail.setText("E-mail");

        textFieldTelefone.setToolTipText("");
        textFieldTelefone.setEnabled(false);
        textFieldTelefone.setPreferredSize(new java.awt.Dimension(453, 35));
        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });

        tituloTelefone.setText("Telefone");

        textFieldNomeCompleto.setToolTipText("");
        textFieldNomeCompleto.setEnabled(false);
        textFieldNomeCompleto.setPreferredSize(new java.awt.Dimension(453, 35));
        textFieldNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeCompletoActionPerformed(evt);
            }
        });

        tituloNomeCompleto.setText("Nome Completo");

        textFieldNomeUsuario.setToolTipText("");
        textFieldNomeUsuario.setEnabled(false);
        textFieldNomeUsuario.setPreferredSize(new java.awt.Dimension(453, 35));
        textFieldNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeUsuarioActionPerformed(evt);
            }
        });

        tituloNomeUsuario.setText("Nome de Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTelefone)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloNomeUsuario)
                    .addComponent(textFieldNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloNomeCompleto)
                    .addComponent(tituloEmail)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(420, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(tituloNomeCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tituloNomeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tituloEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tituloTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void textFieldNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeCompletoActionPerformed

    private void textFieldNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeUsuarioActionPerformed

    private void inicializarComponentes () {
        
        int idUsuario 
                = AplicacaoController
                        .getIdUsuarioSelecionado();
        
        UsuarioDTO usuario 
                = UsuarioDAO
                        .getById(
                              idUsuario  
                        );
        
        textFieldNomeCompleto.setText(usuario.getNomeCompleto());
        textFieldNomeUsuario.setText(usuario.getNomeUsuario());
        textFieldEmail.setText(usuario.getEmail());
        textFieldTelefone.setText(usuario.getTelefone());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeCompleto;
    private javax.swing.JTextField textFieldNomeUsuario;
    private javax.swing.JTextField textFieldTelefone;
    private javax.swing.JLabel tituloEmail;
    private javax.swing.JLabel tituloNomeCompleto;
    private javax.swing.JLabel tituloNomeUsuario;
    private javax.swing.JLabel tituloTelefone;
    // End of variables declaration//GEN-END:variables
}
