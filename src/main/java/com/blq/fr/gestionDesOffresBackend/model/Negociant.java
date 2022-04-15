package com.blq.fr.gestionDesOffresBackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Negociant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String pays_id;
	private String type_partenaire_id;
	private String nom;
	private Date date_maj;
	private Date date_crea;
	@Column(nullable = false, updatable = false)
	private String negociantCode;
	
	
	public Negociant() {
	}


	public Negociant(Long id, String pays_id, String type_partenaire_id, String nom, Date date_maj, Date date_crea,
			String negociantCode) {
		super();
		this.id = id;
		this.pays_id = pays_id;
		this.type_partenaire_id = type_partenaire_id;
		this.nom = nom;
		this.date_maj = date_maj;
		this.date_crea = date_crea;
		this.negociantCode = negociantCode;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPays_id() {
		return pays_id;
	}


	public void setPays_id(String pays_id) {
		this.pays_id = pays_id;
	}


	public String getType_partenaire_id() {
		return type_partenaire_id;
	}


	public void setType_partenaire_id(String type_partenaire_id) {
		this.type_partenaire_id = type_partenaire_id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Date getDate_maj() {
		return date_maj;
	}


	public void setDate_maj(Date date_maj) {
		this.date_maj = date_maj;
	}


	public Date getDate_crea() {
		return date_crea;
	}


	public void setDate_crea(Date date_crea) {
		this.date_crea = date_crea;
	}


	public String getNegociantCode() {
		return negociantCode;
	}


	public void setNegociantCode(String negociantCode) {
		this.negociantCode = negociantCode;
	}

	



	
	
	
	
	
}
