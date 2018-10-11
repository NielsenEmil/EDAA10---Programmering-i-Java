import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		double tempC, tempF, speedMS, speedMPH;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange temperatur och vindhastighet: ");
		tempC = scan.nextDouble();
		speedMS = scan.nextDouble();

		tempF = 1.8 * tempC + 32;
		speedMPH = speedMS * 3600 / 1609;

		double experiencedF;
		if (speedMPH <= 4) {
			experiencedF = tempF;
		} else if (speedMPH <= 45) {
			experiencedF = 91.4 - (10.45 + 6.69 * Math.sqrt(speedMPH) - 0.447 * speedMPH) * (91.4 - tempF) / 22;
		} else {
			experiencedF = 1.6 * tempF - 55;
		}

		double experiencedC = (experiencedF - 32) / 1.8;

		System.out.println("Upplevd temperatur är " + experiencedC + " grader C");

	}

}
