package com.blq.fr.gestionDesOffresBackend.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.blq.fr.gestionDesOffresBackend.service.OffreService;
import com.blq.fr.gestionDesOffresBackend.service.PartenaireService;

@Component
public class CaffeineCache implements CommandLineRunner {
	
	@Autowired
	PartenaireService partenaireService;
	
	@Autowired
	OffreService offreService;
	
	public void run(String... args) throws Exception {
		
//		LOG.info("Starting the Caffeine cache testing process");
		
		long start;
		long elapsedTimeMillis;
		
		start = System.currentTimeMillis();

		//Données récupérées et mis en cache
		exemple();
		
		//Données récupérées depuis le cache
		exemple();
		
		exemple();
		
		exemple();

	}
	
	public void exemple() {
		
		long start = System.currentTimeMillis();
		
		System.out.println(partenaireService.findAllPartenaires());
		System.out.println(offreService.findAllOffres());
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		
		System.out.println("temps : " + elapsedTimeMillis + " ms");
		
	}

}
