package main.java.com.lingprogram;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioFixo;

    public FuncionarioAssalariado(String nome, String sobrenome, String email, Boolean sexo, Double salarioFixo){
        super(nome, sobrenome, email, sexo);
        this.salarioFixo = salarioFixo;
    }
    @Override
    public String getDescricao(){
        return "Funcionario Assalariado";
    }

    @Override
    public double calculaSalario() {
        return this.salarioFixo;
    }
}
