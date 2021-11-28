/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.utils.validacao;

import javax.swing.JOptionPane;

public class ValidadorSenha {
    
    public static boolean eValido(
            String senha,
            String confirmarSenha,
            int tamanhoMinimo,
            int tamanhoMaximo
    )
    {
        
        if(senha.length() < tamanhoMinimo)
        {
            
            JOptionPane.showMessageDialog(null, 
                    String.format(
                            "Senha muito curta (min %d caracteres)",
                            tamanhoMinimo
                    )
            );
            
            return false;
            
        }
        
        if(senha.length() > tamanhoMaximo)
        {
            
            JOptionPane.showMessageDialog(null, 
                    String.format(
                            "Senha muito longa (max %d caracteres)",
                            tamanhoMinimo
                    )
            );
            
            return false;
            
        }
        
        if(!senha.equals(confirmarSenha))
        {
            JOptionPane.showMessageDialog(null, 
                    "Senhas não identicas"
            );
            
            return false;
            
        }
        
        return true;
        
    }
    
}
