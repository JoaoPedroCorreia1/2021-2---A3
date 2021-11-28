/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.utils.validacao.projetos;

import backend.controllers.AplicacaoController;
import backend.dto.ProjetoDTO;
import backend.dto.UsuarioDTO;
import database.dao.ProjetoDAO;
import database.dao.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joao
 */
public class ValidadorRemoverParticipante {
    
    public static boolean eValido(
            String email
    ) {
        // validar se participante está no projeto selecionado
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
                
                
                return true;
            
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Participante não está no projeto");
        return false;
    }
    
}
