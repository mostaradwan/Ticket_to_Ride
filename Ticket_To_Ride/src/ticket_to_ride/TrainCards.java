//samk2020 
//this is for the cards UPDATED
public class TrainCards {
    
    private final String colors;
    private boolean isFlipped;
    private boolean isAlreadyTaken;
    
    TrainCards(String c){
        this.colors = c;
        isFlipped = false;
        isAlreadyTaken = false;
    }
    
    public void setIsFlipped(boolean f){
        this.isFlipped = f;
    }
    
    public void setIsAlreadyTaken(boolean ATC){
        this.isAlreadyTaken = ATC;
    }
    
    public String getColors(){
        return colors;
    }
    
    public boolean isIsFlipped(){
        return isFlipped;
    }
    
    public boolean isIsAlreadyTaken(){
        return isAlreadyTaken;
    }
    
    @Override
    public String toString(){
        return this.colors;
    }
}
