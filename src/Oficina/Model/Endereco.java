
package Oficina.Model;

public class Endereco extends Entidade {
    public String Rua;
    public String Bairro;
    public String cidade;
    public String Estado;
    public int Cep;
    public int Numero;
    
    //Fk
    public int CodigoUsuario;
    public Usuario usuario;
    
    
    public Endereco(){
        
    }
}
