package com.wefit.forms.experiment.repository;

import com.wefit.forms.experiment.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Pessoa, Long> {
}
