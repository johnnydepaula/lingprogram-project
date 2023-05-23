package test;
import main.java.com.lingprogram.*;

public class testeServico {
    public static void main(String[] args) {
        Servico servico1 = new Servico("Limpeza da fachada do edifício", 1230.00
                ,4, 3);
        Servico servico2 = new Servico("Limpeza do banheiro do edifício", 350.00
                ,2, 3);

        System.out.println(servico1.calculaOrcamentoServico(servico1));
        System.out.println(servico2.calculaOrcamentoServico(servico2));

        System.out.println(servico1.calculaValorPagoServico(servico1));
        System.out.println(servico2.calculaValorPagoServico(servico2));
    }
}
