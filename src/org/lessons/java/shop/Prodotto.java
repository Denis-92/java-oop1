package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	float prezzo;
	int iva;
	
	public Prodotto(String nome, float prezzo, int iva) {
		super();
		Random makeRandom = new Random();
		codice = makeRandom.nextInt() & Integer.MAX_VALUE;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	float getPrezzoBase() {
		return prezzo;
	}
	
	float getPrezzoConIva() {
		return prezzo * (iva + 100) / 100F;
	}
	
	String getNomeEsteso() {
		String nomeEsteso = codice+"-"+nome;
		return nomeEsteso;
	}

}