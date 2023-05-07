package es.arck.app.usuarios.services;

import java.util.List;

import es.arck.app.commons.services.CommonService;
import es.arck.app.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno>{

	public List<Alumno> findByNombreOrApellido(String text);
}
