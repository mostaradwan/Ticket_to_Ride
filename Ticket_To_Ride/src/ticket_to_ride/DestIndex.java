/* 
main purpose of this file is to instantiate a card for different locations 
to transfer from one location to the next. Note that location Enum has all the destinations while 
ColorEnum is solely for route color to its respective coordination
*/
public class DestIndex
{
    private LocationPoint origin;
    private LocationPoint destination;
    private int score;  
    private static int numberOfDestinationCards = 0;
    private static int scoreOfAllCards = 0;

    public DestIndex(LocationPoint origin, LocationPoint destination, int score)
    {
        this.origin = origin;
        this.destination = destination;
        this.score = score;

        ++numberOfDestinationCards;
        scoreOfAllCards += score;
    }
 // Right here i'm simply merging(concat) various data points of strings to easily describe route of two locations
    @Override
    public String toString()
    {
        return (this.origin.toString() + " " + this.destination.toString() + " " + Integer.toString(this.score));
    }

    public LocationPoint getOrigin() throws NullPointerException
    {
        if (this.origin == null) throw new NullPointerException();
        return origin;
    }

    public LocationPoint getDestination() throws NullPointerException
    {
        if (this.destination == null) throw new NullPointerException();
        return destination;
    }

    public int getScore() { 
        return score; 
    }
    public static int getNumberOfDestinationCards() { 
        return numberOfDestinationCards; 
    }
    public static int getScoreOfAllCards() { 
        return scoreOfAllCards; 
    }
    public void setOrigin(LocationPoint origin) { 
        this.origin = origin;
    }
    public void setDestination(LocationPoint destination) { 
        this.destination= destination; 
    }
    public void setScore(int score) { 
        this.score= score; 
    }
}
