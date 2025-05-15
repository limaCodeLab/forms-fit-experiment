package com.wefit.forms.experiment.dto;

import lombok.Data;

@Data
public class PessoaDTO {

    private Integer tipoPessoa;
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
}
