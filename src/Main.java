import java.util.Scanner;
public class Main {
	private static Scanner input;
	private static TicTacToe game;
	private static String player;
	private static int row, column;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		game = new TicTacToe();
		game.initializeBoard();
		player = "X";
		do {
			System.out.println(game.printBoard());
			getCoordinates();
			if(row > 2 || row < 0 || column < 0 || column > 2) {
				System.out.println("\n !Enter value from <0;2>! \n");
				System.out.println(" Make your choice again \n");
				row = 0;
				column = 0;
				getCoordinates();
			} else {
				game.setPlay(row, column, player);
			}
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
	public static void getCoordinates() {
		System.out.println("\n You're: " + player);
		System.out.println("Enter coordinate for rows: ");
		row = input.nextInt();
		System.out.println("Enter coordinate for columns: ");
		column = input.nextInt();
	}
	

}
