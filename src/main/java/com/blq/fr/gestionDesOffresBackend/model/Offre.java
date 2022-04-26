package com.blq.fr.gestionDesOffresBackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "stock_offres")
public class Offre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String partenaire_vendeur_id;
	private String vin_id;
	private String millesime_id;
	private String format_id;
	private String conditionnement_id;
	private String commentaires;
	private Date date_maj;
	private Date date_crea;
	
	public Offre() {
	}

	public Offre(Long id, String partenaire_vendeur_id, String vin_id, String millesime_id, String format_id,
			String conditionnement_id, String commentaires, Date date_maj, Date date_crea) {
		super();
		this.id = id;
		this.partenaire_vendeur_id = partenaire_vendeur_id;
		this.vin_id = vin_id;
		this.millesime_id = millesime_id;
		this.format_id = format_id;
		this.conditionnement_id = conditionnement_id;
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

	public String getPartenaire_vendeur_id() {
		return partenaire_vendeur_id;
	}

	public void setPartenaire_vendeur_id(String partenaire_vendeur_id) {
		this.partenaire_vendeur_id = partenaire_vendeur_id;
	}

	public String getVin_id() {
		return vin_id;
	}

	public void setVin_id(String vin_id) {
		this.vin_id = vin_id;
	}

	public String getMillesime_id() {
		return millesime_id;
	}

	public void setMillesime_id(String millesime_id) {
		this.millesime_id = millesime_id;
	}

	public String getFormat_id() {
		return format_id;
	}

	public void setFormat_id(String format_id) {
		this.format_id = format_id;
	}

	public String getConditionnement_id() {
		return conditionnement_id;
	}

	public void setConditionnement_id(String conditionnement_id) {
		this.conditionnement_id = conditionnement_id;
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

	
	
}
