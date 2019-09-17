package com.imss.apirest.model.dao;
import org.springframework.data.repository.CrudRepository;

import com.imss.apirest.model.entity.Paciente;

public interface IPacienteDao extends CrudRepository<Paciente,Long>{
	

}
