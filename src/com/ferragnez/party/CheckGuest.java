package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
	
		//Versione FOR
		Scanner scanner = new Scanner(System.in);
		
		
		String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", 
				"Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", 
				"Martina Maccherone", "Rachel Zeilic"};
		
		/*
		 * guest list - print test
		 * System.out.println("Lista invitati: ");
		
		for(int i = 0; i < guests.length; i++) {
			System.out.println(guests[i]);
			}
		 */
		
		
		boolean trovato = false;
		
		System.out.println("Inserire nome utente: ");
		String yourName = scanner.nextLine();
		//System.out.println(yourName);
		

			
		for (int i = 0; i < guests.length; i++) {
			//System.out.println(guests[i] + " ");
		}
			
		for (int n = 0; n < guests.length; n++) {
			if (yourName.equals(guests[n])) {
				trovato = true;
				System.out.println("Lei è in lista, può entrare.");
				
				break;
			} 
			
			}
		
		if(!trovato) {
			System.out.println("Il suo nome non è in lista, non possiamo farla entrare.");
			
		
		
		scanner.close();
		}
		

	}
}



