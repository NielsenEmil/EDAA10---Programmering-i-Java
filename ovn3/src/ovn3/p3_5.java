package ovn3;

import java.util.Scanner;

public class p3_5 {

	public static void main(String[] args) {
		int nbr, prevNbr, total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv in tal: ");
		nbr = scan.nextInt();

		while (nbr != 0) {
			prevNbr = nbr;
			nbr = scan.nextInt();
			if (nbr == prevNbr) {
				total++;
			}

		}
		System.out.println("Antal gånger: " + total);

	}

}
