package main.java.com.lingprogram;

public class Servico {
    private String descricao;
    private double valorCobradoHoraServico;
    private int horasPrevistas;
    private int horasTrabalhadas;
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

    // getters & setters
    public String getDescricao() {
        return new String(this.descricao);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCobradoHoraServico() {
        String strValorCobradoHoraServico = String.valueOf(this.valorCobradoHoraServico);
        return Double.parseDouble(strValorCobradoHoraServico);
    }

    public void setValorCobradoHoraServico(double valorCobradoHoraServico) {
        this.valorCobradoHoraServico = valorCobradoHoraServico;
    }

    public int getHorasPrevistas() {
        String strHorasPrevistas = String.valueOf(this.horasPrevistas);
        return Integer.parseInt(strHorasPrevistas);
    }

    public void setHorasPrevistas(int horasPrevistas) {
        this.horasPrevistas = horasPrevistas;
    }

    public int getHorasTrabalhadas() {
        String strHorasTrabalhadas = String.valueOf(this.horasTrabalhadas);
        return Integer.parseInt(strHorasTrabalhadas);
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getCodServico() {
        return new String(codServico);
    }

    public double calculaOrcamentoServico(){
        return getValorCobradoHoraServico()*getHorasPrevistas();
    }

    public double calculaValorPagoServico(){
        return getValorCobradoHoraServico()*getHorasTrabalhadas();
    }

    public String toString(){
        return "\nDescricao: "+getDescricao()+"\nValor Cobrado Hora-Servico (R$): "+getValorCobradoHoraServico()+
                "\nHoras Previstas: "+getHorasPrevistas()+"\nHoras Trabalhadas: "+getHorasTrabalhadas()+
                "\nCodigo do Servico: "+getCodServico();
    }
}


