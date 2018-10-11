import java.util.Random;

public class CardDeck {

	private Card[] theCards;
	private int cardsLeft;

	public CardDeck() {
		theCards = new Card[52];
		int k = 0;
		cardsLeft = 52;
		for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				Card c = new Card(suit, rank);
				theCards[k] = c;
				k++;
			}
		}
	}

	public void shuffle() {
		int k = 0;
		Random r = new Random();
		cardsLeft = 52;
		for (int i = 51; i > 0; i--) {
			int nbr = r.nextInt(i);
			Card temp = theCards[nbr];
			theCards[nbr] = theCards[i];
			theCards[i] = temp;
		}
	}

	public boolean moreCards() {
		return cardsLeft > 0;
	}

	public Card getCard() {
		cardsLeft--;
		Card d = theCards[cardsLeft];
		return d;

	}
}
