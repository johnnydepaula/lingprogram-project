package main.java.com.lingprogram;

public class FuncionarioHorista extends Funcionario{
    private Servico servico;

    public FuncionarioHorista(String nome, String sobrenome, String email, boolean sexo, Servico servico){
        super(nome, sobrenome, email, sexo);
        this.servico = servico;
    }

    @Override
    public String getDescricao(){
        return "Funcionario Horista";
    }

    @Override
    public double calculaSalario() {
        return servico.getValorCobradoHoraServico()*servico.getHorasTrabalhadas();
    }
}
