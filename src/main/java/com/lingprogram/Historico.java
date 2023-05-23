package main.java.com.lingprogram;

import java.util.ArrayList;

public class Historico {
    private static ArrayList<Contrato> contratos;

    public Historico(){
        contratos = new ArrayList<>();
    }

    public void adicionaContrato(Contrato contrato){
        contratos.add(contrato);
    }

    public String detalhaContrato(){
        return contratos.toString();
    }
}
