package battleshipmodel;

// Player class contains a default implementation for a player.
// This class could represent a simple human or artificial player.
public class Player {
    
    private final int FLEET_SIZE = 5;
    private final int HITS_TO_WIN = 17;
    private final int OCEAN_SIZE= 10;
    protected Coordinate[][] ocean;
    private String name;
    private int hitsOnOpponent;
    private int missesOnOpponent;
    protected Ship[] fleet;
   
    public Player(){
         ocean = new Coordinate [OCEAN_SIZE][OCEAN_SIZE];
         this.fleet = new Ship[FLEET_SIZE];
         fleet[0] = new Ship("AircraftCarrier", 5);
         fleet[1] = new Ship("Battleship" , 4);
         fleet[2] = new Ship("Cruiser" , 3);
         fleet[3] = new Ship("Submarine" , 3);
         fleet[4] = new Ship("Destroyer" , 2);
         
        this.name = name;
        this.hitsOnOpponent = 0;
        this.missesOnOpponent = 0;
         
         for( int row = 0; row< OCEAN_SIZE;row++){
			for(int column = 0; column<OCEAN_SIZE; column++){
				ocean[row][column]= new Coordinate();
                        }
         }
    }
    
   protected Coordinate[][] getOcean(){
        return ocean;
        
		
    }
    
        
        
   public void placeFleet(){
       
        
    }
    
   public void printOcean(boolean showShip){
        
       
       System.out.printf("    0   1   2   3   4   5   6   7   8   9  \n");
       for(int x = 0; x < OCEAN_SIZE; x++ ){
                  System.out.printf("  +---+---+---+---+---+---+---+---+---+---+\n");
                  System.out.printf("%d |", x);
                  for(int column = 0; column<OCEAN_SIZE; column++){
                                System.out.printf(" %s |", ocean[x][column].printCoordinate(showShip));
				
			}
                  System.out.println();
                  
        }
       System.out.printf("  +---+---+---+---+---+---+---+---+---+---+\n");
        
    }
           
} 
   

    



