//samk2020 
//this is for the cards UPDATED
public class TrainCards {
    
    private final String colours;
    private boolean isFlipped;
    private boolean isAlreadyTaken;
    
    TrainCards(String c){
        this.colours = c;
        isFlipped = false;
        isAlreadyTaken = false;
    }
    
    public void setIsFlipped(boolean f){
        this.isFlipped = f;
    }
    
    public void setIsAlreadyTaken(boolean ATC){
        this.isAlreadyTaken = ATC;
    }
    
    public String getColours(){
        return colours;
    }
    
    public boolean isIsFlipped(){
        return isFlipped;
    }
    
    public boolean isIsAlreadyTaken(){
        return isAlreadyTaken;
    }
    
    @Override
    public String toString(){
        return this.colours;
    }
}
