package model;

public class Tempestade extends EventoClimatico{

    private double velocidadeVento;
    private double precipitacao;

    public Tempestade(){

    }

    public Tempestade(int id, String descricao, String dataOcorrencia, int nivelRisco, double velocidadeVento, double precipitacao) {
        super(id, descricao, dataOcorrencia, nivelRisco);
        this.velocidadeVento = velocidadeVento;
        this.precipitacao = precipitacao;
    }

    @Override
    public NivelAlerta avaliarRisco() {
        if (precipitacao > 200 || velocidadeVento > 200) {
            return NivelAlerta.NORMAL;
        }else if(precipitacao > 100 && velocidadeVento > 120) {
            return NivelAlerta.EMERGENCIA;
        }else if (precipitacao >= 50 && precipitacao <= 100 || velocidadeVento >= 80 && velocidadeVento <= 120) {
            return NivelAlerta.ALERTA;
        }else if (precipitacao >= 20 && precipitacao <= 50 || velocidadeVento >= 50 && velocidadeVento <= 80) {
            return NivelAlerta.ATENCAO;
        }else if (precipitacao < 20 && velocidadeVento < 50) {
            return NivelAlerta.NORMAL;
        }else {
        return NivelAlerta.NORMAL;
        }
    }

    public double calcularIntensidade() {
        double intensidade = Math.round(precipitacao * 0.6) + (velocidadeVento * 0.4);
        return intensidade;
    }

    @Override
    public String toString() {
        return "\n==========" +
                "\nTEMPESTADE " +
                "\n==========" +
                super.toString() +
                "\nVelocidade do Vento: " + velocidadeVento +
                "\nPrecipitação: " + precipitacao ;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }

    public void setVelocidadeVento(double velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
    }

    public double getPrecipitacao() {
        return precipitacao;
    }

    public void setPrecipitacao(double precipitacao) {
        this.precipitacao = precipitacao;
    }

}
