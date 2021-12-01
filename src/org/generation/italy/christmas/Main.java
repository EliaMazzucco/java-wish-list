package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> wishList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		boolean continua = false;
		String b= "";

		while (!continua) {
			System.out.println("Aggiungi elemento alla lista dei desideri: ");
			String a = scan.nextLine();
			wishList.add(a);

			System.out.println("La tua lista contiene " + wishList.size());	

			
			
			
			System.out.println("Continuare? (s/n)");	
			b = scan.nextLine();
			
						
			if (b.equals("n")) {
				continua = true;
			} else if (b.equals("s")) {
				continua = false;
			} else  {
				System.out.println("Inserisci s o n");
			}

		}
		Iterator<String> iterator = wishList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}