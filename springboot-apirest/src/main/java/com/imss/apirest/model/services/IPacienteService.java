package com.imss.apirest.model.services;

import java.util.List;

import com.imss.apirest.model.entity.Paciente;

public interface IPacienteService {
	
	public List<Paciente> findAll();
	
	public Paciente save(Paciente paciente);
	
	public void delete(Long id);
	
	public Paciente findById(Long id);
	
	
}
