package com.bankonet;

public class Client {

	private String identifiant;
	private String nom;
	private String prenom;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;

	public Client(String identifiant, String nom, String prenom, CompteCourant compteCourant,
			CompteEpargne compteEpargne) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	public Client() {
	}

	public double calculerAvoirGlobal() {
		double total = 0.0;
		if (this.compteCourant != null)
			total += this.compteCourant.getSolde();
		if (this.compteEpargne != null)
			total += this.compteEpargne.getSolde();
		return total;
	}

	@Override
	public String toString() {
		String result = "Client [ nom=" + nom + ", prenom=" + prenom + "]";
		result += (this.compteCourant == null) ? "" : "\n" + this.compteCourant.toString();
		result += (this.compteEpargne == null) ? "" : "\n" + this.compteEpargne.toString();

		return result;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
}
