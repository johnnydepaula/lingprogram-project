package test.java;
import main.java.com.lingprogram.*;

import java.io.LineNumberInputStream;
import java.io.SyncFailedException;
import java.util.List;

public class testeHistorico {
    public static void main(String[] args) {

        // Instanciando Clientes
        Cliente cliente1 = new Cliente("Samuel", "da Silva", "samuel@gmail.com", true);
        Cliente cliente2 = new Cliente("Eduardo", "Correa", "eduardo@gmail.com", true);

        // Instanciando Servico
        Servico servico1 = new Servico("Limpeza da fachada do edifício", 1230.00
                ,4, 3);
        Servico servico2 = new Servico("Limpeza do banheiro do edifício", 350.00
                ,2, 3);

        // Instanciando Funcionarios
        Funcionario funcionario1 = new FuncionarioHorista("Johnny", "Dias",
                "johnny.dias@gmail.com", true, servico1);

        Funcionario funcionario2 = new FuncionarioAssalariado("Samuel", "Perigoso",
                "samuquinha.reidelas@gmail.com", true, 3450.50);

        Funcionario funcionario3 = new FuncionarioComissionado("Samuel", "Perigoso",
                "samuquinha.reidelas@gmail.com", true, servico2, 0.50);


        Historico historico = new Historico();

        Contrato contrato1 = new Contrato(cliente1, servico1, funcionario1);
        historico.addContrato(contrato1);

        Contrato contrato2 = new Contrato(cliente1, servico2, funcionario1);
        historico.addContrato(contrato2);

        Contrato contrato3 = new Contrato(cliente1, servico1, funcionario2);
        historico.addContrato(contrato3);

        List<Contrato> listaContratos = historico.getContratos();

        // loop que Descreve Contratos adicionados no Historico de contratos
        for(Contrato contrato : listaContratos){
            System.out.println(contrato.toString());
        }

        System.out.println();
        System.out.println();

        // Verifica Contrato especifico no Historico
        historico.verificaContrato(historico, "2023-3");

        // Removendo um Contrato do Historico
        historico.removeContrato(contrato3);
        System.out.println();

        // Detalhando contrato específico do Histórico
        System.out.println(historico.detalhaContratoHistorico(contrato1));
        System.out.println();

        // Detalhando Orcamento e Faturamento total dos Contratos em Historico
        System.out.println("Faturamento Total Previsto dos Contratos em Historico (R$): "
                +historico.calculaFaturamentoPrevisto(historico));

        System.out.println("Faturamento Total dos Contratos em Historico (R$): "+
                historico.calculaFaturamentoPago(historico));

        System.out.println();
        // Verifica Contrato especifico no Historico
        historico.verificaContrato(historico, "2023-3");
    }
}
