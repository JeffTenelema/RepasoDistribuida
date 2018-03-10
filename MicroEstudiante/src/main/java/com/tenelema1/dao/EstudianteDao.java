package com.tenelema1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tenelema1.entities.Estudiante;

@Repository
public interface EstudianteDao extends JpaRepository<Estudiante, Long>{

}
