package com.bankonet.test;

import com.bankonet.CompteCourant;

public class TestCompteCourant {

	public static void main(String[] args) {

		// tester la construction d’un compte avec un solde négatif
		CompteCourant compteCourant1 = new CompteCourant("123", "Eric DUPONT", -120.0, 1000.00);

		CompteCourant compteCourant2 = new CompteCourant("456", "Antonie GOMEZ", 1200.0, 2000.00);

		CompteCourant compteCourant3 = new CompteCourant("789", "Stephanie RAMIREZ", 500.0, 3000.00);

		compteCourant1.crediter(100.0);
		compteCourant1.crediter(200.0);
		compteCourant1.crediter(300.0);
		
//		System.out.println("Nombre de comptes: "+ CompteCourant.getNbComptesCourants());
	}

}
