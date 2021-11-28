package backend.utils.validacao.projetos;

import backend.utils.validacao.ValidadorTexto;

public class ValidadorAdicionarProjeto {
    
    public static boolean eValido(
            String nome,
            String descricao
    ) {
        if(!ValidadorTexto
                .eValido(nome, "nome", 5, 50))
        { return false; }
        
        if(!ValidadorTexto
                .eValido(
                        descricao, 
                        "descricao", 
                        0, 
                        500))
        { return false; }
        
        return true;
        
    }
    
}
