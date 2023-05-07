package es.arck.app.microservicios.app.examenes.service;

import org.springframework.stereotype.Service;

import es.arck.app.commons.services.impl.CommonServicesImpl;
import es.arck.app.microservicios.app.examenes.models.entity.Examen;
import es.arck.app.microservicios.app.examenes.models.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServicesImpl<Examen, ExamenRepository> implements ExamenService {

}
