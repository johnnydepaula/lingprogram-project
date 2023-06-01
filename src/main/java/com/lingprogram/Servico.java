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

        try{
            if (horasPrevistas > 2400){
                throw new IllegalArgumentException("Nao e permitido valores acima de 2400h para Horas Previstas\n");
            }
            this.horasPrevistas = horasPrevistas;
        } catch (IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage()); // Fazer o que alem de mostrar aviso??
        }

        try{
            if(horasTrabalhadas > 2400){
                throw new IllegalArgumentException("Nao e permitido valores acima de 2400h para Horas Trabalhadas\n");
            }
            this.horasTrabalhadas = horasTrabalhadas;
        } catch (IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage()); // Fazer o que alem de mostrar aviso??
        }

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
        return this.valorCobradoHoraServico;
    }

    public void setValorCobradoHoraServico(double valorCobradoHoraServico) {
        this.valorCobradoHoraServico = valorCobradoHoraServico;
    }

    public int getHorasPrevistas() {
        return this.horasPrevistas;
    }

    public void setHorasPrevistas(int horasPrevistas) {
        this.horasPrevistas = horasPrevistas;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
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


