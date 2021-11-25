package backend.service.login;

import backend.client.UsuariosClient;
import backend.controler.AplicacaoController;
import backend.models.Usuario;
import javax.swing.JOptionPane;

public class ValidadorUsuario {
    
    public static boolean eValido(
            String email,
            String senha
    ) {
        
        Usuario usuario 
                = UsuariosClient
                        .getByEmail(email);
        
        if(usuario == null){
            
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
        
        JOptionPane.showMessageDialog(null, "Senha incorreta");
        
        return false;
    }
    
}
