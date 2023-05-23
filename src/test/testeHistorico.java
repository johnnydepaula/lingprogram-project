package test;
import main.java.com.lingprogram.*;

import java.io.LineNumberInputStream;

public class testeHistorico {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samuel", "da Silva", "samuel@gmail.com", true);
        Cliente cliente2 = new Cliente("Eduardo", "Correa", "eduardo@gmail.com", true);

        Funcionario funcionario1 = new Funcionario("Johnny", "Dias",
                "johnny.dias@gmail.com", true);
        Funcionario funcionario2 = new Funcionario("Rodrigo", "Alves",
                "rodrigo.45@gmail.com", true);


        Servico servico1 = new Servico("Limpeza da fachada do edifício", 1230.00
                ,4, 3);
        Servico servico2 = new Servico("Limpeza do banheiro do edifício", 350.00
                ,2, 3);

        Historico historico = new Historico();

        Contrato contrato1 = new Contrato(cliente1, servico1, funcionario1);
        Contrato contrato2 = new Contrato(cliente1, servico2, funcionario1);
        Contrato contrato3 = new Contrato(cliente1, servico1, funcionario1);

        historico.adicionaContrato(contrato1);
        historico.adicionaContrato(contrato2);
        historico.adicionaContrato(contrato3);

        System.out.println(historico.detalhaContrato());

    }
}
