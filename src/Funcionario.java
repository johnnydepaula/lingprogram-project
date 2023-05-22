public class Funcionario {
    private String nome;
    private String sobrenome;
    private String email;
    private Boolean sexo;
    private String codFuncionario;
    private static int numCodFuncionario = 0;
    public Funcionario(String nome, String sobrenome, String email, boolean sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.sexo = sexo;

        numCodFuncionario++;
        codFuncionario = "F"+numCodFuncionario;
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
    public String getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(String codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public static int getNumCodFuncionario() {
        return numCodFuncionario;
    }

    public static void setNumCodFuncionario(int numCodFuncionario) {
        Funcionario.numCodFuncionario = numCodFuncionario;
    }
}
