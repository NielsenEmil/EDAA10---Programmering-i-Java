
import se.lth.cs.window.SimpleWindow;

public class Turtle {

	private double x;
	private double y;
	SimpleWindow w;
	private int angle;
	private boolean penDown;

	/**
	 * skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten xHome,yHome med pennan lyft och huvudet pekande rakt
	 * uppåt i fönstret, dvs i negativ y-riktning
	 */
	Turtle(SimpleWindow w, int xHome, int yHome) {
		x = xHome;
		y = yHome;
		angle = 90;
		penDown = false;
		this.w = w;
	}

	/** sänker pennan */
	void penDown() {
		penDown = true;
	}

	/** lyfter pennan */
	void penUp() {
		penDown = false;
	}

	/** går rakt framåt n pixlar i huvudets riktning */
	void forward(int n) {
		w.moveTo((int) Math.round(x), (int) Math.round(y));
		// double x1, y1;
		x = x + n * Math.cos(angle * (Math.PI / 180));
		y = y - n * Math.sin(angle * (Math.PI / 180));
		// x = (int)(x + x1);
		// y = (int)(y + y1);
		if (penDown == true) {
			w.lineTo((int) Math.round(x), (int) Math.round(y));
		}
		// else {
		// w.moveTo((int)Math.round(x1), (int)Math.round(y1));
		// }

	}

	/** vrider huvudet beta grader åt vänster */
	void left(int beta) {
		angle = angle + beta;
	}

	/** vrider hvudet beta grader åt höger */
	void right(int beta) {
		angle = angle - beta;
	}

	/**
	 * går till punkten newX,newY utan att rita. Pennans läge och huvudets riktning
	 * påverkas inte
	 */
	void jumpTo(int newX, int newY) {
		w.moveTo(newX, newY);
	}

	/** återställer huvudets riktning till den ursprungliga */
	void turnNorth() {
		angle = 90;
	}

	/** tar reda på sköldpaddans aktuella x-koordinat */
	int getX() {
		return (int) Math.round(x);
	}

	/** tar reda på sköldpaddans aktuella y-koordinat */
	int getY() {
		return w.getY();
	}
}
