
public class DiceGame {

	public static void main(String[] args) {
		int player1=0, player2=0;
		Die d = new Die();
		System.out.println("Spelare 1, Spelare 2:");
		while (player1 <= 50 && player2 <= 50){
			player1 += d.rollDie();
			if (player1 <= 50){
				player2 += d.rollDie();
			}
			System.out.println(player1 + ", " + player2);
		}
		if (player1 > 50){
			System.out.println("Spelare 1 vann!");
		}
		else{
			System.out.println("Spelare 2 vann!");
		}
	}

}