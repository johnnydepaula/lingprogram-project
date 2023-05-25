package main.java.com.lingprogram;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String email;
    private Boolean sexo;
    private String codCliente;
    private static int numCodCliente = 0;


    public Cliente(String nome, String sobrenome, String email, Boolean sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.sexo = sexo;

        numCodCliente++;
        codCliente = "C"+numCodCliente;
    }

    // Gets e Sets
    public String getNome() {
        return new String(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return new String(sobrenome);
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return new String(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSexo() {
        Boolean copiaSexo = this.sexo;
        return copiaSexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    // método para tratar genero obtido através do getSexo()
    public String getGenero(){
        if(getSexo()){
            return "Masculino";
        }else{
            return "Feminino";
        }
    }

    public String getCodCliente() {
            return new String(codCliente);
    }

    public static int getNumCodCliente() {
        return numCodCliente;
    }

    public String getSaudacao() {
        if(getSexo()) {
            return "Prezado Senhor " + getSobrenome();
        }else {
            return "Prezada Senhora " + getSobrenome();
        }
    }

    public String toString(){
        return "\nNome: "+getNome()+"\nSobrenome: "+getSobrenome()+"\nEmail: "+getEmail()+
                "\nSexo: "+getGenero()+"\nCodigo do Cliente: "+getCodCliente();
    }
}
