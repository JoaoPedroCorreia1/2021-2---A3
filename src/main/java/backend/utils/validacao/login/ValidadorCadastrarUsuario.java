package backend.utils.validacao.login;

import backend.utils.validacao.ValidadorSenha;
import backend.utils.validacao.ValidadorTexto;
import javax.swing.JOptionPane;

public class ValidadorCadastrarUsuario {
    
    public static boolean eValido(
            String nomeCompleto,
            String nomeUsuario,
            String email,
            String senha,
            String confirmarSenha,
            String telefone
    )
    {
        
        if(!ValidadorTexto.eValido(
                nomeCompleto, 
                "Nome completo",
                5, 
                50
            )
        ) { return false; }
        
        if(!ValidadorTexto.eValido(
                nomeUsuario, 
                "Nome usuário", 
                4, 
                30
            )
        ) { return false; }
        
       if(!ValidadorTexto.eValido(
                email, 
               "E-mail",
                4, 
                100
           )
        ) { return false; }
       
       if(!ValidadorSenha.eValido(
               senha,
               confirmarSenha,
               6,
               100
           )
        ) { return false; }
        
        if(!ValidadorTexto.eValido(
                telefone, 
                "Telefone",
                13, 
                14
           )
        ) { return false; }
        
        return true;
        
    }
    
}
