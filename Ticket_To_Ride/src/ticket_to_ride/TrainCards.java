//samk2020 
//this is for the cards 
import javax.swing.*;
import java.awt.Image;
public class TrainCards { 
   
    private static final String IMAGE_FOLDER_DIR = " ";
    private static final String IMAGE_FORMAT = " ";
    private static final String BACK_IMAGE_DIR = (" ");
    
    private Image cardImage;
    private Image backImage; 
    
    private ColorEnum colour;
    private LevelEnum level; 
    private DestEnum destination;
    public TrainCards (){
        
    } 
    public TrainCards(ColorEnum colour, LevelEnum level, DestEnum destination){
    this.colour = colour;
    this.level = level;
    this.destination = destination;
    String location = generateImageLocation();

    try {
        cardImage = new Image(location) {};

    } catch (Exception ex) {
        System.out.println(String.format("unable load cards from: (%s)", location));        
        cardImage = null;
    }

    try {
        backImage = new Image(BACK_IMAGE_DIR) {};
    } catch (Exception ex){
        System.out.println(String.format("unable load cards from: (%s)", BACK_IMAGE_DIR));
        backImage = null;
    }
}

public ColorEnum getColor() {
    return colour;
}

public LevelEnum getLevel() {
    return level;
}

public DestEnum getDest (){
        return destination;
}

public Image getCard(){
    return cardImage;
}

private String generateCardLocation(){

    StringBuilder sb = new StringBuilder();

    sb.append(IMAGE_FOLDER_DIR);
    sb.append("/");
    sb.append(colour.toString());
    sb.append("_");
    sb.append(level.toString());
    sb.append(IMAGE_FORMAT); 
    sb.append(IMAGE_FOLDER_DIR);
    sb.append("/");
    
    return sb.toString().toLowerCase();

}

@Override
public String toString(){
    return (colour + " " + level + " " + destination);
}

public int compareTo(TrainCards traincards) {

    if (this.level.compareTo(traincards.level) > 0){
        return 1;
    } else if (this.level.compareTo(traincards.level) < 0){
        return -1;
    } else {

        if(this.colour.compareTo(traincards.colour) > 0){
            return 1;
        } else if (this.colour.compareTo(traincards.colour) < 0){
            return -1;
        } else {
            return 0;
        } 
        
                if(this.destination.compareTo(traincards.destination)> 0){
                return 1;
                } else if (this.destination.compareTo(traincards.destination)< 0){
                return -1;
        }
    
    }
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((level == null) ? 0 : level.hashCode());
    result = prime * result + ((colour == null) ? 0 : colour.hashCode());
    result = prime * result + ((destination == null)? 0: destination.hashCode()); 

}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    TrainCards other = (TrainCards) obj; 
    return level == other.level && colour == other.colour && destination == other.destination ;
    
    }
// I'm working on this because I need to it to print other side
public Image getBackImage() {
    return backImage;
    }

    private String generateImageLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
