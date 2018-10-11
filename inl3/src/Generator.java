import java.awt.Color;

public class Generator {
	static final int ITERATIONS = 200;
	private Color[] hues;

	public Generator() {
		hues = new Color[ITERATIONS];

		for (int n = 0; n < ITERATIONS; n++) {
			hues[n] = Color.getHSBColor((n * (200f / ITERATIONS)) / 200, 1, 1);
		}
	}

	public void render(MandelbrotGUI gui) {
		gui.disableInput();
		int res = 1;

		switch (gui.getResolution()) {
		case MandelbrotGUI.RESOLUTION_HIGH:
			res = 3;
			break;
		case MandelbrotGUI.RESOLUTION_MEDIUM:
			res = 5;
			break;
		case MandelbrotGUI.RESOLUTION_LOW:
			res = 7;
			break;
		case MandelbrotGUI.RESOLUTION_VERY_LOW:
			res = 9;
			break;
		}

		Complex[][] complex = mesh(gui.getMinimumReal(), gui.getMaximumReal(), gui.getMinimumImag(),
				gui.getMaximumImag(), gui.getWidth(), gui.getHeight());
		Color[][] pictureBW = new Color[gui.getHeight() / res + 1][gui.getWidth() / res + 1];

		int[][] pass = new int[gui.getHeight() / res + 1][gui.getWidth() / res + 1];
		int[] histogram = new int[ITERATIONS];

		for (int i = 0; i < gui.getHeight() / res; i++) {
			for (int j = 0; j < gui.getWidth() / res; j++) {

				Complex c = complex[res / 2 + i * res][res / 2 + j * res];
				Complex z = new Complex(0, 0);
				int n = 0;

				while (n < ITERATIONS - 1 && z.getAbs2() <= 4) {
					n++;
					z.mul(z);
					z.add(c);
				}

				switch (gui.getMode()) {
				case MandelbrotGUI.MODE_COLOR:
					histogram[n]++;
					pass[i][j] = n;
					break;
				case MandelbrotGUI.MODE_BW:
					if (z.getAbs2() <= 4) {
						pictureBW[i][j] = Color.BLACK;
					} else {
						pictureBW[i][j] = Color.WHITE;
					}
				}

			}
		}

		int total = 0;
		for (int n = 0; n < ITERATIONS; n++) {
			total += histogram[n];
		}
		Color[][] pictureColor = new Color[gui.getHeight() / res + 1][gui.getWidth() / res + 1];
		for (int i = 0; i < gui.getHeight() / res; i++) {
			for (int j = 0; j < gui.getWidth() / res; j++) {
				float hue = 0f;

				for (int n = 0; n < pass[i][j]; n++) {
					hue += (float) histogram[n] / total;
				}

				pictureColor[i][j] = hues[(int) (hue * ITERATIONS)];
			}
		}
		switch (gui.getMode()) {
		case MandelbrotGUI.MODE_COLOR:
			gui.putData(pictureColor, res, res);
			break;
		case MandelbrotGUI.MODE_BW:
			gui.putData(pictureBW, res, res);
			break;
		}

		gui.enableInput();
	}

	private Complex[][] mesh(double minRe, double maxRe, double minIm, double maxIm, int width, int height) {
		Complex[][] complex = new Complex[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				complex[i][j] = new Complex(minRe + (-minRe + maxRe) / (width - 1) * j,
						maxIm - (-minIm + maxIm) / (height - 1) * i);
			}
		}
		return complex;
	}

}
