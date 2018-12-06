import java.util.Scanner;

public class Player {
private static BattleshipBoard board;

public Player(BattleshipBoard b){
board = b;
}
public int createPlayer(int missles, int hits) {
while (missles > 0 && hits <3) {
System.out.println("Careful Captain, you only have "+missles+" missiles left!"); //counts how many missiles you have left
Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a row in which you would like to fire upon. 1 through 8.");
    int row = keyboard.nextInt();
    while(row > 8 || row < 1){
    System.out.println("You dingus! Pick a valid cordinate 1 through 8."); //error checking for rows
    row = keyboard.nextInt();
    }
    System.out.println("Please enter a column in which you would like to fire upon. 1 through 8.");
    int col = keyboard.nextInt();
    while(col > 8 || col < 1 ) {
    System.out.println("You jamoke! Pick a valid cordinate 1 through 8."); //error checking for columns
    col = keyboard.nextInt();
   
    }
   
    if(board.getBoard()[row-1][col-1].equals("S")) //checks if coordinated you guessed are equal to the location of the ship
        {
           
            System.out.println("HIT");
            board.getBoard()[row-1][col-1] = "!"; //ideally, for every hit, the hit would be labeled on the board with an "!", and updated for every turn
          hits++;
        }
   
        else
        {
            System.out.println("MISS");
            board.getBoard()[row-1][col-1] = "O";
        }
    missles--;
    board.showBoard();

}
         
return hits;
      }
      
     }
