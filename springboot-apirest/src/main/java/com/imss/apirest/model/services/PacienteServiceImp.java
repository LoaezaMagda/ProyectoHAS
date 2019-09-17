package com.imss.apirest.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imss.apirest.model.dao.IPacienteDao;
import com.imss.apirest.model.entity.Paciente;

@Service
public class PacienteServiceImp implements IPacienteService{
	@Autowired
	private IPacienteDao pacienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Paciente> findAll() {
		// TODO Auto-generated method stub
		return (List<Paciente>) pacienteDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Paciente findById(Long id) {
		// TODO Auto-generated method stub
		return pacienteDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Paciente save(Paciente paciente) {
		// TODO Auto-generated method stub
		return pacienteDao.save(paciente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pacienteDao.deleteById(id);
		
	}


}
