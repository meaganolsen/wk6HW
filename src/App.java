
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		for(int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
			
			
		}
		
//		player1.describePlayer();
//		player2.describePlayer();
		
		Card player1Card = player1.flip();
		Card player2Card = player2.flip();
		
		
		for(int i = 0; i < 25; i++) {
			player1.flip();
			player2.flip();
			
		if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
		}
		else if(player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();	
		}
		else {
				System.out.println("It's a draw!!!");
		}
		}
		
		
		
	
    	if(player1.score > player2.score) {
    		System.out.println("Player 1 wins!!");
		}
		else if(player1.score < player2.score) {
			System.out.println("Player 2 wins!!");
		}
		else {
			System.out.println("It's a draw!!");
		}
		System.out.println(player1.score);
		System.out.println(player2.score);
		
		
				
		
		
		
		
	}

}
