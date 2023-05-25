package main.java.com.lingprogram;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String email;
    private Boolean sexo;
    private String codFuncionario;
    private static int numCodFuncionario = 0;

    public Funcionario(String nome, String sobrenome, String email, Boolean sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.sexo = sexo;

        numCodFuncionario++;
        codFuncionario = "F"+numCodFuncionario;
    }

    // Gets e Sets
    public String getNome() {
        return new String(this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return new String(this.sobrenome);
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return new String (this.email);
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

    public String getGenero(){
        if(getSexo()){
            return "Masculino";
        }else{
            return "Feminino";
        }
    }

    public String getCodFuncionario() {
        return new String(this.codFuncionario);
    }

    public void setCodFuncionario(String codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public static int getNumCodFuncionario() {
        String strNumCodFuncionario = String.valueOf(numCodFuncionario);
        return Integer.parseInt(strNumCodFuncionario);
    }

    public static void setNumCodFuncionario(int numCodFuncionario) {
        Funcionario.numCodFuncionario = numCodFuncionario;
    }

    public String toString(){
        return "\nNome: "+getNome()+"\nSobrenome: "+getSobrenome()+"\nEmail: "+getEmail()+
                "\nSexo: "+getGenero()+"\nCodigo do Funcionario: "+getCodFuncionario();
    }

    public String getSaudacao() {
        if(getSexo()) {
            return "Prezado Senhor " +getNome()+" "+getSobrenome();
        }else {
            return "Prezada Senhora " +getNome()+" "+getSobrenome();
        }
    }

    public abstract double calculaSalario();

    public abstract String getDescricao();
}
