package test.java;
import main.java.com.lingprogram.*;

public class testeServico {
    public static void main(String[] args) {

        Servico servico1 = new Servico("Limpeza da fachada do edifício", 1230.00
                ,4, 3);
        Servico servico2 = new Servico("Pintura do banheiro do edifício", 350.00
                ,2, 3);

        System.out.println(servico1.toString());
        System.out.println();
        System.out.println(servico2.toString());

        System.out.println();
        System.out.println();

        System.out.println("Orcamento do Servico "+servico1.getCodServico()+
                " (R$): "+servico1.calculaOrcamentoServico());

        System.out.println("Faturamento do Servico "+servico1.getCodServico()+
                " (R$): "+servico1.calculaValorPagoServico());

        System.out.println();

        System.out.println("Orcamento do Servico "+servico2.getCodServico()+
                " (R$): "+servico2.calculaOrcamentoServico());

        System.out.println("Faturamento do Servico "+servico2.getCodServico()+
                " (R$): "+servico2.calculaValorPagoServico());
    }
}
