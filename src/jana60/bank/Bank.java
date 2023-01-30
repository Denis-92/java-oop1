package jana60.bank;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Bank {
	public static void main(String[] args) {
		
		String nomeProprietario;
		
		// Aperto scanner
		Scanner receiveInput = new Scanner(System.in);
		
		System.out.print("Benvenuto, inserisci il tuo nome per aprire il conto!");
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
		
		
		
		
	}

}
