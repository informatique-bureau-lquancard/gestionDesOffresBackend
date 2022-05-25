package com.blq.fr.gestionDesOffresBackend.resource;

import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.OFFRES_VIEW;
import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.PORT_CLIENT;
import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.URL_VM_DEV;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication;
import com.blq.fr.gestionDesOffresBackend.model.Offre;
import com.blq.fr.gestionDesOffresBackend.model.Partenaire;
import com.blq.fr.gestionDesOffresBackend.service.OffreService;
import com.blq.fr.gestionDesOffresBackend.service.PartenaireService;

@CrossOrigin(origins = URL_VM_DEV + ":" + PORT_CLIENT)
@RestController
@RequestMapping("/" + OFFRES_VIEW)
public class OffreResource {
	
	private final OffreService offreService;

	public OffreResource(OffreService offreService) {
		
		this.offreService = offreService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Offre>> getAllOffres() {
		
		List<Offre> offres = offreService.findAllOffres();
		
		return new ResponseEntity<>(offres, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Offre> getOffreById(@PathVariable("id") Long id) {
		
		Offre offre = offreService.findOffreById(id);
		
		return new ResponseEntity<>(offre, HttpStatus.OK);
	}
	
//	@PostMapping("/add")
//	public ResponseEntity<Offre> addPartenaire(@RequestBody Offre offre) {
//		
//		Offre newOffre = offreService.addOffre(offre);
//		
//		return new ResponseEntity<>(newOffre, HttpStatus.OK);
//	} 
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteOffre(@PathVariable("id") Long id) {
		
		offreService.deleteOffre(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
