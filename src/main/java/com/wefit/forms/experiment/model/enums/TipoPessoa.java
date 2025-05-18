package com.wefit.forms.experiment.model.enums;

import lombok.Getter;

@Getter
public enum TipoPessoa {

    FISICA(1),
    JURIDICA(2);

    private final int codigo;

    TipoPessoa(int codigo) {
        this.codigo = codigo;
    }

    public static TipoPessoa toEnum(Integer codigo) {
        for (TipoPessoa tipoPessoa : values()){
            if (tipoPessoa.getCodigo() == codigo) {
                return tipoPessoa;
            }
        }
        throw new IllegalArgumentException("Código inválido para Tipo Pessoa: " + codigo);
    }

}