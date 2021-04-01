package com.bankonet.test;

import com.bankonet.Client;
import com.bankonet.Compte;
import com.bankonet.CompteCourant;
import com.bankonet.CompteEpargne;
import com.bankonet.CreditException;
import com.bankonet.DebitException;

public class ClientTest {
	public static void main(String[] args) {
		Client[] clientTab = new Client[3];

		CompteCourant compteCourant1 = new CompteCourant("123", "Eric DUPONT", 120.0, 1000.00);
		CompteCourant compteCourant2 = new CompteCourant("456", "Antonie GOMEZ", 1200.0, 2000.00);
		CompteCourant compteCourant3 = new CompteCourant("789", "Stephanie RAMIREZ", 500.0, 3000.00);

		CompteEpargne compteEpargne1 = new CompteEpargne("1230", "Eric DUPONT", 12.0, 0.10);
		CompteEpargne compteEpargne2 = new CompteEpargne("4560", "Antonie GOMEZ", 20.0, 0.130);
//		CompteEpargne compteEpargne3 = new CompteEpargne("7890", "Stephanie RAMIREZ", 50.0, 0.20);

		Client client1 = new Client("123", "DUPONT", "Eric", compteCourant1, compteEpargne1);
		clientTab[0] = client1;

		Client client2 = new Client("456", "GOMEZ", "Antonie", compteCourant2, compteEpargne2);
		clientTab[1] = client2;

		Client client3 = new Client("789", "RAMIREZ", "Stephanie", compteCourant3, null);
		clientTab[2] = client3;

//		for (Client client : clientTab) {
//			System.out.println(client.toString());
//			if (client.getCompteCourant() != null)
//				System.out.println(client.getCompteCourant());
//			if (client.getCompteEpargne() != null)
//				System.out.println(client.getCompteEpargne());
//			System.out.println();
//		}
		
		//Afficher son avoir global
		for (Client client : clientTab) {
			System.out.println(client.toString());
			System.out.println(client.calculerAvoirGlobal());
//			System.out.println();
		}
		
		//Exercice 5
//		Compte nouvelleCompte = new Compte();
		
		try {
			client2.getCompteCourant().effectuerVirement(client3.getCompteCourant(), 10.0);
		} catch (DebitException e1) {
			System.out.println(e1.getMessage());
		} catch (CreditException e2) {
			System.out.println(e2.getMessage());
		}
	}
}
