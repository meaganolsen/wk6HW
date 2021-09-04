
public class Card {

	
	
	private String name;
	
	private int value;

	
	Card(String cardName, int cardValue){
		this.name = cardName;
		this.value = cardValue;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	public void describeCard() {
		System.out.println(name + " " + value); 
	}
}
