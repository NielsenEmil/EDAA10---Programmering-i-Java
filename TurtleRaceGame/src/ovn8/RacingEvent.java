package ovn8;

import se.lth.cs.window.SimpleWindow;
import java.util.Random;

public class RacingEvent {

	private int counter1, counter2, counter3, steps1, steps2, steps3;
	RaceTrack track;
	Turtle t1, t2, t3;

	RacingEvent(RaceTrack track, Turtle t1, Turtle t2, Turtle t3) {
		this.track = track;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		counter1 = 0;
		counter2 = 0;
		counter3 = 0;
		steps1 = 0;
		steps2 = 0;
		steps3 = 0;
	}

	void StartRace(SimpleWindow w) {
		Random rand = new Random();
		while (counter1 < 200 && counter2 < 200 && counter3 < 200) {
			steps1 = rand.nextInt(2);
			steps2 = rand.nextInt(2);
			steps3 = rand.nextInt(2);
			t1.penDown();
			t2.penDown();
			t3.penDown();
			t1.forward(steps1);
			t2.forward(steps2);
			t3.forward(steps3);
			counter1 = counter1 + steps1;
			counter2 = counter2 + steps2;
			counter3 = counter3 + steps3;
			SimpleWindow.delay(5);
		}
	}

	void resetRace(SimpleWindow w) {
		t1.setX(t1.getXStart());
		t1.setY(t1.getYStart());
		t2.setX(t2.getXStart());
		t2.setY(t2.getYStart());
		t3.setX(t3.getXStart());
		t3.setY(t3.getYStart());
		counter1 = 0;
		counter2 = 0;
		counter3 = 0;
		steps1 = 0;
		steps2 = 0;
		steps3 = 0;
	}

	int whoWon() {
		if (counter1 >= 200) {
			return 1;
		} else if (counter2 >= 200) {
			return 2;
		} else if (counter3 >= 200) {
			return 3;
		} else {
			return 0;
		}
	}

}
