package com.idat.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.app.dto.ProfesorDTO;
import com.idat.app.model.Profesor;
import com.idat.app.service.ProfesorService;

@RestController
@RequestMapping("/api/profesor/v1")
public class ProfesorController {
	
	@Autowired
	private ProfesorService service;


	@GetMapping("/hola")
	public @ResponseBody String hola(){
		return "hola profe xd";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<ProfesorDTO> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody ProfesorDTO obtenerID(@PathVariable Integer id) {
		return service.obtenerporId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody ProfesorDTO dto) {
		service.guardar(dto);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody ProfesorDTO dto) {
		service.actualizar(dto);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}

}
