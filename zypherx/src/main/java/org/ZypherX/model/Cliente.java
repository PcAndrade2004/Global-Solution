package org.ZypherX.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TB_ZPX_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;


    @Column(name = "nome_cliente", length = 25, nullable = false)
    @NotBlank
    private String nome;


    @Column(name = "sobrenome_cliente", length = 25)
    private String sobrenome;


    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;


    @Column(name = "genero", length = 1)
    private String genero;


    // Relacionamentos
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contato> contatos;


    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Experiencia> experiencias;


    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<AreaInteresse> areasInteresse;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    public List<AreaInteresse> getAreasInteresse() {
        return areasInteresse;
    }

    public void setAreasInteresse(List<AreaInteresse> areasInteresse) {
        this.areasInteresse = areasInteresse;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(nome, cliente.nome) && Objects.equals(sobrenome, cliente.sobrenome) && Objects.equals(dataNascimento, cliente.dataNascimento) && Objects.equals(genero, cliente.genero) && Objects.equals(contatos, cliente.contatos) && Objects.equals(experiencias, cliente.experiencias) && Objects.equals(areasInteresse, cliente.areasInteresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, sobrenome, dataNascimento, genero, contatos, experiencias, areasInteresse);
    }
}
