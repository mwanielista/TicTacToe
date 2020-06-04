
public class TicTacToe {
	
	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLUMNS = 3;
	
	public TicTacToe(){
		board = new String[ROWS][COLUMNS];
	}
	
	/*
	 * initializing game board
	 */
	public void initializeBoard() {
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j++) {
				board[i][j] = "   ";
			}
		}
	}
	
	/*
	 * printing game board
	 * @return strBoard
	 */
	public String printBoard() {
		String strBoard = "";
		for(int i = 0; i < COLUMNS; i++) {
			for(int j = 0; j < ROWS; j++) {
				if(j != COLUMNS-1) {
					strBoard += board[i][j] + "|";
				} else {
					strBoard += board[i][j];
				}
			}
			if(i != COLUMNS -1) {
				strBoard += "\n---+---+---\n";
			}
			
		}
		return strBoard;
	}
}
