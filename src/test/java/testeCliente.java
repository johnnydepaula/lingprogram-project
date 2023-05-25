package test.java;
import main.java.com.lingprogram.*;
public class testeCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samuel", "da Silva", "samuel@gmail.com", true);
        Cliente cliente2 = new Cliente("Eduarda", "Correa", "eduarda@gmail.com", false);

        System.out.println(cliente1.toString());
        System.out.println(cliente2);

        System.out.println();

        System.out.println(cliente1.getSaudacao());
        System.out.println(cliente2.getSaudacao());
    }
}