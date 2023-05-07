package es.arck.app.microservicios.app.cursos.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.arck.app.commons.services.impl.CommonServicesImpl;
import es.arck.app.microservicios.app.cursos.models.entity.Curso;
import es.arck.app.microservicios.app.cursos.models.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServicesImpl<Curso, CursoRepository> implements CursoService {

	@Override
	@Transactional(readOnly = true)
	public Curso findCursoByAlumnoId(Long id) {
		// TODO Auto-generated method stub
		return repository.findCursoByAlumnoId(id);
	}

}
