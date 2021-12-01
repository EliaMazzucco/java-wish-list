package org.generation.italy.christmas;

import java.util.List;

public class LetteraBabboNatale {
	
	private String nome;
	private String indirizzo;
	private List<String> listaDesideri;
	
	
	public LetteraBabboNatale(String nome, String indirizzo, List<String> listaDesideri)  {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = listaDesideri;
	}
	
	public String invia() throws Exception {
	
		if(listaDesideri.size() > 5) {
			throw new Exception("La tua lista è troppo lunga");
		}else {
			return nome +" "+ indirizzo +" " + listaDesideri;
		}
	}
	
			
}
