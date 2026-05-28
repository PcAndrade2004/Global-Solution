package model;

public enum AlertaIndiceCalor {

    CUIDADO("Fadiga é possível com exposição prolongada ou atividade físicas"),
    EXTREMO_PERIGO("Insolação, Cãibras ou exaustão pelo calor são possíveis com exposição prologada ou atividades físicas"),
    PERIGO("Cãibras ou exaustão pelo calor são prováveis, e insolação é possível com exposição prolongada ou atividade física"),
    PERIGO_EXTREMO("Insolação altamente provável");

    private String descricao;

    AlertaIndiceCalor(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

}
