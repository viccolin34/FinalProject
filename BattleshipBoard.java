import java.util.Scanner;
   public class BattleshipBoard
   {
	   
	   private String[][] board;
	   private int row;
	   private int col;
	   
	   public BattleshipBoard(int row, int col) {
		   this.row = row;
		   this.col = col;
		   board = new String[row][col];
		   createBoard();
		   showBoard();
	   }
	   public int getCol() {
		   return col;
	   }
	   
	   public int getRow() {
		   return row;
	   }
	   
	   public String[][] getBoard(){
		   return board;
	   }
     
      public void createBoard()
      {
         for(int row = 0; row < board.length; row++)
         {
            for(int column = 0; column < board[0].length; column++)
            {
               board[row][column] = "-";
            }
         }
      }
      public void showBoard()
      {
         for(int row = 0; row < board.length; row++)
         {
            for(int column = 0; column < board[0].length; column++)
               {
       
                  {
                     System.out.print(" "+board[row][column]);
                  }
               }
               System.out.println("");
         }
         System.out.println("");
      }
     
      public void placeShip(Ship ship) {
    	    
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
      if(board[row-1][col-1].equals("S"))
          {
             hits ++;
             System.out.println("HIT");
             board[row-1][col-1] = "!";
          }
          else
          {
             System.out.println("MISS");
             board[row-1][col-1] = "O";
          }
          return hits;
       
      }
      
      public static void main(String[] arg) {
         BattleshipBoard bshipboard = new BattleshipBoard(8,8);
         PositionofShip p = new PositionofShip(bshipboard) ;
         p.createShip(3);
         bshipboard.showBoard();
         Player playerOne = new Player(20);
         
      
      }
 }