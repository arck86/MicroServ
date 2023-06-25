package es.arck.app.microservicios.app.examenes.service;

import java.util.List;

import es.arck.app.commons.services.CommonService;
import es.arck.app.microservicios.commons.examenes.models.entity.Asignatura;
import es.arck.app.microservicios.commons.examenes.models.entity.Examen;

public interface ExamenService extends CommonService<Examen>{
	
	public List<Examen> findByNombre(String term);
	
	public List<Asignatura> findAllAsignaturas();

}
