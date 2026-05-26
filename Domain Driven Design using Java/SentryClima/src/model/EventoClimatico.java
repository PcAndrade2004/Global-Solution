package model;

public abstract class EventoClimatico {

    private int id;
    private String descricao;
    private String dataOcorrencia;
    private int nivelRisco;

    public EventoClimatico(){

    }

    public EventoClimatico(int id, String descricao, String dataOcorrencia, int nivelRisco) {
        this.id = id;
        this.descricao = descricao;
        this.dataOcorrencia = dataOcorrencia;
        this.nivelRisco = nivelRisco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public int getNivelRisco () {
        return nivelRisco;
    }

    public void setNivelRisco(int nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    public abstract NivelAlerta avaliarRisco();

    @Override
    public String toString() {
        return   "\nid: " + id
                + "\nDescrição: " + descricao
                + "\nData Ocorrencia: " + dataOcorrencia
                + "\nNivel Risco: " + nivelRisco;
    }
}
