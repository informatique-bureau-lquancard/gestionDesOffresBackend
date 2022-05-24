package com.blq.fr.gestionDesOffresBackend.resource;

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

import com.blq.fr.gestionDesOffresBackend.model.Offre;
import com.blq.fr.gestionDesOffresBackend.model.Partenaire;
import com.blq.fr.gestionDesOffresBackend.service.OffreService;
import com.blq.fr.gestionDesOffresBackend.service.PartenaireService;


//@CrossOrigin(origins = "http://192.168.100.178:4200")
@CrossOrigin(origins = "http://192.168.100.16:4200")
@RestController
@RequestMapping("/offres_view2")
//@RequestMapping("/offres_view")
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
	
	@PutMapping("/update")
	public ResponseEntity<Offre> updateOffre(@RequestBody Offre offre) {
		
		Offre updateOffre = offreService.updateOffre(offre);
		
		return new ResponseEntity<>(updateOffre, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteOffre(@PathVariable("id") Long id) {
		
		offreService.deleteOffre(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
