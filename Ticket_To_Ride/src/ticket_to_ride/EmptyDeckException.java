//samk2020 idk if we gonna need this after updates that i haven't finalized yet
public class EmptyDeckException extends Exception{
    //needs more editing
    public EmptyDeckException(Throwable cause){
        super(cause);
    } 

    public EmptyDeckException(String message, Throwable cause){
        super(message, cause);
    } 
    
    public EmptyDeckException(String message){
        super(message);
    } 
    
    public EmptyDeckException(){
    }
}
