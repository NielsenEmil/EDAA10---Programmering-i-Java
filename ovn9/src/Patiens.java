import java.util.Scanner;

public class Patiens {

	public static void main(String[] args) {
		int win = 0;
		CardDeck deck = new CardDeck();
		Scanner scan = new Scanner(System.in);
		System.out.println("Välj ett antal gånger som patiensen skall läggas: ");
		int times = scan.nextInt();
		for (int k = 1; k <= times; k++) {
			boolean pop = true;
			deck.shuffle();
			for (int x = 0; deck.moreCards(); x++) {
				x = x % 3 + 1;
				if (deck.getCard().getRank() == x) {
					pop = false;
					break;
				}
			}
			if (pop) {
				win++;
			}

		}
		double result = (double) win / (double) times;
		System.out.println("Antalet försök: " + times);
		System.out.println("Antalet lyckade försök: " + win);
		System.out.println("Medelvärde: " + result);

	}

}
