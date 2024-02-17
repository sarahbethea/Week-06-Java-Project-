package week06CodingProjectVersion2;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
		private String name;
		private List<Card> hand = new ArrayList<Card>();
		private int score;
		
		
		Player(String name) {
			this.name = name;
			this.hand = new ArrayList<Card>();
			this.score = 0;
			
		}
		
		
		public void describe() {
			System.out.println("Player: " + this.name + ". \rScore: " + this.score);
			for (Card card : hand) {
				card.describe();
			}
		}
		
		public Card flip() {
			if (hand.size() > 0) {
				return this.hand.remove(0);
			} else {
				System.out.println("Please draw a hand first");
				return null;
			}
		}
		
		public void draw(Deck deck) {
			Card drawnCard = deck.draw();
			hand.add(drawnCard);
		}
		
		public void incrementScore() {
			this.score += 1; 
			
		}
		
	
		
		


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public List<Card> getHand() {
			return hand;
		}


		public void setHand(List<Card> hand) {
			this.hand = hand;
		}


		public int getScore() {
			return score;
		}


		public void setScore(int score) {
			this.score = score;
		}
		
		

}
