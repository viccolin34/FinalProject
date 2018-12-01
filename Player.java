import java.util.Scanner;


public class Player {
	private static BattleshipBoard board;
	

	public Player(BattleshipBoard b){
		board = b;
		
	}
	
	 public int createPlayer(int missles, int hits) {
		 while (missles > 0) {
		 Scanner keyboard = new Scanner(System.in);
	   	  System.out.println("Please enter a row in which you would like to fire upon. 1 through 8.");
	   	  int row = keyboard.nextInt();
	   	  while(row > 8 || row < 1){
	   		  System.out.println("You dingus! Pick a valid cordinate 1 through 8.");
	   		  row = keyboard.nextInt();
	     }
	   	 System.out.println("Please enter a column in which you would like to fire upon. 1 through 8.");
	   	 int col = keyboard.nextInt();
	     while(col > 8 || col < 1 ) {
	   	  System.out.println("You jamoke! Pick a valid cordinate 1 through 8.");
	   	  col = keyboard.nextInt();
	     }
	     if(board.getBoard()[row-1][col-1].equals("S"))
	         {
	            
	            System.out.println("HIT");
	            board.getBoard()[row-1][col-1] = "!";
	           hits++;
	         }
	    
	         else
	         {
	            System.out.println("MISS");
	            board.getBoard()[row-1][col-1] = "O";
	         }
	     missles--;
		 }
		return hits;
		 
	 }
	 public void results(int hits, int missles) {
	 if(hits < 3) {
         System.out.println("You have been defeated because you did not sink all of the ships.");
     }
     if(missles < 1) {
         System.out.println("Captain!!! You have no more missles.");
     }
      else
      
         if(hits >= 3)
         {
            System.out.println("You have beaten the game battleship, Thanks for playing!");
         }
      System.out.println("Good game, well played!");
     
      
     }

}

	 

	     

