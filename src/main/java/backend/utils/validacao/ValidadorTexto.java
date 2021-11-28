/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.utils.validacao;

import javax.swing.JOptionPane;

public class ValidadorTexto {
    
    public static boolean eValido(
            String texto,
            String nomeDoCampo,
            int tamanhoMinimo,
            int tamanhoMaximo
    )
    {
        
        if(texto.length() < tamanhoMinimo)
        {
            
            JOptionPane.showMessageDialog(null, 
                    String.format(
                            "'%s' muito curto (min %d caracteres)",
                            nomeDoCampo,
                            tamanhoMinimo
                    )
            );
            
            return false;
            
        }
        
        if(texto.length() > tamanhoMaximo)
        {
            
            JOptionPane.showMessageDialog(null, 
                    String.format(
                            "'%s' muito curta (min %d caracteres)",
                            nomeDoCampo,
                            tamanhoMinimo
                    )
            );
            
            return false;
            
        }
        
        return true;
        
    }
    
}
