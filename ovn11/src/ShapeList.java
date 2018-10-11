import java.util.ArrayList;
import se.lth.cs.window.SimpleWindow;

public class ShapeList {
	private ArrayList<Shape> S;
	private int counter;

	public ShapeList() {
		S = new ArrayList<Shape>();
		counter = 0;
	}

	public void insert(Shape s) {
		S.add(s);
		counter++;
	}

	public void draw(SimpleWindow w) {
		for (int i = 0; i < counter; i++) {
			Shape s = S.get(i);
			s.draw(w);
		}
	}

	public Shape findHit(int xc, int yc) {
		for (int i = 0; i < counter; i++) {
			Shape s = S.get(i);
			if (s.near(xc, yc)) {
				return s;
			}
		}
		return null;
	}

}
