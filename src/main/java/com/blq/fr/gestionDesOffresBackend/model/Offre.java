package com.blq.fr.gestionDesOffresBackend.model;

import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.OFFRES_VIEW;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication;

@Entity(name = OFFRES_VIEW)
//public class Offre implements Serializable {
public class Offre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String partenaire;
	private String vin;
	private String millesime;
	private String format;
	
	private int quantite;
	private double prix;
	
	private String conditionnement;
	private String commentaires;
	private Date date_maj;
	private Date date_crea;
	
	public Offre() {
	}

	public Offre(Long id, String partenaire, String vin, String millesime, String format, int quantite,
			double prix, String conditionnement, String commentaires, Date date_maj, Date date_crea) {
		super();
		this.id = id;
		this.partenaire = partenaire;
		this.vin = vin;
		this.millesime = millesime;
		this.format = format;
		this.quantite = quantite;
		this.prix = prix;
		this.conditionnement = conditionnement;
		this.commentaires = commentaires;
		this.date_maj = date_maj;
		this.date_crea = date_crea;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartenaire() {
		return partenaire;
	}

	public void setPartenaire(String partenaire) {
		this.partenaire = partenaire;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getMillesime() {
		return millesime;
	}

	public void setMillesime(String millesime) {
		this.millesime = millesime;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getConditionnement() {
		return conditionnement;
	}

	public void setConditionnement(String conditionnement) {
		this.conditionnement = conditionnement;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
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

	//Utiliser pour l'utilisation de cache
//	public int hashCode() {
//		return id.intValue();
//	}
	
}
