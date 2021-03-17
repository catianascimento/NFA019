package com.bankonet;

public class TestCompteCourant {

	public static void main(String[] args) {

		// tester la construction d’un compte avec un solde négatif
		CompteCourant compteCourant1 = new CompteCourant("123", "Eric DUPONT", -120.0, 1000.00);

		CompteCourant compteCourant2 = new CompteCourant("456", "Antonie GOMEZ", 1200.0, 2000.00);

		CompteCourant compteCourant3 = new CompteCourant("789", "Stephanie RAMIREZ", 500.0, 3000.00);

		CompteCourant[] comptes = new CompteCourant[3];
		comptes[0] = compteCourant1;
		comptes[1] = compteCourant2;
		comptes[2] = compteCourant3;

		comptes[0].imprimer();

		int solde = (int) Math.round(comptes[0].getSolde());
		switch (solde) {
		case 0:
			System.out.println("solde nul");
			break;
		case 10000:
			System.out.println("solde créditeur");
			break;
		default:
			System.out.println("ras");
			break;
		}

		// EXERCICE 4
		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i].toString());
		}

		System.out.println("\nJAVA 5\n");
		// version Java 5
		for (CompteCourant compteCourant : comptes) {
			System.out.println(compteCourant.toString());
		}
	}

}
