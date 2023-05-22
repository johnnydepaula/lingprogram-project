import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Contrato> contratos;

    public Historico(){
        contratos = new ArrayList<>();
    }

    public void adicionaContrato(Contrato contrato){
        contratos.add(contrato);
    }

    public List<Contrato> getContratos(){
        return contratos;
    }
}
