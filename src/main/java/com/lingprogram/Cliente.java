package main.java.com.lingprogram;

public class Cliente extends Pessoa{
    private String codCliente;
    private static int numCodCliente = 0;

    public Cliente(String nome, String sobrenome, String email, boolean sexo){
        super(nome, sobrenome, email, sexo);
        numCodCliente++;
        codCliente = "C"+numCodCliente;
    }

    // método para tratar genero obtido através do getSexo()
    @Override
    public String getGenero(){
        if(getSexo()){
            return "Masculino";
        }else{
            return "Feminino";
        }
    }

    @Override
    public String getCodigo() {
            return new String(this.codCliente);
    }

    @Override
    public String getSaudacao() {
        if(getSexo()) {
            return "Prezado Senhor " + getSobrenome();
        }else {
            return "Prezada Senhora " + getSobrenome();
        }
    }

    @Override
    public String toString(){
        return "\nNome: "+getNome()+"\nSobrenome: "+getSobrenome()+"\nEmail: "+getEmail()+
                "\nSexo: "+getGenero()+"\nCodigo do Cliente: "+getCodigo();
    }
}
