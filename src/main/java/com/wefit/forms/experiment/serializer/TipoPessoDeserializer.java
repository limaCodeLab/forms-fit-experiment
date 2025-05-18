package com.wefit.forms.experiment.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.wefit.forms.experiment.exceptions.ValidationDataException;
import com.wefit.forms.experiment.model.enums.TipoPessoa;

import java.io.IOException;

public class TipoPessoDeserializer extends JsonDeserializer<TipoPessoa> {

    @Override
    public TipoPessoa deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {

        JsonToken current = p.currentToken();

        if (current != JsonToken.VALUE_NUMBER_INT) {
            throw  new ValidationDataException("Tipo pessoa", "Tipo pessoa inválido, aloque um valor numerico");
        }

        int codigo = p.getIntValue();
        return TipoPessoa.toEnum(codigo);
    }
}
