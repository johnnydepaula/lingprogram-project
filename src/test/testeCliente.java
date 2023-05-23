package test;
import main.java.com.lingprogram.*;
public class testeCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samuel", "da Silva", "samuel@gmail.com", true);
        Cliente cliente2 = new Cliente("Eduardo", "Correa", "eduardo@gmail.com", true);

        System.out.println(cliente1.getCliente());
        System.out.println(cliente2.getCliente());
    }
}
