package com.wefit.forms.experiment.model;

import com.wefit.forms.experiment.model.enums.TipoPessoa;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "tb_person")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Setter(value = AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoPessoa tipoPessoa;

    private String cnpj;
    private String cpf;
    private String nome;
    private String celular;
    private String telefone;
    private String email;
    private String cep;
    private String logradouro;
    private String numeroCasa;
    private String complemento;
    private String cidade;
    private String bairro;
    private String estado;
    private Boolean termosUso;

    public Pessoa() {}

    public Pessoa( String cnpj, String cpf, String nome, String celular, String telefone, String email, String cep, String logradouro, String numeroCasa, String complemento, String cidade, String bairro, String estado, Boolean termosUso) {
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.nome = nome;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.termosUso = termosUso;
    }

    @PrePersist
    @PreUpdate
    private void trimFields() {
        this.nome = this.nome.trim();
        this.email = this.email.trim();
        this.logradouro = this.logradouro.trim();
        this.complemento = this.complemento.trim();
        this.cidade = this.cidade.trim();
        this.bairro = this.bairro.trim();
        this.estado = this.estado.trim();
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", celular='" + celular + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numeroCasa='" + numeroCasa + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                ", termosUso=" + termosUso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa person = (Pessoa) o;
        return Objects.equals(id, person.id) && Objects.equals(cnpj, person.cnpj) && Objects.equals(cpf, person.cpf) && Objects.equals(nome, person.nome) && Objects.equals(celular, person.celular) && Objects.equals(telefone, person.telefone) && Objects.equals(email, person.email) && Objects.equals(cep, person.cep) && Objects.equals(logradouro, person.logradouro) && Objects.equals(numeroCasa, person.numeroCasa) && Objects.equals(complemento, person.complemento) && Objects.equals(cidade, person.cidade) && Objects.equals(bairro, person.bairro) && Objects.equals(estado, person.estado) && Objects.equals(termosUso, person.termosUso);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(cnpj);
        result = 31 * result + Objects.hashCode(cpf);
        result = 31 * result + Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(celular);
        result = 31 * result + Objects.hashCode(telefone);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(cep);
        result = 31 * result + Objects.hashCode(logradouro);
        result = 31 * result + Objects.hashCode(numeroCasa);
        result = 31 * result + Objects.hashCode(complemento);
        result = 31 * result + Objects.hashCode(cidade);
        result = 31 * result + Objects.hashCode(bairro);
        result = 31 * result + Objects.hashCode(estado);
        result = 31 * result + Objects.hashCode(termosUso);
        return result;
    }
}
