package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creare la classe Prodotto che gestisce i prodotti dello shop.
		// Un prodotto è caratterizzato da:
		//		- codice (numero intero)
		//		- nome
		//		- descrizione
		//		- prezzo
		//		- iva
		// Usate opportunamente i costruttori ed eventuali altri metodi di “utilità” per fare in modo che:
		//		alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
		//		Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
		//		Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
		//	Nello stesso package aggiungete una classe Main con metodo main
		//		nella quale testate tutte le funzionalità della classe Prodotto
		
		//	BONUS: create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri
		//		(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
			
		Prodotto [] scorte = new Prodotto[1];
		for (int i = 0; i < scorte.length; i++) {
			Prodotto prodotto = new Prodotto(100F, 21);
			scorte[i] = prodotto;
		}
		
		System.out.println(scorte[0].codice);
		System.out.println(scorte[0].prezzo);
		System.out.println(scorte[0].iva);
		
		System.out.println(scorte[0].aggiungereIva(scorte[0].prezzo, scorte[0].iva));
		
		// Aperto inputContainer
//		Scanner inputContainer = new Scanner(System.in);
//		
//		System.out.print("Inserisci nome del prodotto: ");
//		String nome = inputContainer.nextLine();
//		
//		System.out.print("Inserisci descrizione del prodotto: ");
//		String descrizione = inputContainer.nextLine();
//
//		System.out.print("Inserisci prezzo del prodotto: ");
//		float prezzo = Float.parseFloat(inputContainer.nextLine());
//		
//		System.out.print("Inserisci aliquota iva del prodotto: ");
//		int iva = Integer.parseInt(inputContainer.nextLine());
//		
//		inputContainer.close();
		// Chiuso inputContainer
		
		
	}

}
