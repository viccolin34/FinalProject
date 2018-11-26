import java.util.Random;

public class PositionofShip {
	
	private int fromX;
	private int fromY;
	private static BattleshipBoard board;
	public PositionofShip(BattleshipBoard b) {
		board = b;
	}
 
    //private BattleshipBoard [][] ShipPlacement;
	 public static void createShip(int size)
     {
		 
		 Random rand = new Random();
		 int HV = rand.nextInt(2);
        if(HV == 1) // vert
        {
        
           int col = rand.nextInt(5);
           int row = rand.nextInt(5);
           
           for(int i = 0; i<size; i++)
           {
        	  if(board.getCol() < col+i)
        		  board.getBoard()[row][col+i] = "S";
        	  else
        		  board.getBoard()[row][col-i] = "S";
           }
        } else { // horiz
            int col = rand.nextInt(5);
            int row = rand.nextInt(5);
           for(int i = 0; i<size; i++)
           {
         	  if(board.getCol() < col+i)
        		  board.getBoard()[row][col+i] = "S";
        	  else
        		  board.getBoard()[row][col-i] = "S";
           }
        }
    }
	 
    public int getStartingPoint() {
        return fromX;
    }

    public int getEndingPoint() {
        return fromY;
    }
    
 }