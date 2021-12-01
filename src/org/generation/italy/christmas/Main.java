package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		ArrayList<String> wishList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		boolean continua = true;
		String b;
		
		System.out.println("Qual'è il tuo nome: ");
		String n = scan.nextLine();
		System.out.println("Qual'è il tuo indirizzo: ");
		String i = scan.nextLine();
		
		try {
		while (continua) {
			System.out.println("Aggiungi elemento alla lista dei desideri: ");
			String a = scan.nextLine();
			wishList.add(a);

			System.out.println("La tua lista contiene " + wishList.size());	

			
			System.out.println("Continuare? (s/n)");	
			b = scan.nextLine();

			if (b.equals("n")) {
				continua = false;
			} else if (b.equals("s")) {				
				continua = true;
			}else {
				System.out.println("Inserisci s o n");
			}
		}
			Collections.sort(wishList);
			
			System.out.println("Ecco la tua lista: ");
			Iterator<String> iterator = wishList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			
			LetteraBabboNatale letteraBabboNatale = new LetteraBabboNatale(n, i, wishList);
			
				System.out.println(letteraBabboNatale.invia());}
		catch(Exception e ) {
			System.out.println("Hai fatto una lista troppo lunga (Max 5)");
		}
			

		}

	}