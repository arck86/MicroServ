package es.arck.app.usuarios.services.impl;

import org.springframework.stereotype.Service;

import es.arck.app.commons.services.impl.CommonServicesImpl;
import es.arck.app.usuarios.models.entity.Alumno;
import es.arck.app.usuarios.models.repository.AlumnoDao;
import es.arck.app.usuarios.services.AlumnoService;

@Service
public class AmunoServiceImpl extends CommonServicesImpl<Alumno, AlumnoDao> implements AlumnoService{

}
