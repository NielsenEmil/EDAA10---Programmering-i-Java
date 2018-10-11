public class LifeBoard {

	private int generation;
	private int rows;
	private int cols;
	private boolean[][] board;

	/**
	 * Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
	 * b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1.
	 */
	public LifeBoard(int rows, int cols) {
		generation = 1;
		this.rows = rows;
		this.cols = cols;
		board = new boolean[rows][cols];
	}

	/**
	 * Ger true om det finns en individ i rutan med index row, col, false annars. Om
	 * index row, col �r utanf�r spelplanen returneras false
	 */
	public boolean get(int row, int col) {
		if (row >= rows || row < 0 || col >= cols || col < 0) {
			return false;
		} else {
			return board[row][col];
		}
	}

	/** Lagrar v�rdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		board[row][col] = val;
	}

	/** Tar reda p� antalet rader */
	public int getRows() {
		return rows;
	}

	/** Tar reda p� antalet kolonner */
	public int getCols() {
		return cols;
	}

	/** Tar reda p� aktuellt generationsnummer */
	public int getGeneration() {
		return generation;
	}

	/** �kar generationsnumret med ett */
	public void increaseGeneration() {
		generation++;
	}
}