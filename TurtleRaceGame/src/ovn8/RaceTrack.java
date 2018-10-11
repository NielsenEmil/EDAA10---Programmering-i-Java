package ovn8;

import se.lth.cs.window.SimpleWindow;

public class RaceTrack {

	private int yStart;
	private int yFinish;
	Turtle t;
	SimpleWindow w;

	RaceTrack(int yStart, int yFinish, Turtle t, SimpleWindow w) {
		this.yStart = yStart;
		this.yFinish = yFinish;
		this.t = t;
		this.w = w;
	}

	void draw() {
		t.penUp();
		t.right(90);
		t.forward(200);
		t.right(90);
		t.forward(yFinish);
		t.left(90);
		t.penDown();
		t.forward(200);
		t.penUp();
		t.right(90);
		t.forward(yStart - yFinish);
		t.penDown();
		t.right(90);
		t.forward(200);
		w.moveTo(247, 315);
		w.writeText("1");
		w.moveTo(297, 315);
		w.writeText("2");
		w.moveTo(347, 315);
		w.writeText("3");
	}

	void resetTrack() {
		w.clear();
		t.setX(0);
		t.setY(0);
		t.turnNorth();
		this.draw();
	}

	void writeWinner(RacingEvent event) {
		w.moveTo(500, 200);
		if (event.whoWon() == 1) {
			w.writeText("Player 1 won!");
		} else if (event.whoWon() == 2) {
			w.writeText("Player 2 won!");
		} else if (event.whoWon() == 3) {
			w.writeText("Player 3 won!");
		}
	}

}
