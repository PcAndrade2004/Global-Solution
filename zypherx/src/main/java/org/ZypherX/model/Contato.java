package org.ZypherX.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.Objects;

@Entity
@Table(name = "TB_ZPX_CONTATO", uniqueConstraints = @UniqueConstraint(columnNames = "email_cliente"))
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contato")
    private Long id;


    @Column(name = "email_cliente", length = 50)
    @Email
    private String email;


    @Column(name = "telefone_cliente")
    private String telefone;


    @Column(name = "telefone_recado")
    private String telefoneRecado;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefoneRecado() {
        return telefoneRecado;
    }

    public void setTelefoneRecado(String telefoneRecado) {
        this.telefoneRecado = telefoneRecado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id) && Objects.equals(email, contato.email) && Objects.equals(telefone, contato.telefone) && Objects.equals(telefoneRecado, contato.telefoneRecado) && Objects.equals(cliente, contato.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, telefone, telefoneRecado, cliente);
    }
}
