package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	float prezzo;
	int iva;
	
	public Prodotto(float prezzo, int iva) {
		super();
		Random makeRandom = new Random();
		codice = makeRandom.nextInt() & Integer.MAX_VALUE;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	float aggiungereIva(float prezzoBase, int aliquota) {
		float prezzoTotale = prezzoBase * (aliquota + 100) / 100F;
		return prezzoTotale;
	}
	
	float togliereIva(float prezzoTassato, int aliquotaApplicata) {
		float prezzoBase = (100F * prezzoTassato) / (100F + aliquotaApplicata);
		return prezzoBase;
	}
	
	String dammiNomeEsteso(String nome, int codice) {
		String nomeEsteso = codice+"-nome";
		return nomeEsteso;
	}

}