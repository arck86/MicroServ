package es.arck.app.usuarios.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.arck.app.commons.services.impl.CommonServicesImpl;
import es.arck.app.microservicios.commons.alumnos.models.entity.Alumno;
import es.arck.app.usuarios.models.repository.AlumnoDao;
import es.arck.app.usuarios.services.AlumnoService;

@Service
public class AlumnoServiceImpl extends CommonServicesImpl<Alumno, AlumnoDao> implements AlumnoService{

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String text){
		return repository.findByNombreOrApellido(text);
	}
}
