package ovn3;

import java.util.Scanner;

public class p3_4 {

	public static void main(String[] args) {
		int n;
		double nbr, sum = 0, sumSquare = 0, m, s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ange antalet reella tal som skall matas in: ");
		n = scan.nextInt();
		System.out.println("Mata in de reella talen: ");

		for (int i = 1; i <= n; i++) {
			nbr = scan.nextDouble();
			sum = sum + nbr;
			sumSquare = sumSquare + (nbr * nbr);
		}

		m = sum / n;
		s = Math.sqrt((sumSquare - n * m * m) / (n - 1));

		if (n <= 5) {
			System.out.println("Medelv�rdet �r: " + m);
			System.out.println("F�r f� antal f�r standardavvikelse");
		} else {
			System.out.println("Medelv�rdet �r: " + m);
			System.out.println("Standardavvikelsen �r: " + s);
		}

	}

}
