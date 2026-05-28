package model;

public class Previsao {

    private String dataPrevisao;
    private double temperatura;
    private double umidade;
    private Regiao regiao;

    public Previsao(String dataPrevisao, double temperatura, double umidade, Regiao regiao) {
        this.dataPrevisao = dataPrevisao;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.regiao = regiao;
    }

    public double calcularIndiceCalor() {
        double indiceCalor = temperatura + (0.33 * umidade) - 4.00;
        return indiceCalor;
    }

    public String getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(String dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }



}
