import java.util.Random;
public class letters {

	public static void main(String[] args) {
		char[]alfa = new char[29];
		for (int k = 0 ; k < 26 ; k++){
			alfa[k] = (char)('A'+k);
		}
		alfa[26] = 'Å';
		alfa[27] = 'Ä';
		alfa[28] = 'Ö';
		
		Random rand = new Random();
		
		for (int k=1 ; k<=1000 ; k++){
			int place1 = rand.nextInt(29);
			int place2 = rand.nextInt(29);
			char temp = alfa[place1];
			alfa[place1] = alfa[place2];
			alfa[place2] = temp;
		}
		for (int n=0 ; n<=28 ; n++){
			System.out.print(alfa[n]);
		}
	}

}
