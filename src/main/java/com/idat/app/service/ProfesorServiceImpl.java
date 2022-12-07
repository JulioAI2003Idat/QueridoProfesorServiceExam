package com.idat.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.app.dto.ProfesorDTO;
import com.idat.app.model.Profesor;
import com.idat.app.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository repository;

	@Override
	public List<ProfesorDTO> listar() {
		List<ProfesorDTO> listadto = new ArrayList<>();
		List<Profesor> lista = repository.findAll();
		ProfesorDTO dto = null;
		for (Profesor profesor : lista) {
			dto = new ProfesorDTO();
			dto.setApe(profesor.getApellido());
			dto.setNom(profesor.getNombre());
			dto.setCod(profesor.getIdProfesor());
			listadto.add(dto);
		}
		return listadto;
	}

	@Override
	public ProfesorDTO obtenerporId(Integer id) {
		ProfesorDTO dto = null;
		Profesor profesor = repository.findById(id).orElse(null);
		dto = new ProfesorDTO();
		dto.setApe(profesor.getApellido());
		dto.setNom(profesor.getNombre());
		dto.setCod(profesor.getIdProfesor());
		
		
		return dto;
	}

	@Override
	public void guardar(ProfesorDTO a) {
		
		Profesor alu = new  Profesor();
		alu.setApellido(a.getApe());
		alu.setNombre(a.getNom());
		alu.setIdProfesor(a.getCod());
		repository.save(alu);
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(ProfesorDTO alumno) {
		 
        Profesor alu = new Profesor();
        alu.setApellido(alumno.getApe());
        alu.setNombre(alumno.getNom());
        alu.setIdProfesor(alumno.getCod());
        
        repository.saveAndFlush(alu);
		
	}
}
