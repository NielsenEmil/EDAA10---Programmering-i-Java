
public class Mandelbrot {

	public static void main(String[] args) {

		MandelbrotGUI gui = new MandelbrotGUI();
		Generator g = new Generator();
		boolean done = false;

		while (true) {

			switch (gui.getCommand()) {
			case MandelbrotGUI.RENDER:
				g.render(gui);
				done = true;
				break;
			case MandelbrotGUI.RESET:
				gui.resetPlane();
				gui.clearPlane();
				done = false;
				break;
			case MandelbrotGUI.QUIT:
				System.exit(0);
			case MandelbrotGUI.ZOOM:
				if (done) {
					g.render(gui);
				} else {
					gui.resetPlane();
				}
				break;
			}

		}
	}

}
