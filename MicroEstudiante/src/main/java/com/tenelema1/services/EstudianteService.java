package com.tenelema1.services;

import java.util.List;

import com.tenelema1.entities.Estudiante;

public interface EstudianteService {
	
	Estudiante save(Estudiante estudiante);
	void delete(Estudiante estudiante);
    Estudiante findById(Long id);
    List<Estudiante> findAll();

}
