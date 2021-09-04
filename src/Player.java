import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	
	

	public Player(String name) {
		
		this.score = 0;
		this.name = name;
	}
	public void describePlayer() {
	 	System.out.println(name + " " + score );
	 	for(Card card : hand) {
	 		card.describeCard();
	 	}
	}
	public Card flip() {
		return hand.remove(0); 
	}
	public void draw(Deck deck) {
		 hand.add(deck.draw());
	}
	public void incrementScore() {
		score++;
	}
}
