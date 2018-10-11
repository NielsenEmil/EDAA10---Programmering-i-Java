package ovn3;

public class p3_2 {

	public static void main(String[] args) {

		int sum = 0, nextNbr = 1, total = 0;

		while (sum <= 100000) {
			sum = sum + nextNbr;
			nextNbr = nextNbr + 2;
			total++;
		}
		System.out.println(total);
	}

}
