import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;

public class H4_4 {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Square");
		Turtle t = new Turtle(w, 0, 0);
		t.penDown();

		while (true) {
			w.waitForMouseClick();
			int x = w.getMouseX();
			int y = w.getMouseY();
			t.jumpTo(x, y);
			for (int k = 1; k <= 4; k++) {
				t.right(90);
				t.forward(300);
			}

		}

	}

}
