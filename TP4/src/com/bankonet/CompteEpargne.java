package com.bankonet;

public class CompteEpargne {

	private String numero;
	private String intitule;
	private double solde;
	private double tauxInteret;

	public CompteEpargne() {
	}

	public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
		this.tauxInteret = tauxInteret;
	}

	@Override
	public String toString() {
		return "CompteEpargne [numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + ", tauxInteret="
				+ tauxInteret + "]";
	}

	public void crediter(double valeur) {
		this.solde = this.solde + valeur;
		System.out.println("Montant credite: " + valeur);
	}

	public void debiter(double valeur) {
		this.solde = this.solde - valeur;
		System.out.println("Montant debite: " + valeur);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
}
