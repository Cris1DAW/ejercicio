package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		//SE CREAN LOS STRINGS PARA LA BARAJA
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();
		//BUCLE PARA SACAR LAS CARTAS
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		//BUCLE PARA EL NÚMERO DE CARTAS EN UNA BARAJA
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		//BUCLE PARA EL NÚMERO DE BARAJAS
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
