import java.util.Scanner;

public class Player {
	private int misslesLeft = 20;
	private static BattleshipBoard board;
	//constructor
	public Player (int x) {
		misslesLeft = x;
	}
	 public int fireMissles(String[][] battleshipBoard, int missles, int hits, int row, int col) {
		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("Please enter a row in which you would like to fire upon. 1 through 8.");
   	  	 row = keyboard.nextInt();
   	  while(row > 8 || row < 1){
   		  System.out.println("Please enter a row in which you would like to fire upon. 1 through 8.");
   		  row = keyboard.nextInt();
     }
   	  System.out.println("Please enter a column in which you would like to fire upon. 1 through 8.");
   	  col = keyboard.nextInt();
     while(col > 8 || col < 1 ) {
   	  System.out.println("Please enter a column in which you would like to fire upon. 1 through 8.");
   	  col = keyboard.nextInt();
     }
     if(battleshipBoard[row-1][col-1].equals("S"))
         {
            hits ++;
            System.out.println("HIT");
            battleshipBoard[row-1][col-1] = "!";
         }
         else
         {
            System.out.println("MISS");
            battleshipBoard[row-1][col-1] = "O";
         }
         return hits;
      
     }
}