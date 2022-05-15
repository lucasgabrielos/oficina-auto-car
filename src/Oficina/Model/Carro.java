
package Oficina.Model;

public class Carro extends Entidade {
    public String Placa;
    public String Modelo;
    public String Marca;
    public int Ano;
    public String Cor;
    
    //FK
    public int CodigoUsuario;
    public Usuario usuario;
    
    public Carro(){
        
    }
}
