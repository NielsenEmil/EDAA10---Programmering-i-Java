import java.awt.Color;
import java.util.Random;

public class Life {

	private boolean temp[][];
	private LifeBoard lifeBoard;

	public Life(LifeBoard board) {
		this.lifeBoard = board;
	}

	public void newGeneration() {
		genTempBoard();
		lifeBoard.increaseGeneration();

		for (int q = 0; q < lifeBoard.getRows(); q++) {
			for (int w = 0; w < lifeBoard.getCols(); w++) {
				int neighbours = this.getNeighboursTemp(q, w);

				if ((neighbours <= 1 || neighbours >= 4) && lifeBoard.get(q, w)) {
					this.flip(q, w);
				} else if (!lifeBoard.get(q, w) && neighbours == 3) {
					this.flip(q, w);
				}
			}
		}
	}

	public void flip(int row, int col) {
		if (lifeBoard.get(row, col) == true) {
			lifeBoard.put(row, col, false);
		} else {
			lifeBoard.put(row, col, true);
		}
	}

	private int getNeighboursTemp(int row, int col) {
		int sum = 0;
		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = col - 1; j <= col + 1; j++) {
				if (i <= temp.length - 1 && i >= 0 && j <= temp[i].length - 1 && j >= 0) {
					if (temp[i][j]) {
						sum++;
					}
				}
			}
		}
		if (temp[row][col]) {
			sum--;
		}
		return sum;
	}

	private void genTempBoard() {
		temp = new boolean[lifeBoard.getRows()][lifeBoard.getCols()];
		for (int i = 0; i < lifeBoard.getRows(); i++) {
			for (int j = 0; j < lifeBoard.getCols(); j++) {
				temp[i][j] = lifeBoard.get(i, j);
			}
		}
	}

	public static Color getColor() {
		Random rand = new Random();

		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();

		return new Color(r, g, b);
	}
}
