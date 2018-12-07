// still needs editing
@SuppressWarnings("serial")
public class LocationPoint {
    private static int PossibleLocationPoints = 0; 
    //private static int unitinLocationPoints = 0; 
    private static int unitinLocationPoints;

    // idk how netbeans is doing this below
    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private LocationEnum destination; 
    private LocationEnum origin;
    private ColorEnum routeColor; 
    private final int unit;
    private Player player; 
    private boolean completed; 
    
    // these are the variable needed to index the 2 locations with route color and unit spaces 
    // note that origin is the starting location while destination intended to go to is labeled
    public LocationPoint(LocationEnum origin, LocationEnum destination, ColorEnum routeColor, int unit){
        this.origin = origin;
        this.destination = destination;
        this.unit = unit;
        this.routeColor = routeColor;
        this.player = null; 
        
        this.completed = false;
        ++PossibleLocationPoints;
        unitinLocationPoints += unit;
    }
    // i need help fixing this issue

    LocationPoint(LocationEnum locationEnum, LocationEnum locationEnum0, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    public void claimRoute(Player player) throws UnsupportedOperationException{ 
        if (this.player != null) throw new UnsupportedOperationException();
        this.player = player;
    } 
    
  // @Override
    public String toString(){
        String originString = this.origin.toString();
        String destinationString = this.destination.toString();
        String routeColorString = this.routeColor.toString(); 
        String unitString = Integer.toString(unit); 
        return (originString + " " + destinationString + " " + routeColorString + " " + unitString);
    }
    
    public LocationEnum getOrigin() { 
        return this.origin; 
    } 
    public LocationEnum getDestination() { 
        return this.destination; 
    } 
    
    @SuppressWarnings("BadInputRouting")
    public static int getUnitinLocationPoints() {  
        int unitOfAllLocationPoints = 0;
        return unitOfAllLocationPoints; 
    }
    
    @SuppressWarnings("BadInputRouting") 
    public static int getPossibleLocationPoints() { 
        return PossibleLocationPoints; 
    } 
    
    @SuppressWarnings("BadInputRouting") 
    public int getUnit() { return this.unit; }
    public boolean getCompleted() { 
        return this.completed; 
    }
    public Player getPlayer() { 
        return this.player; 
    }
    
    @SuppressWarnings("BadInputRouting") 
    public ColorEnum getRouteColor() { 
        return this.routeColor; 
    } 
    
    @SuppressWarnings("BadInputRouting") 
    public static void setUnitinLocationPoints(int unit){ // throws ArithmeticException{
        if (unit <= 0) throw new ArithmeticException();
        unitinLocationPoints = unit; //change back to unit not 0.
    } 
    
    @SuppressWarnings("BadInputRouting")
    public static void setPossibleLocationPoints(int number) throws ArithmeticException{
        if (number <= 0) throw new ArithmeticException();
        PossibleLocationPoints = number;
    }
    
    public void setOrigin(LocationEnum origin) { 
        this.origin = origin; 
    }
    public void setDestination(LocationEnum destination) { 
        this.destination = destination; 
    } 
    public void setUnit(int unit) throws IllegalArgumentException{
        if (unit <= 0) throw new IllegalArgumentException();
        unitinLocationPoints -= this.unit; 
        unitinLocationPoints += unit; 
    } 
    
    public void setRouteColor(ColorEnum routeColor) { this.routeColor = routeColor; } 
    public void setPlayer(Player player) { this.player = player; } 
    public void setVisited(boolean visited) { this.completed = completed; }
}
