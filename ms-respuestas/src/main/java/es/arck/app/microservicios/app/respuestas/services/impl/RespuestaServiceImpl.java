package es.arck.app.microservicios.app.respuestas.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.arck.app.microservicios.app.respuestas.models.entity.Respuesta;
import es.arck.app.microservicios.app.respuestas.models.respository.RespuestaRepository;
import es.arck.app.microservicios.app.respuestas.services.RespuestaService;

@Service
public class RespuestaServiceImpl implements RespuestaService {

	@Autowired
	private RespuestaRepository respuestaRepository;
	
	@Override
	@Transactional
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {
		return respuestaRepository.saveAll(respuestas);
	}
	
	@Override
	@Transactional(readOnly= true)
	public Iterable<Respuesta> findRespuestaByAlumnoAndExamen(Long alumnoId, Long examenId){
		return respuestaRepository.findRespuestaByAlumnoAndExamen(alumnoId, examenId);
	}

	@Override
	@Transactional(readOnly= true)
	public Iterable<Long> finExamenesIdConRespuestasPorAlumno(Long alumnoId){
		return respuestaRepository.finExamenesIdConRespuestasPorAlumno(alumnoId);
	}
}
