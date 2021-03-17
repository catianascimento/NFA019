package com.bankonet;

public class CompteEpargne extends Compte {

	private double tauxInteret;

	public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
		super(numero, intitule, solde);
		this.tauxInteret = tauxInteret;
	}
	
	@Override
	public String toString() {
		return super.toString() + "CompteEpargne [tauxInteret=" + tauxInteret + "]";
	}
	
	public void imprimer() {
		System.out.println("========================= Numero de compte:" + this.getNumero() + "=========================");
		System.out.println("Nom compte: " + this.getIntitule());
		System.out.println("Type compte: " + "Compte Epargne");
		System.out.println("Taux interet(%): " + this.tauxInteret);
		System.out.println("Solde votre compte: " + this.getSolde());
		System.out.println("========================================================================\n");
	}
	
	@Override
	public void debiter(double valeur) {
		super.setSolde(this.getSolde() - valeur);
		System.out.println("Montant debite: " + valeur);
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
}
