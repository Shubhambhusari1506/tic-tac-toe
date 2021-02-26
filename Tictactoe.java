public class Tictactoe {
		
	public static void main (String[] args){

		char [] board = createBoard();
}

	private static char [] createBoard() {
		char [] board = new char[10];

		for (int i = 0;i < 9; i++){

		board[i] = ' ';
		} 
		return board;

}
}
