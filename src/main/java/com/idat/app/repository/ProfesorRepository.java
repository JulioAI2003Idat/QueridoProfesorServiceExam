package com.idat.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.app.model.Profesor;

@Repository
public interface ProfesorRepository  extends JpaRepository<Profesor, Integer>{

}
