import java.time.LocalDate;
import java.time.YearMonth;

public class Contrato {
    private Cliente cliente;
    private Servico servico;
    private Funcionario funcionarioResponsavel;
    private String ordemContratoServico;
    private static int anoContrato;
    private static int mesContrato;
    private String codigoContrato;
    private static int count = 0;


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
        codigoContrato = getAnoContrato() + "-" + count;
    }

    // Método para obter descriçao da instacia/objeto
    public String descreveContrato() {
        return "\nCliente: " + cliente.getNome() + " " + cliente.getSobrenome() + " – Servico: " + servico.getDescricao() +
                "\nFuncionario responsavel: " + funcionarioResponsavel.getNome() + " " + funcionarioResponsavel.getSobrenome() +
                "\nAno do contrato: " + getAnoContrato() +
                "\nMes do contrato: " + getMesContrato() +
                "\nCodigo do contrato: " + getCodigoContrato();
    }

    public int getAnoContrato() {
        return anoContrato;
    }

    public void setAnoContrato(int anoContrato) {
        this.anoContrato = anoContrato;
    }

    public int getMesContrato() {
        return mesContrato;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }
}
