package com.blq.fr.gestionDesOffresBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Service;

import com.blq.fr.gestionDesOffresBackend.cache.CaffeineCacheConfig;
import com.blq.fr.gestionDesOffresBackend.repo.PartenaireRepo;
import com.blq.fr.gestionDesOffresBackend.resource.OffreResource;
import com.blq.fr.gestionDesOffresBackend.service.OffreService;
import com.blq.fr.gestionDesOffresBackend.service.PartenaireService;

@SpringBootApplication
public class GestionDesOffresBackendApplication {
	
	private final PartenaireRepo partenaireRepo = null;
	
	public static final String OFFRES_VIEW = "offres_view2";
	public static final String PARTENAIRES_VIEW = "partenaires_view";
	public static final String URL_VM_DEV = "http://192.168.100.16";
	public static final String PORT_CLIENT = "4200";

	public static void main(String[] args) {
		
		//Initialisation avec un fichier batch
//		String cheminAccessInit = "../gestionDesOffresBackend/src/main/resources/static/batchs/init_GestionDesOffresBackendApplication.bat";
//		Batch init_tunnel_ssh = new Batch(cheminAccessInit);
		
		SpringApplication.run(GestionDesOffresBackendApplication.class, args);
		
		// Autre façon de se connecter, pour faire des connexions à plusieurs bases
//		OffreDataAccess offreDataAccess = new OffreDataAccess();
//		List<Offre> list = offreDataAccess.getAll();
		
	}

}
