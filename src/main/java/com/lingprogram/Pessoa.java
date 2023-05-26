package main.java.com.lingprogram;

public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private String email;
    private boolean sexo;

    public Pessoa(String nome, String sobrenome, String email, boolean sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.sexo = sexo;
    }

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

    public boolean getSexo() {
        return this.sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public String getGenero(){
        if(this.sexo){
            return "Masculino";
        }else{
            return "Feminino";
        }
    }

    public abstract String getCodigo();
    public abstract String getSaudacao();
    public abstract String toString();
}

