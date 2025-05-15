package com.wefit.forms.experiment.model.enums;

import lombok.Getter;

@Getter
public enum TipoPessoa {

    FISICA(1),
    JURIDICA(2);

    private int codigo;

    TipoPessoa(int code) {
        this.codigo = codigo;
    }

    public static TipoPessoa valueOf(int codigo){
        for (TipoPessoa personType : TipoPessoa.values()) {
            if (personType.getCodigo() == codigo) {
                return personType;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }


}