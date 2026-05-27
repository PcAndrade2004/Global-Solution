package model;

import java.util.ArrayList;
import java.util.List;

public class Regiao {

    private String nome;
    private String estado;
    private int populacao;
    private List<EventoClimatico> eventos;

    public Regiao(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(EventoClimatico evento) {
        this.eventos.add(evento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public List<EventoClimatico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoClimatico> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        return "Região: " +
                "Nome:" + nome +
                "Estado: " + estado +
                "População: " + populacao +
                "Eventos: " + eventos;
    }
}
