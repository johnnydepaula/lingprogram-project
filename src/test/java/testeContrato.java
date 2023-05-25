package test.java;
import main.java.com.lingprogram.*;

public class testeContrato {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Samuel", "da Silva", "samuel@gmail.com", true);
        Cliente cliente2 = new Cliente("Eduardo", "Correa", "eduardo@gmail.com", true);

        Servico servico1 = new Servico("Limpeza da fachada do edifício", 1230.00
                ,4, 3);
        Servico servico2 = new Servico("Pintura do banheiro do edifício", 350.00
                ,2, 3);
        Servico servico3 = new Servico("Verificacao dos níveis de óleo", 250.00
                ,2, 2);

        Funcionario funcionario1 = new FuncionarioHorista("Johnny", "Dias",
                "johnny.dias@gmail.com", true, servico1);

        Funcionario funcionario2 = new FuncionarioAssalariado("Samuel", "Perigoso",
                "samuquinha.reidelas@gmail.com", true, 3450.50);

        Funcionario funcionario3 = new FuncionarioComissionado("Leticia", "Cunha",
                "lelet.cunha@gmail.com", false, servico1, 0.50);

        // Instanciando Contratos
        Contrato contrato1 = new Contrato(cliente1, servico2, funcionario1);
        Contrato contrato2 = new Contrato(cliente1, servico3, funcionario2);
        Contrato contrato3 = new Contrato(cliente2, servico1, funcionario3);

        // Descrevendo detalhes dos Contrato
        System.out.println(contrato1.toString());
        System.out.println(contrato2.toString());
        System.out.println(contrato3.toString());

//        contrato3.setAnoContrato(2022);

//        System.out.println(contrato1.descreveContrato());
//        System.out.println(contrato2.descreveContrato());
//        System.out.println(contrato3.descreveContrato());
//
//        System.out.println(servico1.getCodServico());
//        System.out.println(servico2.getCodServico());
//
//        System.out.println(funcionario1.getCodFuncionario());
//        System.out.println(funcionario2.getCodFuncionario());
//
//        System.out.println(contrato3.descreveContrato());
//        System.out.println(contrato3.getAnoContrato());
//        System.out.println(contrato3.getCodigoContrato());
//        System.out.println(contrato3.valorOrcadoEmContrato());
    }
}