package backend.utils.validacao.usuarios;

import database.dao.UsuarioDAO;
import javax.swing.JOptionPane;

public class ValidadorEditarUsuario {
    
    public static boolean eValido(
            String nomeCompleto,
            String nomeUsuario,
            String email,
            String senha,
            String novaSenha,
            String confirmarSenha,
            String telefone,
            boolean trocarSenha
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
        
        if(telefone.length() > 14
        || telefone.length() < 13)
        {
            JOptionPane.showMessageDialog(null,
                    "Telefone inválido"
            );
            return false;
        }
        
        if(trocarSenha == false)
        {
            return true;
        }
        
        if(!senha.equals(UsuarioDAO
                        .getByEmail(email)
                        .getSenha()
            )
        ) {
            
            JOptionPane.showMessageDialog(null,
                    "Senha inválida"
            );
            return false;
            
        }
        
        if(novaSenha.equals(senha))
        {
            JOptionPane.showMessageDialog(null, 
                    "Nova senha igual a senha atual"
            );
            return false;
        }
        
        if(novaSenha.length() < 6)
        {
            JOptionPane.showMessageDialog(null,
                    "Senha muito curta (min 6 caracteres)"
            );
            return false;
        }
        
        if(novaSenha.length() > 30)
        {
            JOptionPane.showMessageDialog(null,
                    "Senha muito longa (max 30 caracteres)"
            );
            return false;
        }
        
        if(novaSenha.equals(confirmarSenha) == false)
        {
            
            JOptionPane.showMessageDialog(null,
                    "Senhas diferentes"
            );
            return false;
            
        }
        
        return true;
        
    }
    
}
