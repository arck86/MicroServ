package es.arck.app.microservicios.app.respuestas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.arck.app.microservicios.app.respuestas.models.entity.Respuesta;
import es.arck.app.microservicios.app.respuestas.services.RespuestaService;

@RestController
public class RespuestaController {

	@Autowired
	private RespuestaService respuestaService;
	
	@PostMapping("/crearAll")
	public ResponseEntity<?> crearAll(@RequestBody Iterable<Respuesta> respuestas){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(respuestaService.saveAll(respuestas));
	}
	
	@GetMapping("/alumno/{alumnoId}/examen/{examenId}")
	public ResponseEntity<?> findRespuestaByAlumnoAndExamen(@PathVariable Long alumnoId, @PathVariable Long examenId){
		
		Iterable<Respuesta> lista = respuestaService.findRespuestaByAlumnoAndExamen(alumnoId, examenId);
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping("/alumno/{alumnoId}/examenes-respondidos")
	public ResponseEntity<?> finExamenesIdConRespuestasPorAlumno(@PathVariable Long alumnoId){
		
		Iterable<Long> examenesIds = respuestaService.finExamenesIdConRespuestasPorAlumno(alumnoId);
		return ResponseEntity.ok().body(examenesIds);
	}
}
