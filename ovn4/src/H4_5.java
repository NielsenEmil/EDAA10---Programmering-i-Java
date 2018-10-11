import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;
import java.util.Random;

public class H4_5 {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Turtle");
		Turtle t = new Turtle(w, 250, 250);
		Turtle k = new Turtle(w, 350, 350);
		Random rand = new Random();
		t.penDown();
		k.penDown();
		while (Math.sqrt(Math.pow(k.getX() - t.getX(), 2) + Math.pow(k.getY() - t.getY(), 2)) >= 50) {
			t.forward(1 + rand.nextInt(10));
			t.right(-179 + rand.nextInt(360));
			k.forward(1 + rand.nextInt(10));
			k.right(-179 + rand.nextInt(360));
			SimpleWindow.delay(10);
		}

	}

}
