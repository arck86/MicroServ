package es.arck.app.microservicios.app.respuestas.services;

import es.arck.app.microservicios.app.respuestas.models.entity.Respuesta;

public interface RespuestaService {
	
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);
	
	public Iterable<Respuesta> findRespuestaByAlumnoAndExamen(Long alumnoId, Long examenId);
	
	public Iterable<Long> finExamenesIdConRespuestasPorAlumno(Long alumnoId);

}
