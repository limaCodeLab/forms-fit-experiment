package com.wefit.forms.experiment.service;

import com.wefit.forms.experiment.dto.PessoaDTO;
import com.wefit.forms.experiment.exceptions.ResourceNotFoundException;
import com.wefit.forms.experiment.model.Pessoa;
import com.wefit.forms.experiment.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Pessoa> findAll() { return pessoaRepository.findAllByOrderByIdAsc(); }

    public Pessoa findById(Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public void deletaPessoa(Long id) {
        try {
            findById(id);
            pessoaRepository.deleteById(id);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

}
