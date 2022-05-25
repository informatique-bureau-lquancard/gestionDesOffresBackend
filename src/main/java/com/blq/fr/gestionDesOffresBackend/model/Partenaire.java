package com.blq.fr.gestionDesOffresBackend.model;

import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.PARTENAIRES_VIEW;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication;

@Entity(name = PARTENAIRES_VIEW)
public class Partenaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String pays;
	private String type_partenaire;
	private String nom;
	private Date date_maj;
	private Date date_crea;
	
	public Partenaire() {
	}


	public Partenaire(Long id, String pays, String type_partenaire, String nom, Date date_maj, Date date_crea,
			String partenaireCode) {
		super();
		this.id = id;
		this.pays = pays;
		this.type_partenaire = type_partenaire;
		this.nom = nom;
		this.date_maj = date_maj;
		this.date_crea = date_crea;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getType_partenaire() {
		return type_partenaire;
	}


	public void setType_partenaire(String type_partenaire) {
		this.type_partenaire = type_partenaire;
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
	
//	//Utiliser pour l'utilisation de cache
//	public int hashCode() {
//		return id.intValue();
//	}
	
}
