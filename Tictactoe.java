public class Tictactoe {


      char [] board = createBoard();


   public  char [] createBoard() {
      char [] board = new char[10];

      for (int i = 0;i < 9; i++){

      board[i] = ' ';
      }
      return board;

   }


   public static char selectLetter(Scanner userInput){
   System.out.println ("Select your letter X or O:   ");
   return userInput.next().toUpperCase().charAt(0);
   }
   public static void main (String[] args) {
	   
	   
	   Scanner userInput = new Scanner(System.in);
	   char userletter = selectLetter(userInput);
	   char computerletter = (userletter == 'X') ? 'O':'X';
	   System.out.println("User letter:"  +userletter);
	   System.out.println("computer Letter:  " +computerletter);
	   		Tictactoe tictactoe = new Tictactoe();
	   		tictactoe.createBoard();
   }}

