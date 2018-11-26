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
      
      public static void main(String[] arg)
      {
         BattleshipBoard bshipboard = new BattleshipBoard(8,8);
         PositionofShip p = new PositionofShip(bshipboard) ;
         p.createShip(3);
         bshipboard.showBoard();
        
         
         //ask user to put x,y and direction (0 for horizontal, 1 for vertical) of ship1, size 3
         //ask user to put x,y of ship2, size 3
         //ask user to put x,y of ship3, size 2
	}
   }