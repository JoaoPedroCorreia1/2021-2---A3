package database.dao;

import backend.dto.ProjetoDTO;
import backend.dto.UsuarioDTO;
import database.connection.ConnectionFactoryMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProjetoDAO { 
    
    // Projeto
    public static List<ProjetoDTO> getByIdUsuario(int idUsuario) {

        List<ProjetoDTO> projetos = new ArrayList<>();
        
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        try ( Connection conn = conexao.obterConexaoDatabase()) {

            // fazer requisição
            PreparedStatement smt = null;
            ResultSet rs = null;

            smt = conn.prepareStatement(
                      "SELECT * "
                    + "FROM tb_projetos "
                    + "INNER JOIN tb_usuario_projeto USING (id_projeto)"
                    + "WHERE id_usuario = ? ");
            smt.setInt(1, idUsuario);
            
            rs = smt.executeQuery();

            // criar projetos
            while (rs.next()) {

                ProjetoDTO projeto = new ProjetoDTO(
                        rs.getInt("id_usuario_autor"),
                        
                        rs.getString("nome"),
                        rs.getString("descricao")
                );

                projeto.setIdProjeto(rs.getInt("id_projeto"));
                
                
                projetos.add(projeto);
                
            }

        } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Falha ao obter dados");
        }
        
        return projetos;
        
    }
    
    public static List<ProjetoDTO> getByIdUsuarioAutor(int idUsuarioAutor) {

        List<ProjetoDTO> projetos = new ArrayList<>();
        
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        try ( Connection conn = conexao.obterConexaoDatabase()) {

            // fazer requisição
            PreparedStatement smt = null;
            ResultSet rs = null;

            smt = conn.prepareStatement(
                      "SELECT * "
                    + "FROM tb_projetos "
                    + "WHERE id_usuario_autor = ? ");
            smt.setInt(1, idUsuarioAutor);
            
            rs = smt.executeQuery();

            // criar projetos
            while (rs.next()) {

                ProjetoDTO projeto = new ProjetoDTO(
                        rs.getInt("id_usuario_autor"),
                        
                        rs.getString("nome"),
                        rs.getString("descricao")
                );

                projeto.setIdProjeto(rs.getInt("id_projeto"));
                
                
                projetos.add(projeto);
                
            }

        } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Falha ao obter dados");
        }
        
        return projetos;
        
    }
    
    public static ProjetoDTO getByIdProjeto(int idProjeto) {

        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        try ( Connection conn = conexao.obterConexaoDatabase()) {

            PreparedStatement smt = null;
            ResultSet rs = null;

            smt = conn.prepareStatement(
                      "SELECT * "
                    + "FROM tb_projetos "
                    + "WHERE id_projeto = ? ");
            smt.setInt(1, idProjeto);
            
            rs = smt.executeQuery();

            if(rs.next())
            {

                ProjetoDTO projeto = new ProjetoDTO(
                        rs.getInt("id_usuario_autor"),
                        
                        rs.getString("nome"),
                        rs.getString("descricao")
                );

                projeto.setIdProjeto(rs.getInt("id_projeto"));
                
                return projeto;
            }

        } catch (SQLException e) {
        e.printStackTrace();
        }

        return null;

    }    
    
    public static void insert(ProjetoDTO projeto){
                
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

         try ( Connection conn = conexao.obterConexaoDatabase()) {
            PreparedStatement smt = null;
            smt = conn.prepareStatement(
                    "INSERT INTO tb_projetos ("
                    + "id_usuario_autor, "
                    + "nome, "
                    + "descricao"
                    + ") "
                    + "VALUES(?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            smt.setInt(1, projeto.getIdUsuarioAutor());
            smt.setString(2, projeto.getNome());
            smt.setString(3, projeto.getDescricao());

            smt.executeUpdate();
            
            
            var rs = smt.getGeneratedKeys();
            int id_projeto = -1;
            if(rs.next())
            {
                id_projeto = Integer.parseInt(rs.getString(1));
            }
            
            smt.close();
            
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso");
            
            insertParticipanteById(
                    projeto.getIdUsuarioAutor(),
                    id_projeto
            );
        }
        
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
         
    }
    
    public static void updateById(ProjetoDTO projeto, int idProjeto){
                
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

         try ( Connection conn = conexao.obterConexaoDatabase()) {
            PreparedStatement smt = null;
            smt = conn.prepareStatement(
                    "UPDATE tb_projetos SET "
                    + "nome = ?, "
                    + "descricao = ? "
                    + "WHERE id_projeto = ?");
            smt.setString(1, projeto.getNome());
            smt.setString(2, projeto.getDescricao());
            smt.setInt(3, idProjeto);

            smt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        }
        
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Falha ao atualizar");
            
        }
         
    }
         
    public static void removeById(int id_projeto){
        
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        try ( Connection conn = conexao.obterConexaoDatabase()) {
            PreparedStatement smt = null;
            smt = conn.prepareStatement(
                      "DELETE FROM tb_projetos "
                    + "WHERE id_projeto = ?");
            smt.setInt(1, id_projeto);
            
            smt.executeUpdate();
            smt.close();
            
            smt = null;
            smt = conn.prepareStatement(
                      "DELETE FROM tb_usuario_projeto "
                    + "WHERE id_projeto = ?");
            smt.setInt(1, id_projeto);
            
            smt.executeUpdate();
            smt.close();
            
            JOptionPane.showMessageDialog(null, "Projeto deletado");

        }
        
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Falha ao deletar");
            
            
        } 
        
    }
    
    // Participantes
    public static void insertParticipanteById(int idUsuario, int idProjeto)
    {
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

         try ( Connection conn = conexao.obterConexaoDatabase()) {
            PreparedStatement smt = null;
            smt = conn.prepareStatement(
                    "INSERT INTO tb_usuario_projeto ("
                    + "id_usuario, "
                    + "id_projeto"
                    + ") "
                    + "VALUES(?, ?)");
            smt.setInt(1, idUsuario);
            smt.setInt(2, idProjeto);
            
            smt.executeUpdate();
            smt.close();
            
            JOptionPane.showMessageDialog(null, "Participante adicionado com sucesso");

        }
        
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Falha ao adicionar participante");
            
        }
    }
    
    public static void removeParticipanteById(int idUsuario, int idProjeto)
    {
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

         try ( Connection conn = conexao.obterConexaoDatabase()) {
            PreparedStatement smt = null;
            smt = conn.prepareStatement(
                    "DELETE FROM tb_usuario_projeto "
                  + "WHERE id_usuario = ? AND id_projeto = ?");
            smt.setInt(1, idUsuario);
            smt.setInt(2, idProjeto);
            
            List<UsuarioDTO> participantesRestantes 
                    = UsuarioDAO.getByIdProjeto(idProjeto);
            
            
            // se estiver vazio, remover projeto
            if(participantesRestantes.isEmpty())
            {
                    removeById(idProjeto);
            }
            
            smt.executeUpdate();
            smt.close();
            
            JOptionPane.showMessageDialog(null, "Participante removido com sucesso");

        }
        
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Falha ao adicionar participante");
            
        }
    }
}
    


    
    
    
