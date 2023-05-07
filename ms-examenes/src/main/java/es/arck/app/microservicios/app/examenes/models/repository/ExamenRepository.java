package es.arck.app.microservicios.app.examenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import es.arck.app.microservicios.app.examenes.models.entity.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Long> {

}
