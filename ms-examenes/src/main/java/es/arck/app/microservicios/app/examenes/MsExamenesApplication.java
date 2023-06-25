package es.arck.app.microservicios.app.examenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EntityScan({"es.arck.app.microservicios.commons.examenes.models.entity"})
public class MsExamenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsExamenesApplication.class, args);
	}

}
