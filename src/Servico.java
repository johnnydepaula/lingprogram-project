public class Servico {
    private String descricao;
    private double valorCobradoHoraServico;
    private int horasPrevistas;
    private int horasTrabalhadas;


    // Codigo do Servico
    private String codServico;
    private static int numCodServico = 0;

    public Servico(String descricao, double valorCobradoHoraServico, int horasPrevistas, int horasTrabalhadas){
        this.descricao = descricao;
        this.valorCobradoHoraServico = valorCobradoHoraServico;
        this.horasPrevistas = horasPrevistas;
        this.horasTrabalhadas = horasTrabalhadas;

        numCodServico++;
        codServico = "S"+numCodServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCobradoHoraServico() {
        return valorCobradoHoraServico;
    }

    public void setValorCobradoHoraServico(double valorCobradoHoraServico) {
        this.valorCobradoHoraServico = valorCobradoHoraServico;
    }

    public int getHorasPrevistas() {
        return horasPrevistas;
    }

    public void setHorasPrevistas(int horasPrevistas) {
        this.horasPrevistas = horasPrevistas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getCodServico() {
        return codServico;
    }

    public void setCodServico(String codServico) {
        this.codServico = codServico;
    }

    public static int getNumCodServico() {
        return numCodServico;
    }

    public static void setNumCodServico(int numCodServico) {
        Servico.numCodServico = numCodServico;
    }
}


