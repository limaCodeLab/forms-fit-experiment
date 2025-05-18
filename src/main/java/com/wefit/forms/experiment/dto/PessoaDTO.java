package com.wefit.forms.experiment.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
public class PessoaDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;
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

    public PessoaDTO() {
    }

    public PessoaDTO(String cnpj, String cpf, String nome, String celular,
                     String telefone, String email, String cep, String logradouro,
                     String numeroCasa, String complemento, String cidade, String bairro, String estado, Boolean termosUso) {

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

}
