import javax.swing.text.html.StyleSheet;

public class testeContrato {
    public static void main(String[] args) {
        // Contrato 1
        Cliente cliente1 = new Cliente("Samuel", "da Silva", "samuel@gmail.com", true);

        Servico servico1 = new Servico("Limpeza da fachada do edifício", 1230.00
        ,4, 3);

        Funcionario funcionario1 = new Funcionario("Johnny", "Dias",
                "johnny.dias@gmail.com", true);

        // Contrato 2
        Servico servico2 = new Servico("Limpeza do banheiro do edifício", 350.00
                ,2, 3);


        Contrato contrato1 = new Contrato(cliente1, servico1, funcionario1);
        Contrato contrato2 = new Contrato(cliente1, servico2, funcionario1);

        Contrato contrato3 = new Contrato(cliente1, servico1, funcionario1);
        contrato3.setAnoContrato(2022);

        System.out.println(contrato1.descreveContrato());
        System.out.println(contrato2.descreveContrato());
        System.out.println(contrato3.descreveContrato());
        System.out.println(contrato3.getAnoContrato());
    }
}