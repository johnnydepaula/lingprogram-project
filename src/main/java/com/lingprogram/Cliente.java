package main.java.com.lingprogram;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String email;
    private Boolean sexo;
    private String codCliente;
    private static int numCodCliente = 0;


    public Cliente(String nome, String sobrenome, String email, boolean sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.sexo = sexo;

        numCodCliente++;
        codCliente = "C"+numCodCliente;
    }

    // Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }
    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public static int getNumCodCliente() {
        return numCodCliente;
    }

    public static void setNumCodCliente(int numCodCliente) {
        Cliente.numCodCliente = numCodCliente;
    }

    public String getCliente(){
        return "\nNome: "+getNome()+"\nSobrenome: "+getSobrenome()+"\nEmail: "+getEmail()+
                "\nSexo: "+getSexo()+"\nCodigo do main.java.com.lingprogram.Cliente: "+getCodCliente();
    }
}
