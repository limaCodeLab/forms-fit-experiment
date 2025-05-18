package com.wefit.forms.experiment.config;

import com.wefit.forms.experiment.config.environments.TestEnv;
import com.wefit.forms.experiment.model.Pessoa;
import com.wefit.forms.experiment.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@TestEnv
public class TestConfig implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void run(String[] args) throws Exception {

        Pessoa pessoa =  new Pessoa(
                "11.111.111/1111-11",
                "111.111.111-11",
                "João",
                "11 11111-1111",
                "11 1111-1111",
                "JoãLH9I1@example.com",
                "11.111-111",
                "Rua",
                "111",
                "Complemento",
                "Cidade",
                "Bairro",
                "SP",
                true);

        pessoaRepository.save(pessoa);

    }

}
