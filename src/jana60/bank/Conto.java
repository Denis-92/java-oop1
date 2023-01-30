package jana60.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {

	// Creare la classe Conto caratterizzata da:
	//		- numero di conto
	//		- nome del proprietario
	//		- saldo
	// Usate opportunamente i costruttori ed eventuali altri metodi di “utilità” per fare in modo che:
	//		- alla creazione di un nuovo conto il saldo sia 0€
	//		- siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare
	//			una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
	//		- altri metodi per ritornare le informazioni del conto e il saldo formattato
	// Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e 
	//		generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
	// Poi chiediamo all’utente cosa vuole fare dando 3 opzioni:
	//		versare una somma o prelevare una somma di denaro o uscire.
	// Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare
	//		e proviamo ad effettuare l’operazione sul conto.
	// Se l’operazione non è valida mostriamo un messaggio di errore.
	// Se l’operazione va a buon fine mostriamo il saldo attuale del conto.
	// Il menu continua ad apparire fino a che l’utente sceglie di uscire.
	
	private static final DecimalFormat formatta = new DecimalFormat("0.00");
	Random makeRandom = new Random();
	
	int numeroConto;
	String nomeProprietario;
	float saldo;
	
	public Conto(String nomeIntestatario) {
		saldo = 0;
		nomeProprietario = nomeIntestatario;
		numeroConto = makeRandom.nextInt(1000)+1;
	}
	
	public float versamento(float importo) {
		return saldo += importo;
	}
	
	public boolean prelievo (float importo) {
		boolean disponibilità = importo >= this.saldo;
		if (disponibilità) return false;
		else this.saldo -= importo;
		return true;
	}
	
	public int getNumeroConto() {
		return numeroConto;
	}
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	
	public String getSaldo() {
		return formattaImporto(saldo);
	}
	
	public String formattaImporto (float saldo) {
		String importoFormattato = formatta.format(saldo);
		return importoFormattato;
	}
	

}