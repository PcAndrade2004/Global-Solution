package model;

public class Seca extends EventoClimatico{

    private int diaSemChuva;
    private double nivelReservatorio;
    private  double evapotranspiracao;
    private double precipitacao;

    public Seca() {

    }

    public Seca(int id, String descricao, String dataOcorrencia, int nivelRisco, int diaSemChuva, double nivelReservatorio, double evapotranspiracao, double precipitacao) {
        super(id, descricao, dataOcorrencia, nivelRisco);
        this.diaSemChuva = diaSemChuva;
        this.nivelReservatorio = nivelReservatorio;
        this.evapotranspiracao = evapotranspiracao;
        this.precipitacao = precipitacao;
    }

    public double calcularDeficit(){
        double deficit = evapotranspiracao - precipitacao;
        return deficit;
    }



    public int getDiaSemChuva() {
        return diaSemChuva;
    }

    public void setDiaSemChuva(int diaSemChuva) {
        this.diaSemChuva = diaSemChuva;
    }

    public double getNivelReservatorio() {
        return nivelReservatorio;
    }

    public void setNivelReservatorio(double nivelReservatorio) {
        this.nivelReservatorio = nivelReservatorio;
    }

    public double getEvapotranspiracao() {
        return evapotranspiracao;
    }

    public void setEvapotranspiracao(double evapotranspiracao) {
        this.evapotranspiracao = evapotranspiracao;
    }

    public double getPrecipitacao() {

        return precipitacao;
    }

    public void setPrecipitacao(double precipitacao) {
        this.precipitacao = precipitacao;
    }

    @Override
    public String toString() {
        return "\n==================== " +
                "\nSECA " +
                "\n====================" +
                super.toString() +
                "\nDias sem Chuva: " + diaSemChuva +
                "\nNivel Reservatorio: " + nivelReservatorio +
                "\nEvaporação: " + evapotranspiracao +
                "\nPrecipitação: " + precipitacao;
    }
}
