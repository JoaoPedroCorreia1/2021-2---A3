package frontend.gerenciador.jframes;

import frontend.projetos.jframes.AdicionarProjeto;
import frontend.projetos.jframes.EditarParticipantes;
import frontend.projetos.jframes.EditarProjeto;
import frontend.projetos.jframes.ListaProjetos;
import frontend.projetos.jframes.ParticipantesProjetos;
import frontend.projetos.jframes.RemoverProjeto;
import frontend.relatorios.jframes.RelatoriosProjetos;
import frontend.relatorios.jframes.RelatoriosRequisitos;
import frontend.requisitos.jframes.AdicionarRequisito;
import frontend.requisitos.jframes.EditarRequisito;
import frontend.requisitos.jframes.QuadroRequisitos;
import frontend.requisitos.jframes.RemoverRequisito;
import frontend.usuario.jframes.DeletarUsuario;
import frontend.usuario.jframes.EditarUsuario;
import frontend.usuario.jframes.PerfilUsuario;

/**
 *
 * @author joao
 */
public class Gerenciador extends javax.swing.JFrame {

    private static int idUsuarioSelecionado;
    private static int idProjetoSelecioando;
    private static int idRequisitoSelecionado;
    
    public Gerenciador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuConta = new javax.swing.JMenu();
        menuItemPerfil = new javax.swing.JMenuItem();
        menuItemContaEditar = new javax.swing.JMenuItem();
        menuItemContaDeletar = new javax.swing.JMenuItem();
        menuProjetos = new javax.swing.JMenu();
        menuItemProjetosSelecionar = new javax.swing.JMenuItem();
        menuItemProjetosParticipantes = new javax.swing.JMenuItem();
        menuItemProjetosAdicionarParticipantes = new javax.swing.JMenuItem();
        menuItemProjetosEditar = new javax.swing.JMenuItem();
        menuItemProjetosAdicionar = new javax.swing.JMenuItem();
        menuItemProjetosRemover = new javax.swing.JMenuItem();
        menuRequisitos = new javax.swing.JMenu();
        menuItemRequisitosSelecionar = new javax.swing.JMenuItem();
        menuItemRequisitosParticipantes = new javax.swing.JMenuItem();
        menuItemRequisitosAdicionarParticipantes = new javax.swing.JMenuItem();
        menuItemRequisitosAdicionar = new javax.swing.JMenuItem();
        menuItemRequisitosEditar = new javax.swing.JMenuItem();
        menuItemRequisitosRemover = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuItemRelatoriosProjetos = new javax.swing.JMenuItem();
        menuItemRelatoriosRequisitos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1295, 737));

        menuBar.setBackground(new java.awt.Color(140, 143, 157));
        menuBar.setPreferredSize(new java.awt.Dimension(1295, 40));

        menuConta.setText("Conta");
        menuConta.setPreferredSize(new java.awt.Dimension(52, 40));

        menuItemPerfil.setText("Perfil");
        menuItemPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemPerfilMouseClicked(evt);
            }
        });
        menuItemPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPerfilActionPerformed(evt);
            }
        });
        menuConta.add(menuItemPerfil);

        menuItemContaEditar.setText("Editar");
        menuItemContaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemContaEditarActionPerformed(evt);
            }
        });
        menuConta.add(menuItemContaEditar);

        menuItemContaDeletar.setText("Deletar");
        menuItemContaDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemContaDeletarActionPerformed(evt);
            }
        });
        menuConta.add(menuItemContaDeletar);

        menuBar.add(menuConta);

        menuProjetos.setText("Projetos");
        menuProjetos.setPreferredSize(new java.awt.Dimension(71, 40));

        menuItemProjetosSelecionar.setText("Selecionar");
        menuItemProjetosSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProjetosSelecionarActionPerformed(evt);
            }
        });
        menuProjetos.add(menuItemProjetosSelecionar);

        menuItemProjetosParticipantes.setText("Participantes");
        menuItemProjetosParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProjetosParticipantesActionPerformed(evt);
            }
        });
        menuProjetos.add(menuItemProjetosParticipantes);

        menuItemProjetosAdicionarParticipantes.setText("Editar Participantes");
        menuItemProjetosAdicionarParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProjetosAdicionarParticipantesActionPerformed(evt);
            }
        });
        menuProjetos.add(menuItemProjetosAdicionarParticipantes);

        menuItemProjetosEditar.setText("Editar");
        menuItemProjetosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProjetosEditarActionPerformed(evt);
            }
        });
        menuProjetos.add(menuItemProjetosEditar);

        menuItemProjetosAdicionar.setText("Adicionar");
        menuItemProjetosAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProjetosAdicionarActionPerformed(evt);
            }
        });
        menuProjetos.add(menuItemProjetosAdicionar);

        menuItemProjetosRemover.setText("Remover");
        menuItemProjetosRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProjetosRemoverActionPerformed(evt);
            }
        });
        menuProjetos.add(menuItemProjetosRemover);

        menuBar.add(menuProjetos);

        menuRequisitos.setText("Requisitos");
        menuRequisitos.setPreferredSize(new java.awt.Dimension(83, 40));

        menuItemRequisitosSelecionar.setText("Quadro");
        menuItemRequisitosSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRequisitosSelecionarActionPerformed(evt);
            }
        });
        menuRequisitos.add(menuItemRequisitosSelecionar);

        menuItemRequisitosParticipantes.setText("Participantes");
        menuRequisitos.add(menuItemRequisitosParticipantes);

        menuItemRequisitosAdicionarParticipantes.setText("Adicionar Participante");
        menuRequisitos.add(menuItemRequisitosAdicionarParticipantes);

        menuItemRequisitosAdicionar.setText("Adicionar");
        menuItemRequisitosAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRequisitosAdicionarActionPerformed(evt);
            }
        });
        menuRequisitos.add(menuItemRequisitosAdicionar);

        menuItemRequisitosEditar.setText("Editar");
        menuItemRequisitosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRequisitosEditarActionPerformed(evt);
            }
        });
        menuRequisitos.add(menuItemRequisitosEditar);

        menuItemRequisitosRemover.setText("Remover");
        menuItemRequisitosRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRequisitosRemoverActionPerformed(evt);
            }
        });
        menuRequisitos.add(menuItemRequisitosRemover);

        menuBar.add(menuRequisitos);

        menuRelatorios.setText("Relatórios");

        menuItemRelatoriosProjetos.setText("Projetos");
        menuItemRelatoriosProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelatoriosProjetosActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuItemRelatoriosProjetos);

        menuItemRelatoriosRequisitos.setText("Requisitos");
        menuItemRelatoriosRequisitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelatoriosRequisitosActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuItemRelatoriosRequisitos);

        menuBar.add(menuRelatorios);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1295, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemContaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemContaEditarActionPerformed
        new EditarUsuario()
                .setVisible(true);
    }//GEN-LAST:event_menuItemContaEditarActionPerformed

    private void menuItemContaDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemContaDeletarActionPerformed
        new DeletarUsuario()
                .setVisible(true);
    }//GEN-LAST:event_menuItemContaDeletarActionPerformed

    private void menuItemProjetosAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProjetosAdicionarActionPerformed
        new AdicionarProjeto()
                .setVisible(true);
    }//GEN-LAST:event_menuItemProjetosAdicionarActionPerformed

    private void menuItemPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemPerfilMouseClicked
         new PerfilUsuario()
                .setVisible(true);
    }//GEN-LAST:event_menuItemPerfilMouseClicked

    private void menuItemPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPerfilActionPerformed
        new PerfilUsuario()
                .setVisible(true);
    }//GEN-LAST:event_menuItemPerfilActionPerformed

    private void menuItemProjetosSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProjetosSelecionarActionPerformed
        new ListaProjetos()
                .setVisible(true);
    }//GEN-LAST:event_menuItemProjetosSelecionarActionPerformed

    private void menuItemRequisitosSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRequisitosSelecionarActionPerformed
        new QuadroRequisitos()
                .setVisible(true);
    }//GEN-LAST:event_menuItemRequisitosSelecionarActionPerformed

    private void menuItemRelatoriosProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelatoriosProjetosActionPerformed
        new RelatoriosProjetos()
                .setVisible(true);
    }//GEN-LAST:event_menuItemRelatoriosProjetosActionPerformed

    private void menuItemRelatoriosRequisitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelatoriosRequisitosActionPerformed
        new RelatoriosRequisitos()
                .setVisible(true);
    }//GEN-LAST:event_menuItemRelatoriosRequisitosActionPerformed

    private void menuItemProjetosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProjetosEditarActionPerformed
        new EditarProjeto()
                .setVisible(true);
    }//GEN-LAST:event_menuItemProjetosEditarActionPerformed

    private void menuItemProjetosRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProjetosRemoverActionPerformed
        new RemoverProjeto()
                .setVisible(true);
    }//GEN-LAST:event_menuItemProjetosRemoverActionPerformed

    private void menuItemRequisitosRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRequisitosRemoverActionPerformed
        new RemoverRequisito()
                .setVisible(true);
    }//GEN-LAST:event_menuItemRequisitosRemoverActionPerformed

    private void menuItemRequisitosAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRequisitosAdicionarActionPerformed
        new AdicionarRequisito()
                .setVisible(true);
    }//GEN-LAST:event_menuItemRequisitosAdicionarActionPerformed

    private void menuItemRequisitosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRequisitosEditarActionPerformed
        new EditarRequisito()
                .setVisible(true);
    }//GEN-LAST:event_menuItemRequisitosEditarActionPerformed

    private void menuItemProjetosParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProjetosParticipantesActionPerformed
       new ParticipantesProjetos()
                .setVisible(true);
    }//GEN-LAST:event_menuItemProjetosParticipantesActionPerformed

    private void menuItemProjetosAdicionarParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProjetosAdicionarParticipantesActionPerformed
        new EditarParticipantes()
                .setVisible(true);
    }//GEN-LAST:event_menuItemProjetosAdicionarParticipantesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConta;
    private javax.swing.JMenuItem menuItemContaDeletar;
    private javax.swing.JMenuItem menuItemContaEditar;
    private javax.swing.JMenuItem menuItemPerfil;
    private javax.swing.JMenuItem menuItemProjetosAdicionar;
    private javax.swing.JMenuItem menuItemProjetosAdicionarParticipantes;
    private javax.swing.JMenuItem menuItemProjetosEditar;
    private javax.swing.JMenuItem menuItemProjetosParticipantes;
    private javax.swing.JMenuItem menuItemProjetosRemover;
    private javax.swing.JMenuItem menuItemProjetosSelecionar;
    private javax.swing.JMenuItem menuItemRelatoriosProjetos;
    private javax.swing.JMenuItem menuItemRelatoriosRequisitos;
    private javax.swing.JMenuItem menuItemRequisitosAdicionar;
    private javax.swing.JMenuItem menuItemRequisitosAdicionarParticipantes;
    private javax.swing.JMenuItem menuItemRequisitosEditar;
    private javax.swing.JMenuItem menuItemRequisitosParticipantes;
    private javax.swing.JMenuItem menuItemRequisitosRemover;
    private javax.swing.JMenuItem menuItemRequisitosSelecionar;
    private javax.swing.JMenu menuProjetos;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuRequisitos;
    // End of variables declaration//GEN-END:variables
}
