import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		game.initializeBoard();
		do {
			System.out.println(game.printBoard());
			int player = input.nextInt();
		}while(true);
	}

}
