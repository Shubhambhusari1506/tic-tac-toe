import java.util.*;
public class Tictactoe {


      static char [] board = createBoard();


	public  static  char [] createBoard() {


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


   static  void displayBoard(){

	   System.out.println( "    " +board[1]+ "   | "+ board[2]+ "  | " + board[3]+ "     ");
   	
		System.out.println(" ------------------------ ");
   	
		System.out.println( "    " +board[4]+ "   | "+ board[5]+ "  | " + board[6]+ "     ");
   	
		System.out.println(" ------------------------ ");
   	
		System.out.println( "    " +board[7]+ "   | "+ board[8]+ "  | " + board[9]+ "     ");
   }

   public static void main (String[] args) {


      Scanner userInput = new Scanner(System.in);

      char userletter = selectLetter(userInput);

      char computerletter = (userletter == 'X') ? 'O':'X';

      System.out.println("User letter:"  +userletter);

      System.out.println("computer Letter:  " +computerletter);
            
		Tictactoe tictactoe = new Tictactoe();
      
      tictactoe.createBoard();


		displayBoard();
   }
}






