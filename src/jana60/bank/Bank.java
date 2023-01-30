package jana60.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		String nomeProprietario;
		
		// Aperto scanner
		Scanner receiveInput = new Scanner(System.in);
		
		System.out.print("Benvenuto, inserisci il tuo nome per aprire il conto! ");
		nomeProprietario = receiveInput.nextLine();
		
		Conto contoCorrente = new Conto(nomeProprietario);
		
		System.out.println(
				contoCorrente.getNomeProprietario() +
				" Grazie per aver aperto un conto presso questa banca." +
				" Il numero del tuo conto è: " +
				contoCorrente.getNumeroConto() +
				" Il saldo del tuo conto è: " +
				contoCorrente.getSaldo()
		);
		
		
		int scelta;	
		System.out.print("Scegliere: 1 per Versamento - 2 per Prelievo - 3 per Terminare: ");
		scelta = receiveInput.nextInt();
			
		boolean versamento = scelta == 1;
		boolean prelievo = scelta == 2;
		boolean termina = scelta == 3;
		
		while (!termina) {
			if (!versamento && !prelievo) {
				System.out.println("Errore! Valore inserito non corretto!");
				System.out.print("Scegliere: 1 per Versamento - 2 per Prelievo - 3 per Terminare: ");
				scelta = receiveInput.nextInt();
			}
			if (versamento) {
				System.out.print("Quanto vuoi versare sul conto? ");
				float importoVersato = receiveInput.nextFloat();
				contoCorrente.versamento(importoVersato);
				System.out.print("Scegliere: 1 per Versamento - 2 per Prelievo - 3 per Terminare: ");
				scelta = receiveInput.nextInt();
			}
			if (prelievo) {
				System.out.print("Quanto vuoi prelevare dal conto? ");
				float importoRichiesto = receiveInput.nextFloat();
				contoCorrente.prelievo(importoRichiesto);
				System.out.print("Scegliere: 1 per Versamento - 2 per Prelievo - 3 per Terminare: ");
				scelta = receiveInput.nextInt();
			}
		}
		
		System.out.println("Programma terminato, grazie per aver usato il nostro servizio!");
		
		receiveInput.close();
		// Chiuso inputContainer
		
	}

}
