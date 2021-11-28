package backend.utils.validacao.login;

import database.dao.UsuarioDAO;
import backend.controllers.AplicacaoController;
import backend.dto.UsuarioDTO;
import javax.swing.JOptionPane;

public class ValidadorLoginUsuario {
    
    public static boolean eValido(
            String email,
            String senha
    ) {
        
        UsuarioDTO usuario 
                = UsuarioDAO
                        .getByEmail(email);
        
        if(usuario == null){
            
            JOptionPane.showMessageDialog(null, "Email inválido");
            return false;
            
        }
        
        if(usuario.getSenha()
                .equals(senha)
        ) {
            
            AplicacaoController
                .setIdUsuarioSelecionado(
                        usuario.getIdUsuario()
            );
            
            return true;
            
        }
        
        JOptionPane.showMessageDialog(null, "Senha inválida");
        
        return false;
    }
    
}
