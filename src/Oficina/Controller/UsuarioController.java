
package Oficina.Controller;

import Oficina.Context.ExceptionContext;
import Oficina.Context.UsuarioContext;
import Oficina.Model.Usuario;

public class UsuarioController {
    
    public static boolean ValidarUsuario(String Nome, String Email, String Senha, String Telefone, String Cpf, String Rg){
        
        if(Nome.length() > 0 && Email.length() > 0 && Senha.length() > 0 && Telefone.length() > 0 && Cpf.length() > 0 && Rg.length() > 0){
            return true;
        }else{
            return false;
        }
    }
    public static void CadastrarUsuario(Usuario usuario) throws ExceptionContext{
        new UsuarioContext().telaCadastro(usuario);
    }
    
    
}
