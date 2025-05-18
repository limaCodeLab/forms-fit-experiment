package com.wefit.forms.experiment.service;

import com.wefit.forms.experiment.dto.PessoaDTO;
import com.wefit.forms.experiment.model.Pessoa;
import com.wefit.forms.experiment.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    final PessoaRepository pessoaRepository;
    final ModelMapper modelMapper;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository, ModelMapper modelMapper) {
        this.pessoaRepository = pessoaRepository;
        this.modelMapper = modelMapper;
    }

    public Pessoa convertToEntity(PessoaDTO pessoaDTO) {
        return modelMapper.map(pessoaDTO, Pessoa.class);
    }

    public Pessoa savePessoa (PessoaDTO pessoaDTO) {
        Pessoa pessoa = convertToEntity(pessoaDTO);
        return pessoaRepository.save(pessoa);
    }



}
