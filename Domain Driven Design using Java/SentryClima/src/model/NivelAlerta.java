package model;

public enum NivelAlerta {
    NORMAL("Situação normal, sem riscos"),
    ATENCAO("Requer atenção, monitoramento necessário"),
    ALERTA("Situação de alerta, prepare-se"),
    EMERGENCIA("Emergência declarada, risco alto"),
    CALAMIDADE("Calamidade pública, risco extremo");

    private String descricao;

     NivelAlerta(String descricao) {
         this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
