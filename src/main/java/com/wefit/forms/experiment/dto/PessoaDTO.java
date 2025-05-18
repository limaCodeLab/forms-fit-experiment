package com.wefit.forms.experiment.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wefit.forms.experiment.model.enums.TipoPessoa;
import com.wefit.forms.experiment.serializer.TipoPessoDeserializer;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class PessoaDTO {

    private Long id;

    @JsonDeserialize(using = TipoPessoDeserializer.class)
    @NotBlank(message = "Tipo pessoa obrigatório")
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


}
