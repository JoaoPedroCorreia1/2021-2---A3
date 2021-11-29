package database.dao;

import backend.dto.ProjetoDTO;
import database.connection.ConnectionFactoryMysql;
import backend.dto.UsuarioDTO;
;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    public static List<UsuarioDTO> getByIdProjeto(int idProjeto) {

        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();
        
        List<UsuarioDTO> usuarios = new ArrayList<>();

        try ( Connection conn = conexao.obterConexaoDatabase()) {

            PreparedStatement smt = null;
            ResultSet rs = null;

            smt = conn.prepareStatement(
                      "SELECT * "
                    + "FROM tb_usuarios "
                    + "INNER JOIN tb_usuario_projeto USING (id_usuario) "
                    + "WHERE id_projeto = ?");
            smt.setInt(1, idProjeto);
            rs = smt.executeQuery();

            while (rs.next()) {

                UsuarioDTO usuario = new UsuarioDTO(
                        rs.getString("nome_completo"),
                        rs.getString("nome_usuario"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("telefone")
                );
                
                usuario.setIdUsuario(rs.getInt("id_usuario"));

                usuarios.add(usuario);
                
            }
            
            smt.close();

        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Falha ao obter usuários");
        e.printStackTrace();
        }
        
        return usuarios;

    }
    
    public static UsuarioDTO getById(int id_usuario) {

        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        try ( Connection conn = conexao.obterConexaoDatabase()) {

            PreparedStatement smt = null;
            ResultSet rs = null;

            smt = conn.prepareStatement(
                      "SELECT * "
                    + "FROM tb_usuarios "
                    + "WHERE id_usuario = ?");
            smt.setInt(1, id_usuario);
                    
            rs = smt.executeQuery();
            
            while (rs.next()) {

                UsuarioDTO usuario = new UsuarioDTO(
                        rs.getString("nome_completo"),
                        rs.getString("nome_usuario"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("telefone")
                );
                
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                
                smt.close();
                
                return usuario;
                
            }

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Falha ao obter usuário");
            
        }

        return null;
        
    }
    
    public static UsuarioDTO getByEmail(String email) {

        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        try ( Connection conn = conexao.obterConexaoDatabase()) {

            PreparedStatement smt = null;
            ResultSet rs = null;

            smt = conn.prepareStatement(
                      "SELECT * "
                    + "FROM tb_usuarios "
                    + "WHERE email = ?");
            smt.setString(1, email);
                    
            rs = smt.executeQuery();
                
            
            if(rs.next()){
                UsuarioDTO usuario = new UsuarioDTO(
                    rs.getString("nome_completo"),
                    rs.getString("nome_usuario"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getString("telefone")
            );
            usuario.setIdUsuario(rs.getInt("id_usuario"));
                
            return usuario;
            }

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Email não encontrado");
            
        }

        return null;
        
    }
    
    public static void insert(UsuarioDTO usuario){
        
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        try ( Connection conn = conexao.obterConexaoDatabase()) {
            PreparedStatement smt = null;
            smt = conn.prepareStatement(
                    "INSERT INTO tb_usuarios ("
                            + "nome_completo, "
                            + "nome_usuario, "
                            + "email, "
                            + "senha, "
                            + "telefone"
                            + ")"
                            + "VALUES(?, ?, ?, ?, ?)"
            );
            smt.setString(1,usuario.getNomeCompleto());
            smt.setString(2,usuario.getNomeUsuario());
            smt.setString(3,usuario.getEmail());
            smt.setString(4,usuario.getSenha());
            smt.setString(5,usuario.getTelefone());

            smt.executeUpdate();
            smt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            
        }
        
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar");
            
            
        } 
        
    }
    
    public static void updateById(UsuarioDTO usuarioEditado){
        
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        try ( Connection conn = conexao.obterConexaoDatabase()) {
            PreparedStatement smt = null;
            smt = conn.prepareStatement("UPDATE tb_usuarios SET "
                    + "nome_completo = ?, "
                    + "nome_usuario = ?, "
                    + "email = ?, "
                    + "senha = ?, "
                    + "telefone = ? "
                    + "where id_usuario = ?");
            smt.setString(1, usuarioEditado.getNomeCompleto());
            smt.setString(2,usuarioEditado.getNomeUsuario());
            smt.setString(3,usuarioEditado.getEmail());
            smt.setString(4,usuarioEditado.getSenha());
            smt.setString(5,usuarioEditado.getTelefone());
            smt.setInt(6, usuarioEditado.getIdUsuario());
            
            smt.executeUpdate();
            smt.close();
            
            JOptionPane.showMessageDialog(null, "Atulizado com sucesso!!!");

        }
        
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Falha ao atualizar");
            
            
        } 
    }
    
    public static void removeById(int id_usuario){
        
        ConnectionFactoryMysql conexao = new ConnectionFactoryMysql();

        UsuarioDTO usuario = getById(id_usuario);
        
        try ( Connection conn = conexao.obterConexaoDatabase()) {
            PreparedStatement smt = null;
            smt = conn.prepareStatement(
                      "Delete FROM tb_usuarios "
                    + "WHERE id_usuario = ?");
            smt.setInt(1, id_usuario);
            
            smt.executeUpdate();
            smt.close();
            
            
            List<ProjetoDTO> projetos 
                    = ProjetoDAO.getByIdUsuario(id_usuario);
            
            for(ProjetoDTO projeto : projetos)
            {
                
                ProjetoDAO.removeParticipanteById(
                        id_usuario, 
                        projeto.getIdProjeto()
                );
                
            }
            
            JOptionPane.showMessageDialog(null, "Usuario deletado");

        }
        
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Falha ao deletar");
            
            
        } 
    }

}
