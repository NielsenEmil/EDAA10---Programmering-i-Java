import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int min, max, guess, counter = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Mata in minsta och st�rsta v�rdet: ");
		min = scan.nextInt();
		max = scan.nextInt();
		NumberGenerator nbrGen = new NumberGenerator(min, max);

		nbrGen.drawNbr();
		System.out.println("Gissa talet: ");
		guess = scan.nextInt();
		while (!nbrGen.isEqual(guess)) {
			if (nbrGen.isBiggerThan(guess) == false) {
				System.out.println("F�r stort!");
			} else if (nbrGen.isBiggerThan(guess) == true) {
				System.out.println("F�r litet!");
			}
			System.out.println("Gissa talet: ");
			guess = scan.nextInt();
			counter++;
		}
		System.out.println("R�tt!");
		System.out.println("Det tog " + counter + " gissningar.");
	}

}
