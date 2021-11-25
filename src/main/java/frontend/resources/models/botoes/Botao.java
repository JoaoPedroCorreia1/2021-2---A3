/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend.resources.models.botoes;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import frontend.resources.utils.colors.PaletaDeCores;

public class Botao {
    
    // Atributos
    // 1. Componentes
    private JPanel panel;
    private JLabel label;
    private JLabel icone;
    
    // 2. Constantes
    private final String nome;
    
    private final Color corPadraoBackground;
    private final Color corPadraoTexto;
    
    private final Color corDestaqueBackground;
    private final Color corDestaqueTexto;
    
    private final String pathIconePadrao;
    private final String pathIconeSelecionado;
    
    // 3. Variáveis
    private boolean selecionado;
    
    // Contrução e Inicialização
    // 1. Sem Icone
    public Botao(
            String nome,
            
            JPanel panel,
            JLabel label,
            
            Color corPadraoBackground,
            Color corPadraoTexto,
            
            Color corDestaqueBackground,
            Color corDestaqueTexto
            )
    {
        
         // Identificação
        this.nome = nome;
        
        // Componentes
        this.panel = panel;
        this.label = label;
        
        // Cores
        this.corPadraoBackground = corPadraoBackground;
        this.corPadraoTexto = corPadraoTexto;
        
        this.corDestaqueBackground = corDestaqueBackground;
        this.corDestaqueTexto = corDestaqueTexto;
        
        // Imagem
        this.pathIconePadrao = "";
        this.pathIconeSelecionado = "";
        
        //Inicialização
        inicializar();
        
    }
    
    // 2. Com Icone
    public Botao(
            String nome,
            
            JPanel panel,
            JLabel label,
            JLabel icone,
            
            Color corPadraoBackground,
            Color corPadraoTexto,
            
            Color corDestaqueBackground,
            Color corDestaqueTexto,
            
            String pathIconePadrao,
            String pathIconeSelecionado
    ) {   
        // Identificação
        this.nome = nome;
        
        // Componentes
        this.panel = panel;
        this.label = label;
        this.icone = icone;
        
        // Cores
        this.corPadraoBackground = corPadraoBackground;
        this.corPadraoTexto = corPadraoTexto;
        
        this.corDestaqueBackground = corDestaqueBackground;
        this.corDestaqueTexto = corDestaqueTexto;
        
        // Imagem
        this.pathIconePadrao = pathIconePadrao;
        this.pathIconeSelecionado = pathIconeSelecionado;
        
        //Inicialização
        inicializar();
    }
    
    private void inicializar()
    {
        setSelecionado(false);
    }
    
    // Getters e Setters
    public String getNome(){return nome;}
    
     public JPanel getPanel() {return panel;}

    public JLabel getLabel() {return label;}

    public JLabel getIcone() {return icone;}

    public Color getCorPadraoBackground() {return corPadraoBackground;}

    public Color getCorPadraoTexto() {return corPadraoTexto;}

    public Color getCorDestaqueBackground() {return corDestaqueBackground;}
    
    public Color getCorDestaqueTexto() {return corDestaqueTexto;}

    public String getPathIconePadrao() {return pathIconePadrao;}

    public String getPathIconeSelecionado() {return pathIconeSelecionado;}

    public boolean isSelecionado() {return selecionado;}

    public void setSelecionado(boolean selecionado) {this.selecionado = selecionado;}
    
    
    // Métodos Publicos
    
    public void tornarInvisivel()
    {
        getPanel().setVisible(false);
    }
    
    public void tornarVisivel()
    {
        getPanel().setVisible(true);
    }
    
    public void destacar(
            Color backgroundColor,
            Color txtColor
    )
    {
        // Background
        getPanel().setBackground(
                    backgroundColor
        );
        
        // Texto
        getLabel().setForeground(
                    txtColor
        );
    }
    
    
    public void destacar(
            Color backgroundColor,
            Color txtColor,
            String pathIcone
    )
    {
        // Backgound e Texto
        destacar(
                backgroundColor,
                txtColor
        );
        
        // Icone
        var icone = new javax.swing.ImageIcon(
                        getClass()
                            .getResource(pathIcone)
        );
        
        getIcone().setIcon(icone);
    }
    
}
