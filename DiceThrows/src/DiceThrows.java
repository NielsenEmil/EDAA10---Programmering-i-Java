
public class DiceThrows {

	public static void main(String[] args) {
		int total = 0;
		for (int k=1; k<= 1000000;k++){
		
		Die d = new Die();
		d.roll();
		int prevResult = d.getResult();
		d.roll();
		int result = d.getResult();
		int nbrRolls = 2;
		while (result != prevResult){
			d.roll();
			nbrRolls++;
			prevResult = result;
			result = d.getResult();
		}
		//System.out.println("Antal kast blev " + nbrRolls);
		total += nbrRolls;
		}
		System.out.println("Medelantal kast blev " + total/1000000.0);
	}

}
