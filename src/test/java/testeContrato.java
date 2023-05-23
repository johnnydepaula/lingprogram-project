package test.java;
import main.java.com.lingprogram.*;

public class testeContrato {
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


        Contrato contrato1 = new Contrato(cliente1, servico1, funcionario1);
        Contrato contrato2 = new Contrato(cliente1, servico2, funcionario1);

        Contrato contrato3 = new Contrato(cliente1, servico1, funcionario1);
        contrato3.setAnoContrato(2022);

//        System.out.println(contrato1.descreveContrato());
//        System.out.println(contrato2.descreveContrato());
//        System.out.println(contrato3.descreveContrato());
//
//        System.out.println(servico1.getCodServico());
//        System.out.println(servico2.getCodServico());
//
//        System.out.println(funcionario1.getCodFuncionario());
//        System.out.println(funcionario2.getCodFuncionario());
    }
}