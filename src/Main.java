import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		game.initializeBoard();
		String player = "X";
		do {
			System.out.println(game.printBoard());
			System.out.println("Enter coordinate for rows: ");
			int row = input.nextInt();
			System.out.println("Enter coordinate for columns: ");
			int column = input.nextInt();
			
			game.setPlay(row, column, player);
			if(game.isGameOver()) {
				System.out.println(game.printBoard() + "\n" + player + " wins");
				break;
			}
			if(player == "X")
				player = "0";
			else
				player = "X";
			
		}while(true);
	}

}
