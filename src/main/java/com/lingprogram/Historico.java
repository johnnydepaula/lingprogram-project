package main.java.com.lingprogram;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private static List<Contrato> contratos;

    public Historico(){
        contratos = new ArrayList<>();
    }

    public void addContrato(Contrato contrato){
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato){
        contratos.remove(contrato);
    }

    public void verificaContrato(Contrato contrato){
        contratos.contains(contrato);
    }

    public List<Contrato> getContratos(){
        return contratos;
    }

    public String detalhaContratoHistorico(Contrato contrato){
        return contrato.descreveContrato();
    }

    public double calculaFaturamentoPrevisto(Historico historico){
        double valorTotal = 0;
        List<Contrato> lista = historico.getContratos();

        for(Contrato contrato : lista){
            valorTotal += contrato.valorOrcadoEmContrato();
        }
        return valorTotal;
    }

    public double calculaFaturamentoPago(Historico historico){
        double valorTotal = 0;
        List<Contrato> lista = historico.getContratos();

        for(Contrato contrato : lista){
            valorTotal += contrato.valorPagoEmContrato();
        }
        return valorTotal;
    }
}
