package es.arck.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import es.arck.app.usuarios.models.entity.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Long> {


}
