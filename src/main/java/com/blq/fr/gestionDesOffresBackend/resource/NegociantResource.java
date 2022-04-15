package com.blq.fr.gestionDesOffresBackend.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blq.fr.gestionDesOffresBackend.model.Negociant;
import com.blq.fr.gestionDesOffresBackend.service.NegociantService;

@RestController
@RequestMapping("/negociant")
public class NegociantResource {
	
	private final NegociantService negociantService;

	public NegociantResource(NegociantService negociantService) {
		
		this.negociantService = negociantService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Negociant>> getAllNegociants() {
		
		List<Negociant> negociants = negociantService.findAllNegociants();
		
		return new ResponseEntity<>(negociants, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Negociant> getNegociantById(@PathVariable("id") Long id) {
		
		Negociant negociant = negociantService.findNegociantById(id);
		
		return new ResponseEntity<>(negociant, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Negociant> addNegociant(@RequestBody Negociant negociant) {
		
		Negociant newNegociant = negociantService.addNegociant(negociant);
		
		return new ResponseEntity<>(newNegociant, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Negociant> updateNegociant(@RequestBody Negociant negociant) {
		
		Negociant updateNegociant = negociantService.updateNegociant(negociant);
		
		return new ResponseEntity<>(updateNegociant, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteNegociant(@PathVariable("id") Long id) {
		
		negociantService.deleteNegociant(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
