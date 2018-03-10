package com.tenelema1.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenelema1.dao.EstudianteDao;
import com.tenelema1.entities.Estudiante;
import com.tenelema1.services.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteDao estudianteDao;
	
	@Override
	public Estudiante save(Estudiante estudiante) {
		return estudianteDao.save(estudiante);
	}

	@Override
	public void delete(Estudiante estudiante) {
		estudianteDao.delete(estudiante);
	}

	@Override
	public Estudiante findById(Long id) {
		return estudianteDao.findOne(id);
	}

	@Override
	public List<Estudiante> findAll() {
		return estudianteDao.findAll();
	}

}
