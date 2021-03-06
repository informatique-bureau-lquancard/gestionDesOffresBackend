package com.blq.fr.gestionDesOffresBackend.resource;

import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.PARTENAIRES_VIEW;
import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.PORT_CLIENT;
import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.URL_VM_DEV;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blq.fr.gestionDesOffresBackend.model.Partenaire;
import com.blq.fr.gestionDesOffresBackend.service.PartenaireService;

@CrossOrigin(origins = URL_VM_DEV + ":" + PORT_CLIENT)
@RestController
@RequestMapping("/" + PARTENAIRES_VIEW)
public class PartenaireResource {
	
	private final PartenaireService partenaireService;

	public PartenaireResource(PartenaireService partenaireService) {
		
		this.partenaireService = partenaireService;
	}
	
	@GetMapping("/all")
//	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Partenaire>> getAllPartenaires() {
		
		List<Partenaire> partenaires = partenaireService.findAllPartenaires();
		
		return new ResponseEntity<>(partenaires, HttpStatus.OK);
	}
	
	@GetMapping("/allWithView")
	public ResponseEntity<List<Partenaire>> getAllPartenairesWithView() {
		
		List<Partenaire> partenaires = partenaireService.findAllPartenaires();
		
		System.out.println(partenaires);
		
		return new ResponseEntity<>(partenaires, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Partenaire> getPartenaireById(@PathVariable("id") Long id) {
		
		Partenaire partenaire = partenaireService.findPartenaireById(id);
		
		return new ResponseEntity<>(partenaire, HttpStatus.OK);
	}
	
//	@PostMapping("/add")
//	public ResponseEntity<Partenaire> addPartenaire(@RequestBody Partenaire partenaire) {
//		
//		Partenaire newPartenaire = partenaireService.addPartenaire(partenaire);
//		
//		return new ResponseEntity<>(newPartenaire, HttpStatus.OK);
//	}
	
	@PutMapping("/update")
	public ResponseEntity<Partenaire> updatePartenaire(@RequestBody Partenaire partenaire) {
		
		Partenaire updatePartenaire = partenaireService.updatePartenaire(partenaire);
		
		return new ResponseEntity<>(updatePartenaire, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletePartenaire(@PathVariable("id") Long id) {
		
		partenaireService.deletePartenaire(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
