package activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] one = new String[3];
		String[] two = new String[3];
		int[] three = new int[3];
		one[0]="A";
		one[1]="B";
		one[2]="C";
		two[0]="Hearts";
		two[1]="Clubs";
		two[2]="Spades";
		three[0]=2;
		three[1]=1;
		three[2]=6;
		Deck deck1 = new Deck(one,two,three);
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
	}
}
