package es.arck.app.microservicios.app.examenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.arck.app.commons.services.impl.CommonServicesImpl;
import es.arck.app.microservicios.app.examenes.models.repository.AsignaturaRepository;
import es.arck.app.microservicios.app.examenes.models.repository.ExamenRepository;
import es.arck.app.microservicios.commons.examenes.models.entity.Asignatura;
import es.arck.app.microservicios.commons.examenes.models.entity.Examen;

@Service
public class ExamenServiceImpl extends CommonServicesImpl<Examen, ExamenRepository> implements ExamenService {

	@Autowired
	AsignaturaRepository asignaturaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String term) {
		return repository.findByNombre(term);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Asignatura> findAllAsignaturas(){
		return (List<Asignatura>) asignaturaRepository.findAll();
	}

}
