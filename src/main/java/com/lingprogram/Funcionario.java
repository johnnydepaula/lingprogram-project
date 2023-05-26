package main.java.com.lingprogram;

import jdk.jfr.BooleanFlag;

public abstract class Funcionario extends Pessoa{
    private String codFuncionario;
    private static int numCodFuncionario = 0;

    public Funcionario(String nome, String sobrenome, String email, boolean sexo){
        super(nome, sobrenome, email, sexo);

        numCodFuncionario++;
        codFuncionario = "F"+numCodFuncionario;
    }

    // Gets e Sets
    public String getGenero(){
        if(getSexo()){
            return "Masculino";
        }else{
            return "Feminino";
        }
    }

    @Override
    public String getCodigo() {
        return new String(this.codFuncionario);
    }

    @Override
    public String getSaudacao() {
        if(getSexo()) {
            return "Prezado Senhor " +getNome()+" "+getSobrenome();
        }else {
            return "Prezada Senhora " +getNome()+" "+getSobrenome();
        }
    }
    @Override
    public String toString(){
        return "\nNome: "+getNome()+"\nSobrenome: "+getSobrenome()+"\nEmail: "+getEmail()+
                "\nSexo: "+getGenero()+"\nCodigo do Funcionario: "+getCodigo();
    }

    public abstract double calculaSalario();

    public abstract String getDescricao();
}