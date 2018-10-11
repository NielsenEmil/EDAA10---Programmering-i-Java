import se.lth.cs.window.SimpleWindow;
import java.util.Random;

public class H4_5 {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Turtle");
		Turtle t = new Turtle(w, 250, 250);
		Turtle k = new Turtle(w, 350, 350);
		Random rand = new Random();
		t.penDown();
		k.penDown();
		t.forward(100);
		t.right(90);
		t.forward(100);
		t.right(90);
		t.forward(100);
		t.right(90);
		t.forward(100);
		t.left(90);
		t.forward(100);
	}

}
