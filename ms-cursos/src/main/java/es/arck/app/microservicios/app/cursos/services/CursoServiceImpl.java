package es.arck.app.microservicios.app.cursos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.arck.app.commons.services.impl.CommonServicesImpl;
import es.arck.app.microservicios.app.cursos.clients.RespuestaFeignClient;
import es.arck.app.microservicios.app.cursos.models.entity.Curso;
import es.arck.app.microservicios.app.cursos.models.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServicesImpl<Curso, CursoRepository> implements CursoService {

	@Autowired
	private RespuestaFeignClient respuestaFeignClient;
	
	@Override
	@Transactional(readOnly = true)
	public Curso findCursoByAlumnoId(Long id) {
		return repository.findCursoByAlumnoId(id);
	}

	@Override
	public Iterable<Long> finExamenesIdConRespuestasPorAlumno(Long alumnoId){
		return respuestaFeignClient.finExamenesIdConRespuestasPorAlumno(alumnoId);
	}
}
