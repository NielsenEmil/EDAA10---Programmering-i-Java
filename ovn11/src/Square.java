import se.lth.cs.window.SimpleWindow;

public class Square extends Shape {

	private int sideLength;

	public Square(int x, int y, int sideLength) {
		super(x, y);
		this.sideLength = sideLength;

	}

	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo(x + sideLength, y);
		w.lineTo(x + sideLength, y + sideLength);
		w.lineTo(x, y + sideLength);
		w.lineTo(x, y);
	}

}
