
package Oficina.Model;

import Oficina.Context.ExceptionContext;
import Oficina.Context.UsuarioContext;

public class Usuario extends Entidade {
    
    public String Nome;
    private String Email;
    private String Senha;
    private String Telefone;
    private String Cpf;
    private String Rg;

    public Usuario(){}
    public Usuario(String Nome, String Email, String Senha, String Telefone, String Cpf, String Rg) {
        this.Nome = Nome;
        this.Email = Email;
        this.Senha = Senha;
        this.Telefone = Telefone;
        this.Cpf = Cpf;
        this.Rg = Rg;
    }
    
//   public Boolean getAtivo() {
//        return Ativo;
//    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public String getSenha() {
        return Senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getCpf() {
        return Cpf;
    }

    public String getRg() {
        return Rg;
    }

   

//     public void setAtivo(Boolean ativo) {
//        this.Ativo = ativo;
//    }
     
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }
}
