package es.arck.app.microservicios.app.examenes.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.arck.app.commons.controller.CommonController;
import es.arck.app.microservicios.app.examenes.models.entity.Examen;
import es.arck.app.microservicios.app.examenes.models.entity.Pregunta;
import es.arck.app.microservicios.app.examenes.service.ExamenService;

@RestController
public class ExamenController extends CommonController<Examen, ExamenService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar (@RequestBody Examen examen, @PathVariable Long id){
		Optional<Examen> o = service.findById(id);
		
		if(!o.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Examen examendb = o.get();

		examendb.setNombre(examen.getNombre());

		List<Pregunta> eliminadas = new ArrayList<Pregunta>();
		examendb.getPreguntas().forEach(item ->{
			if(!examen.getPreguntas().contains(item)) {
				eliminadas.add(item);
			}
		});
		
		return ResponseEntity.ok().body(examendb);
	}

}
