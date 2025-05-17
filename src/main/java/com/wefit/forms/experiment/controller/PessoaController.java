package com.wefit.forms.experiment.controller;


import com.wefit.forms.experiment.dto.PessoaDTO;
import com.wefit.forms.experiment.model.Pessoa;
import com.wefit.forms.experiment.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RequestMapping("/pessoa")
public class PessoaController {

    final PessoaService service;

    @Autowired
    public PessoaController(PessoaService pessoaService) {
        this.service = pessoaService;
    }


    @PostMapping( headers = "Content-Type=application/json")
    public ResponseEntity<Pessoa> registrarPessoa(@RequestBody PessoaDTO pessoaDTO) {
        Pessoa pessoa = service.insertPessoa(pessoaDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(pessoa.getId()).toUri();

        return ResponseEntity.created(uri).body(pessoa);
    }


}
