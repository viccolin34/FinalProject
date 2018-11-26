
public class Player {
    private static final int[] ShipSizes = {1, 2, 3};
    private static final int NumberofShips = 3;
    
    private Ship[] ships;
    private BattleshipBoard gameBoard;
    

	public Player() {
		ships = new Ship[NumberofShips];
				
		for (int i = 0; i < NumberofShips; i++)
        {
            Ship tempShip = new Ship(ShipSizes[i], null);
            ships[i] = tempShip;
        }
        
        gameBoard = new BattleshipBoard();
    
	}
	public int remainingShips() {
		int totalShips = 3;
		for (Ship x :ships) {
		}
        
        return totalShips;
        
	}
}
