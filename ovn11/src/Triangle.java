import se.lth.cs.window.SimpleWindow;

public class Triangle extends Shape {
	private int sideLength;

	public Triangle(int x, int y, int sideLength) {
		super(x, y);
		this.sideLength = sideLength;

	}

	public void draw(SimpleWindow w) {
		int newx, newy;
		w.moveTo(x, y);
		newx = (int) (x + sideLength * Math.cos(Math.toRadians(-60)));
		newy = (int) (y + sideLength * Math.sin(Math.toRadians(-60)));
		w.lineTo(newx, newy);
		newx = (int) (newx + sideLength * Math.cos(Math.toRadians(60)));
		newy = (int) (newy + sideLength * Math.sin(Math.toRadians(60)));
		w.lineTo(newx, newy);
		newx = (int) (newx + sideLength * Math.cos(Math.toRadians(180)));
		newy = (int) (newy + sideLength * Math.sin(Math.toRadians(180)));
		w.lineTo(newx, newy);
	}

}
