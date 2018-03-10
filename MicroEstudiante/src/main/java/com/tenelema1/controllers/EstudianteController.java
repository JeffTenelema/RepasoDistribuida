package com.tenelema1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.tenelema1.entities.Estudiante;
import com.tenelema1.services.EstudianteService;

import java.util.List;

@RestController
@RequestMapping(value="/estudiante")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value="/list")
	public List<Estudiante> list(){
        return estudianteService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public Estudiante findById(@PathVariable Long id){
        return estudianteService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/")
    public Estudiante save(@RequestBody Estudiante estudiante){
        return estudianteService.save(estudiante);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        Estudiante estudiante=estudianteService.findById(id);
        estudianteService.delete(estudiante);
    }

    @PutMapping(value = "/{id}")
    public Estudiante update(@PathVariable Long id, @RequestBody Estudiante estudiante){
        estudiante.setId(id);
        return estudianteService.save(estudiante);
    }

}
