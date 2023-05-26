package main.java.com.lingprogram;

public class FuncionarioComissionado extends Funcionario{
    private Servico servico;
    private double comissao;

    public FuncionarioComissionado(String nome, String sobrenome, String email, boolean sexo, Servico servico, Double comissao){
        super(nome, sobrenome, email, sexo);
        this.servico = servico;
        this.comissao = comissao;
    }

    @Override
    public String getDescricao(){
        return "Funcionario Comissionado";
    }

    @Override
    public double calculaSalario() {
        return servico.calculaValorPagoServico()*comissao;
    }
}
