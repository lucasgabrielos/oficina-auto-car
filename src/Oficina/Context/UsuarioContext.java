/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oficina.Context;

 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;
 import Oficina.Model.Usuario;
 

public class UsuarioContext {
    
    public void telaCadastro (Usuario usuario) throws ExceptionContext{
    String sql = "insert into usuario (nome,email,senha,telefone,cpf,rg) value (?,?,?,?,?,?)";
    PreparedStatement PStatement = null;
    Connection connection = null;
    
        try { 
                connection = new ConnectionMVC().GetConnection();
                PStatement = connection.prepareStatement(sql);
                PStatement.setString(1,usuario.getNome());
                PStatement.setString(2,usuario.getEmail());
                PStatement.setString(3,usuario.getSenha());
                PStatement.setString(4,usuario.getTelefone());
                PStatement.setString(5,usuario.getCpf());
                PStatement.setString(6,usuario.getRg());

                PStatement.execute();

           } catch (SQLException ex){
               ex.printStackTrace();
               throw new ExceptionContext ("Erro ao cadastra usuario"+ex);
           }
            finally{
                try {
                        if (PStatement != null){PStatement.close();}
            } 
            catch (Exception cuscuz) {
                throw new ExceptionContext ("Erro ao cadastra usuario" + cuscuz);
                
            } try {
                       if(connection !=null){connection.close();}
            }catch (SQLException e){
                throw new ExceptionContext ("Erro ao fechar a conexão"+e);
            }
        }
    }
}
