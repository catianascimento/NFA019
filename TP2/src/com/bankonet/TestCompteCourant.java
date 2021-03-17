package com.bankonet;

public class TestCompteCourant {

	public static void main(String[] args) {
		
		CompteCourant compteCourant1 = new CompteCourant("123", "Eric DUPONT", 120.0, 1000.00);
		
		CompteCourant compteCourant2 = new CompteCourant("456", "Antonie GOMEZ", 1200.0, 2000.00);
		
		CompteCourant compteCourant3 = new CompteCourant("789", "Stephanie RAMIREZ", 500.0, 3000.00);

//		System.out.println("Numero compte: " + compteCourant1.getNumero() + "\nSolde: " + compteCourant1.getSolde());
//		System.out.println("Numero compte: " + compteCourant2.getNumero() + "\nSolde: " + compteCourant2.getSolde());
//		System.out.println("Numero compte: " + compteCourant3.getNumero() + "\nSolde: " + compteCourant3.getSolde());

		System.out.println("Valeur nbComptesCourants: "+ CompteCourant.getNbComptesCourants());
//		
		compteCourant1.imprimer();
//		compteCourant2.imprimer();
//		compteCourant3.imprimer();
//		
//		System.out.println("Valeur nbComptesCourants: "+ CompteCourant.getNbComptesCourants());
		
		compteCourant1.crediter(120.0);
		compteCourant1.imprimer();
		
		compteCourant1.debiter(50.0);
		compteCourant1.imprimer();
	}

}
