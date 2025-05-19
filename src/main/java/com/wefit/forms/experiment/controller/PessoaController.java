package com.wefit.forms.experiment.controller;


import com.wefit.forms.experiment.dto.PessoaDTO;
import com.wefit.forms.experiment.model.Pessoa;
import com.wefit.forms.experiment.service.PessoaService;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    @Autowired
    final PessoaService service;

    public PessoaController(PessoaService pessoaService) {
        this.service = pessoaService;
    }


    @PostMapping( headers = "Content-Type=application/json")
    public ResponseEntity<Pessoa> registrarPessoa(@Valid @RequestBody PessoaDTO pessoaDTO) {
        Pessoa pessoa = service.savePessoa(pessoaDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(pessoa.getId()).toUri();

        return ResponseEntity.created(uri).body(pessoa);
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> retornarPessoas(){
        List<Pessoa> pessoas = service.findAll();
        return ResponseEntity.ok().body(pessoas);
    }

    @GetMapping(value = "/{id}")
    @Parameter(name = "id", description = "ID da pessoa", required = true)
    public ResponseEntity<Pessoa> retornarPessoaPorId(@PathVariable Long id){
        Pessoa pessoa = service.findById(id);
        return ResponseEntity.ok().body(pessoa);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarPessoa(@PathVariable Long id){
        service.deletaPessoa(id);
        return ResponseEntity.noContent().build();
    }

}
