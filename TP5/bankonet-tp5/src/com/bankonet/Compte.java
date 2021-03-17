package com.bankonet;

public abstract class Compte {

	private String numero;
	private String intitule;
	private double solde;

	public Compte(String numero, String intitule, double solde) {
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde < 0.0 ? 0.0 : solde;
	}

	public Compte() {
	}

	public void crediter(double valeur) {
		this.solde = this.solde + valeur;
		System.out.println("Montant crédité: " + valeur);
	}

	public void debiter(double valeur) {
		this.solde = this.solde - valeur;
		System.out.println("Montant débité: " + valeur);
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + "]";
	}

	public void setSolde(double solde) {
		this.solde = solde;
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

	public Double getSolde() {
		return solde;
	}

}
