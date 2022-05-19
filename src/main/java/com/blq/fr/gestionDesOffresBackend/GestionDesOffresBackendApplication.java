package com.blq.fr.gestionDesOffresBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.blq.fr.gestionDesOffresBackend.repo.PartenaireRepo;
import com.blq.fr.gestionDesOffresBackend.service.PartenaireService;

//Mise en cache
//@EnableCaching
@SpringBootApplication
public class GestionDesOffresBackendApplication {
	
	private final PartenaireRepo partenaireRepo = null;

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
