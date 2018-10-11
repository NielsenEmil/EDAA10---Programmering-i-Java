package ovn3;

import java.util.Scanner;

public class p3_3 {

	public static void main(String[] args) {
		int nbr, total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mata in en följd av positiva tal: ");
		nbr = scan.nextInt();

		while (nbr != 0) {
			total++;
			nbr = scan.nextInt();
		}
		System.out.print("Antal tal i talföljden: " + total);

	}

}
