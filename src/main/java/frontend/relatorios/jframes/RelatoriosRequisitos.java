/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend.relatorios.jframes;

/**
 *
 * @author joao
 */
public class RelatoriosRequisitos extends javax.swing.JFrame {

    /**
     * Creates new form Requisitos
     */
    public RelatoriosRequisitos() {
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

        scrollPaneTabelaFiltros = new javax.swing.JScrollPane();
        tabelaFiltros = new javax.swing.JTable();
        scrollPaneTabelaProjetos = new javax.swing.JScrollPane();
        tabelaProjetos = new javax.swing.JTable();
        botaoMaisInformacoes = new javax.swing.JButton();
        tituloTabelaFiltros = new javax.swing.JLabel();
        tituloTabelaProjetos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1295, 697));

        tabelaFiltros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Filtro", "Tipo"
            }
        ));
        tabelaFiltros.setRowHeight(40);
        scrollPaneTabelaFiltros.setViewportView(tabelaFiltros);

        tabelaProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Proprietário"
            }
        ));
        tabelaProjetos.setRowHeight(40);
        scrollPaneTabelaProjetos.setViewportView(tabelaProjetos);

        botaoMaisInformacoes.setText("Mais Informações");
        botaoMaisInformacoes.setPreferredSize(new java.awt.Dimension(137, 40));
        botaoMaisInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaisInformacoesActionPerformed(evt);
            }
        });

        tituloTabelaFiltros.setText("Filtros");

        tituloTabelaProjetos.setText("Projetos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoMaisInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTabelaFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloTabelaFiltros))
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTabelaProjetos)
                    .addComponent(scrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloTabelaFiltros)
                    .addComponent(tituloTabelaProjetos))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTabelaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneTabelaFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(botaoMaisInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMaisInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaisInformacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMaisInformacoesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMaisInformacoes;
    private javax.swing.JScrollPane scrollPaneTabelaFiltros;
    private javax.swing.JScrollPane scrollPaneTabelaProjetos;
    private javax.swing.JTable tabelaFiltros;
    private javax.swing.JTable tabelaProjetos;
    private javax.swing.JLabel tituloTabelaFiltros;
    private javax.swing.JLabel tituloTabelaProjetos;
    // End of variables declaration//GEN-END:variables
}
