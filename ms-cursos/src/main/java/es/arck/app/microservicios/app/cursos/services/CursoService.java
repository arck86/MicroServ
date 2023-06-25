package es.arck.app.microservicios.app.cursos.services;

import es.arck.app.commons.services.CommonService;
import es.arck.app.microservicios.app.cursos.models.entity.Curso;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);
	
	public Iterable<Long> finExamenesIdConRespuestasPorAlumno(Long alumnoId);
}
