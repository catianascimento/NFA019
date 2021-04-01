package fr.com.nfa019.restaurant.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "produits")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private Integer dureeDeConservationEnHeures;
	@ManyToOne
	private Categorie categorie;
	
	public Produit() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

//	public Produit(String nom, Integer dureeDeConservationEnHeures, Categorie categorie) {
//		this.nom = nom;
//		this.dureeDeConservationEnHeures = dureeDeConservationEnHeures;
//		this.categorie = categorie;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getDureeDeConservationEnHeures() {
		return dureeDeConservationEnHeures;
	}

	public void setDureeDeConservationEnHeures(Integer dureeDeConservationEnHeures) {
		this.dureeDeConservationEnHeures = dureeDeConservationEnHeures;
	}

//	public Categorie getCategorie() {
//		return categorie;
//	}
//
//	public void setCategorie(Categorie categorie) {
//		this.categorie = categorie;
//	}
}
