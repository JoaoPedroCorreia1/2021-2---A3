package backend.service.login;

import javax.swing.JOptionPane;

public class ValidadorCadastrar {
    
    public static boolean eValido(
            String nomeCompleto,
            String nomeUsuario,
            String email,
            String senha,
            String confirmarSenha,
            String telefone
    )
    {
        if(nomeCompleto.length() < 5)
        {
            JOptionPane.showMessageDialog(null, 
                    "Nome completo muito curto (min 5 caracteres)"
            );
            return false;
        }
        
        if(nomeCompleto.length() > 50)
        {
            JOptionPane.showMessageDialog(null, 
                    "Nome completo muito longo (max 50 caracteres)"
            );
            return false;
        }
        
        if(nomeUsuario.length() < 4)
        {
            JOptionPane.showMessageDialog(null, 
                    "Nome usuario muito curto (min 4 caracteres)"
            );
            return false;
        }
        
        if(nomeUsuario.length() > 30)
        {
            JOptionPane.showMessageDialog(null, 
                    "Nome de usuario muito longo (max 30 caracteres)"
            );
            return false;
        }
        
        if(email.length() < 4)
        {
            JOptionPane.showMessageDialog(null, 
                    "Email invalido"
            );
            return false;
        }
        
        if(email.length() > 100)
        {
            JOptionPane.showMessageDialog(null,
                    "Email muito longo (max 100 caracteres)"
            );
            return false;
        }
        
        if(senha.length() < 6)
        {
            JOptionPane.showMessageDialog(null,
                    "Senha muito curta (min 6 caracteres)"
            );
            return false;
        }
        
        if(senha.length() > 30)
        {
            JOptionPane.showMessageDialog(null,
                    "Senha muito longa (max 30 caracteres)"
            );
            return false;
        }
        
        if(senha.equals(confirmarSenha) == false)
        {
            
            JOptionPane.showMessageDialog(null,
                    "Senhas diferentes"
            );
            return false;
            
        }
        
        if(telefone.length() > 14
        || telefone.length() < 13)
        {
            JOptionPane.showMessageDialog(null,
                    "Telefone inválido"
            );
            return false;
        }
        
        return true;
        
    }
    
}
