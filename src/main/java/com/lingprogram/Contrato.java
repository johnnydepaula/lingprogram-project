package main.java.com.lingprogram;

import java.time.LocalDate;

public class Contrato {
    private Cliente cliente;
    private Servico servico;
    private Funcionario funcionarioResponsavel;
    private String ordemContratoServico;
    private static int anoContrato;
    private static int mesContrato;
    private String codigoContrato;
    private static int count = 0;
    private Historico historico;


    // Construtor
    public Contrato(Cliente cliente, Servico servico, Funcionario funcionarioResponsavel) {
        this.cliente = cliente;
        this.servico = servico;
        this.funcionarioResponsavel = funcionarioResponsavel;

        LocalDate dataAtual = LocalDate.now();
        anoContrato = dataAtual.getYear();
        mesContrato = dataAtual.getMonthValue();

        if (anoContrato == dataAtual.getYear()) {
            count++;
        } else {
            count = 1;
        }
        codigoContrato = anoContrato + "-" + count;
    }
    public int getAnoContrato() {
        return this.anoContrato;
    }

    public int getMesContrato() {
        return this.mesContrato;
    }

    public String getCodigoContrato() {
        return new String(this.codigoContrato);
    }

    public double valorOrcadoEmContrato(){
        return this.servico.calculaOrcamentoServico();
    }

    public double valorPagoEmContrato(){
        return this.servico.calculaValorPagoServico();
    }

    // Método para obter descriçao da instacia/objeto
    public String toString() {
        return "\nCliente: " + cliente.getNome() + " " + cliente.getSobrenome() + " – Servico: " + servico.getDescricao() +
                "\nFuncionario responsavel: " + funcionarioResponsavel.getNome() + " " + funcionarioResponsavel.getSobrenome() +
                "\nAno do contrato: " + getAnoContrato() +
                "\nMes do contrato: " + getMesContrato() +
                "\nCodigo do contrato: " + getCodigoContrato() +
                "\nValor Orcado em Contrato (R$): " + valorOrcadoEmContrato() +
                "\nValor do Contrato (R$): " + valorPagoEmContrato();
    }
}
