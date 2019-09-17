package com.imss.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imss.apirest.model.entity.Paciente;
import com.imss.apirest.model.services.IPacienteService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PacienteRestController {
	
	@Autowired
	private IPacienteService pacienteService;
	
	@GetMapping("/pacientes")
	public List<Paciente> index(){
		return pacienteService.findAll();
	}
	
	@GetMapping("/pacientes/{id}")
	public Paciente show(@PathVariable Long id) {
		return pacienteService.findById(id);
	}
	
	@PostMapping("/pacientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Paciente create(@RequestBody Paciente paciente) {
		return pacienteService.save(paciente);
	}
	
	@PutMapping("/pacientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Paciente update(@RequestBody Paciente paciente,@PathVariable Long id) {
		Paciente pacienteActual=pacienteService.findById(id);
		pacienteActual.setNombre(paciente.getNombre());
		pacienteActual.setNss(paciente.getNss());
		pacienteActual.setEdad(paciente.getEdad());
		pacienteActual.setSexo(paciente.getSexo());
		pacienteActual.setDomicilio(paciente.getDomicilio());
		pacienteActual.setTelefono(paciente.getTelefono());
		
		return pacienteService.save(pacienteActual);
		
	}
	
	@DeleteMapping("/pacientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pacienteService.delete(id);
	}
	
	
}	

