package Activity1;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("12","clubs",12);
		Card two = new Card("12","diamonds",4);
		Card three = new Card("4","clubs",12);
		System.out.println(one.matches(two));
		System.out.println(one.matches(three));
		System.out.println(three.matches(two));
		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
	}
}
