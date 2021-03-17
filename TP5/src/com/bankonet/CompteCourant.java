package com.bankonet;

final public class CompteCourant extends Compte {

	private double montantDecouvertAutorise;

	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		super(numero, intitule, solde);
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	public CompteCourant() {
	}

	@Override
	public String toString() {
		return super.toString() + "CompteCourant [montantDecouvertAutorise=" + montantDecouvertAutorise + "]";
	}

	public void imprimer() {
		System.out.println(
				"========================= Numero de compte:" + this.getNumero() + "=========================");
		System.out.println("Nom compte: " + this.getIntitule());
		System.out.println("Type compte: " + "Compte Courant");
		System.out.println("Autorisation de decouvert: " + this.montantDecouvertAutorise);
		System.out.println("Solde votre compte: " + this.getSolde());
		System.out.println("========================================================================\n");
	}

	@Override
	public void debiter(double valeur) {
		double result = this.getSolde() - valeur;

		if (result < 0) {
			if (result > montantDecouvertAutorise) {
				System.out.println("Il n'y a pas de solde disponible");
			} else {
				this.montantDecouvertAutorise -= result;
				this.setSolde(0);
				System.out.println("Montant debite: " + valeur);
			}
		} else {
			this.setSolde(this.getSolde() - valeur);
		}
	}

	public Double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

}
