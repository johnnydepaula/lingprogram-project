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

    public void verificaContrato(String codContrato){
        boolean existeContrato = false;
        List<Contrato> lista = getContratos();
        for(Contrato contrato : lista){
            if(contrato.getCodigoContrato().equals(codContrato)){
                existeContrato = true;
                break;
            }
        }
        if(existeContrato){
            System.out.println("Contrato "+codContrato+" encontrado na base de Contratos");
        }else {
            System.out.println("Contrato "+codContrato+" nao encontrado na base de Contratos");
        }
    }

    public List<Contrato> getContratos(){
        List<Contrato> copia = new ArrayList<>(contratos);
        return copia;
    }

    public String detalhaContratoHistorico(Contrato contrato){
        return contrato.toString();
    }

    public double calculaFaturamentoPrevisto(){
        double valorTotal = 0;
        List<Contrato> lista = getContratos();

        for(Contrato contrato : lista){
            valorTotal += contrato.valorOrcadoEmContrato();
        }
        return valorTotal;
    }

    public double calculaFaturamentoPago(){
        double valorTotal = 0;
        List<Contrato> lista = getContratos();

        for(Contrato contrato : lista){
            valorTotal += contrato.valorPagoEmContrato();
        }
        return valorTotal;
    }
}
