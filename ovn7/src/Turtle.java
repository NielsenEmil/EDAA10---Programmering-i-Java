
import se.lth.cs.window.SimpleWindow;

public class Turtle {

	private double x;
	private double y;
	SimpleWindow w;
	private int angle;
	private boolean penDown;

	/**
	 * skapar en sk�ldpadda som ritar i ritf�nstret w. Fr�n b�rjan befinner sig
	 * sk�ldpaddan i punkten xHome,yHome med pennan lyft och huvudet pekande rakt
	 * upp�t i f�nstret, dvs i negativ y-riktning
	 */
	Turtle(SimpleWindow w, int xHome, int yHome) {
		x = xHome;
		y = yHome;
		angle = 90;
		penDown = false;
		this.w = w;
	}

	/** s�nker pennan */
	void penDown() {
		penDown = true;
	}

	/** lyfter pennan */
	void penUp() {
		penDown = false;
	}

	/** g�r rakt fram�t n pixlar i huvudets riktning */
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

	/** vrider huvudet beta grader �t v�nster */
	void left(int beta) {
		angle = angle + beta;
	}

	/** vrider hvudet beta grader �t h�ger */
	void right(int beta) {
		angle = angle - beta;
	}

	/**
	 * g�r till punkten newX,newY utan att rita. Pennans l�ge och huvudets riktning
	 * p�verkas inte
	 */
	void jumpTo(int newX, int newY) {
		w.moveTo(newX, newY);
	}

	/** �terst�ller huvudets riktning till den ursprungliga */
	void turnNorth() {
		angle = 90;
	}

	/** tar reda p� sk�ldpaddans aktuella x-koordinat */
	int getX() {
		return (int) Math.round(x);
	}

	/** tar reda p� sk�ldpaddans aktuella y-koordinat */
	int getY() {
		return w.getY();
	}
}
