package model;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitor {

    private String nomeSistema;
    private List<Previsao> previsoes;
    private List<EventoClimatico> eventos;

    public SistemaMonitor(String nomeSistema) {
        this.nomeSistema = nomeSistema;
        this.previsoes = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void adicionarPrevisao(Previsao previsao) {
        previsoes.add(previsao);
    }

    public void adicionarEvento(EventoClimatico evento) {
        eventos.add(evento);
    }

    public void listarPrevisoes() {
        for (Previsao p : previsoes) {
            System.out.println(p);
        }
    }

    public void listarEventos() {
        for (EventoClimatico e : eventos) {
            System.out.println(e);
        }
    }

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public List<Previsao> getPrevisoes() {
        return previsoes;
    }

    public List<EventoClimatico> getEventos() {
        return eventos;
    }
}
