package com.idat.app.service;

import java.util.List;

import com.idat.app.dto.ProfesorDTO;

public interface ProfesorService {
	
	List<ProfesorDTO> listar();
	ProfesorDTO obtenerporId(Integer id);
	void guardar(ProfesorDTO a);
	void eliminar(Integer id);
	void actualizar(ProfesorDTO profe);

}
