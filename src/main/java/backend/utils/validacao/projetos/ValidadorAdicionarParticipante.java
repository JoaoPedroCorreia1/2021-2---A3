package backend.utils.validacao.projetos;

import backend.controllers.AplicacaoController;
import backend.dto.ProjetoDTO;
import backend.dto.UsuarioDTO;
import database.dao.ProjetoDAO;
import database.dao.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class ValidadorAdicionarParticipante {
    
    public static boolean eValido(
            String email
    ) {
        // validar se participante não está no projeto selecionado
        UsuarioDTO participante
                = UsuarioDAO.getByEmail(email);
        
        if(participante == null) 
        { 
            JOptionPane.showMessageDialog(null, "Email não encontrado");
            return false; 
        }
        
        List<ProjetoDTO> projetosDoParticipante 
                = ProjetoDAO
                        .getByIdUsuario(
                                participante.getIdUsuario()
                        );
        
        if(projetosDoParticipante == null) 
        { 
            return false; 
        }
        
        ProjetoDTO projetoSelecionado 
                = ProjetoDAO
                        .getByIdProjeto(
                                AplicacaoController.getIdProjetoSelecionado()
                        );
        
        if(projetoSelecionado == null) 
        { 
            return false; 
        }
        
        for(ProjetoDTO projeto : projetosDoParticipante)
        {
            
            if(projeto.getIdProjeto() 
                    == projetoSelecionado.getIdProjeto()
            ) {
                
                JOptionPane.showMessageDialog(null, "Participante já está includo");
                return false;
            
            }
            
        }
        
        return true;
    }
}
