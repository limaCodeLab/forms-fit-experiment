package com.wefit.forms.experiment.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.wefit.forms.experiment.model.enums.TipoPessoa;

import java.io.IOException;

public class TipoPessoDeserializer extends JsonDeserializer<TipoPessoa> {

    @Override
    public TipoPessoa deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        int codigo = p.getIntValue();
        return TipoPessoa.toEnum(codigo);
    }
}
