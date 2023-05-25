package test.java;
import main.java.com.lingprogram.*;

public class testeFuncionario {
    public static void main(String[] args) {
        Servico servico1 = new Servico("Limpeza da fachada do edifício", 1230.00
                ,4, 3);

        Funcionario funcionario1 = new FuncionarioHorista("Johnny", "Dias",
                "johnny.dias@gmail.com", true, servico1);

        Funcionario funcionario2 = new FuncionarioAssalariado("Samuel", "Perigoso",
                "samuquinha.reidelas@gmail.com", true, 3450.50);

        Funcionario funcionario3 = new FuncionarioComissionado("Eduarda", "Correa",
                "eduarda.correa@gmail.com", false, servico1, 0.50);

        System.out.println();
        System.out.println(funcionario1.getSaudacao());
        System.out.println(funcionario1.toString());
        System.out.println();
        System.out.println(IdentificadorDeFuncionario.identificaFuncionario(funcionario1));
        System.out.println("Salario: "+funcionario1.calculaSalario());

        System.out.println();
        System.out.println();

        System.out.println(funcionario2.getSaudacao());
        System.out.println(funcionario2.toString());
        System.out.println();
        System.out.println(IdentificadorDeFuncionario.identificaFuncionario(funcionario2));
        System.out.println("Salario: "+funcionario2.calculaSalario());

        System.out.println();
        System.out.println();

        System.out.println(funcionario3.getSaudacao());
        System.out.println(funcionario3.toString());
        System.out.println();
        System.out.println(IdentificadorDeFuncionario.identificaFuncionario(funcionario3));
        System.out.println("Salario: "+funcionario3.calculaSalario());
    }
}
