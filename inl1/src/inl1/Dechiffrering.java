package inl1;

import se.lth.cs.p.inl1.*;
import se.lth.cs.p.inl1.nbr6.*;

public class Dechiffrering {

	public static void main(String[] args) {
		TextWindow w = new TextWindow("Dechiffrering");
		TextView q = new TextView("Chiffertext:", 5, 100);
		TextView v = new TextView("Min klartext:", 5, 100);
		TextView f = new TextView("Korrekt klartext:", 5, 100);
		w.addView(q);
		w.addView(v);
		w.addView(f);

		Key key = new Key();
		Decryptographer d = new Decryptographer(key);
		TestCase t = new TestCase();
		String[] clear = new String[5];
		String[] crypt = new String[5];
		for (int k = 0; k < 5; k++) {
			clear[k] = t.getClearText(k + 1);
		}
		for (int k = 0; k < 5; k++) {
			crypt[k] = t.getCryptoText(k + 1);
		}
		for (int i = 0; i < 5; i++) {
			w.waitForMouseClick();
			q.displayText(crypt[i]);
			v.displayText(d.decrypt(crypt[i]));
			f.displayText(clear[i]);
		}

	}

}
