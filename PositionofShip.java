import java.util.Random;

public class PositionofShip {
	private static BattleshipBoard board;
	public PositionofShip(BattleshipBoard b) {
		board = b;
	}
 
    //private BattleshipBoard [][] ShipPlacement;
	public static void createShip(int size){
	Random rand = new Random();//random generator
	int HV = rand.nextInt(2);//random interger either 1(vertical) or 0(horizontal)
        if(HV == 1) { //Vertical
        	int col = rand.nextInt(7);//generating random column within the board
        	int row = rand.nextInt(7);//generating random row within the board
         for(int i = 0; i<size; i++){
        	 
        	 if(board.getCol() < col+i)
        		  board.getBoard()[row][col+i] = "S";
        	 else
        		  board.getBoard()[row][col-i] = "S";
           }
        } else { // horizontal
        	
           int col = rand.nextInt(7);
           int row = rand.nextInt(7);
           
           for(int i = 0; i<size; i++)
           {
        	  if(board.getCol() < col+i)
        		  board.getBoard()[row+i][col] = "S";
        	  else
        		  board.getBoard()[row-i][col] = "S";
           }
        }
    }
    
 }