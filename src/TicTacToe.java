
public class TicTacToe {
	
	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLUMNS = 3;
	private String regex = "\\s{3}";	//3 empty spaces
	
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
	 * setting player move
	 * @param x - for rows
	 * @param y - for columns
	 * @param player
	 */
	public void setPlay(int x, int y, String player ) {
		if(this.board[x][y].matches(regex)) {
			board[x][y] = " " + player + " ";
		}
	}
	
	
	/*
	 * Looking for end of game
	 * @return true or false - depends on game result
	 */
	public boolean isGameOver() {
		//checking rows
		for(int i = 0; i < ROWS; i++) {
			if(!board[i][0].matches(regex) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
				return true;
			}
		}
		
		//checking columns
		for(int j = 0; j < COLUMNS; j++) {
			if(!board[0][j].matches(regex) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
				return true;
			}
		}
		
		//checking diagonals
		if(!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
			return true;
		if(!board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
			return true;
		
		//nobody won
		return false;
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
