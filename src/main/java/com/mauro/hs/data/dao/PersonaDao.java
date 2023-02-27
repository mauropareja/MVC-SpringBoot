package com.mauro.hs.data.dao;

import com.mauro.hs.data.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
