package ejercicio2;

public class Card {
	//SE CREAN LOS STRINGS PARA LA BARAJA
	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString () {
		return (this.suit+"-"+this.value); //DEVUELVE SUIT - VALUE
	}
}
