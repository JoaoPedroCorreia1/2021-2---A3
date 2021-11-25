package backend.connection;


import java.sql.*;



public class ConnectionFactoryMysql {
    
    private String usuario = "root";
    private String senha = "Estr1@etne0!";
    private String host = "localhost";
    private String porta = "3306";
    private String tb_usuarios = "db_A3";
    
    public Connection obterConexaoUsuarios() throws SQLException{
       
        try{
            
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+porta+"/"+tb_usuarios, usuario, senha);
        return conn;
        
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
            
        }
        
    }
    
     
            
}
