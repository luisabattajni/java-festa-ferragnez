package com.ferragnez.party;


import java.util.Scanner;

public class CheckGuestWhile {

	public static void main(String[] args) {
		//Versione WHILE
		
		Scanner scanner = new Scanner(System.in);
		
		String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", 
				"Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", 
				"Martina Maccherone", "Rachel Zeilic"};
		
		int n = 0;
		boolean trovato = false;
		
		System.out.println("Inserire nome utente: ");
		String yourName = scanner.nextLine();
		
		
		while (!trovato  && n < guests.length) {
			if (yourName.equals(guests[n])) {
				trovato = true;
				System.out.println("Lei è in lista, può entrare.");

			} else {
			n++;
		}

	}

	if (!trovato) {
		System.out.println("Il suo nome non è in lista, non possiamo farla entrare");
		
	}
		scanner.close();

	}

}
