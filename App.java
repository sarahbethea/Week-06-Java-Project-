package week06CodingProjectVersion2;

public class App {
	
	public static void main(String[] args) {
		
		
		Player p1 = new Player("Thomas");
		Player p2 = new Player("Sally");
		Deck currentDeck = new Deck();
		
		currentDeck.shuffle();
		
		
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(currentDeck);
			} else {
				p2.draw(currentDeck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			
			Card card1 = p1.flip();
			Card card2 = p2.flip();
			System.out.println("Player 1's card:");
			card1.describe();
			System.out.println("Player 2's card:");
			card2.describe();
			
			if (card1.getValue() > card2.getValue()) {
				System.out.println("Player 1, " + p1.getName() + ", gets a point!");
				p1.incrementScore();
			} else if (card2.getValue() > card1.getValue()){
				System.out.println("Player 2, " + p2.getName() + ", gets a point!");
				p2.incrementScore();
			} else if (card1.getValue() == card2.getValue()){
				System.out.println("It's a draw! No points were awarded.");
			}
		}
		
		System.out.println("Final scores: ");
		System.out.println("Player 1, " + p1.getName() + ": " + p1.getScore());
		System.out.println("Player 2, " + p2.getName() + ": " + p2.getScore());
		
		if (p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 wins!");
		} else if (p2.getScore() > p1.getScore()) {
			System.out.println("Player 2 wins!");
		} else if (p1.getScore() == p2.getScore()){
			System.out.println("It's a draw!");
		}
		
		
		
	}

}
