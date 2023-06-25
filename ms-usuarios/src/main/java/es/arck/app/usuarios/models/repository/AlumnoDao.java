package es.arck.app.usuarios.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.arck.app.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoDao extends JpaRepository<Alumno, Long> {


	@Query("select a from Alumno a where a.nombre like %?1% or a.apellido like %?1%")
	public List<Alumno> findByNombreOrApellido(String text);
}
