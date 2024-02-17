package week06CodingProjectVersion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	
	
	private List<Card> cards = new ArrayList<Card>();

	
	Deck() {
		
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			int count = 2; 
			for (String number : numbers) {
				String name = (number + " of " + suit);
				Card card = new Card(name, count);
				this.cards.add(card);
				count++;
			}
		}
		
	}
	
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
	
	
	
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	


}
