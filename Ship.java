
public class  Ship{
	//Variables
	private String name;
	private int size;
	private boolean isSunk;
	private int lives;
	private PositionofShip position;
	private int fromX;
	private int fromY;
    private int HorV;
    
	//constructor
	public Ship (int s, String n, int x, int y, int HV) {
		name = n;
		size = s;
		lives = s;
		isSunk = false;
		fromX = 3;
		fromY = 2;
		HorV = HV;
	}
	
	 public static final int PLAYER_LIVES = 13; //sum of all the ships

	  
	 public final int CRUISER_SIZE = 3;
	 public final int SUBMARINE_SIZE = 3;
	 public final int DESTROYER_SIZE = 2;

	 public final char SHIP_ICON = 'S';
	 public final char BOARD_ICON = '-';
	 public final char SHIP_IS_HIT_ICON = 'X';
	 public final char SHOT_MISSED_ICON = 'M';

	  // public final char[] BOARD_LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
	  //  public final int BOARD_SIZE = 10;
	
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getLives() {
		return lives;
	}
	
	public boolean isSunk() {
		return isSunk;
	}
	
	public void setSunken (boolean sunken) {
		isSunk = sunken;
	}
	
	public PositionofShip getPosition () {
		return position;
	}
	
	public void setPosition (PositionofShip placementOnBoard) {
		position = placementOnBoard;
	}
	
	public String toString(){
		return name + size + lives + position + isSunk;
	}
	
	
}
