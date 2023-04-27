package es.arck.app.commons.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import es.arck.app.commons.services.CommonService;


public class CommonController<E, S extends CommonService<E>> {
	
	@Autowired
	protected S service;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> ver(@PathVariable Long id){
		Optional<E> alumno = service.findById(id);
		if(alumno.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(alumno.get());
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> crear(@RequestBody E entity){
		E entityDB = service.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entityDB);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrar(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	

}
