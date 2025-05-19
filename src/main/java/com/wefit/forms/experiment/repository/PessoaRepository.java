package com.wefit.forms.experiment.repository;

import com.wefit.forms.experiment.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findAllByOrderByIdAsc();
}
