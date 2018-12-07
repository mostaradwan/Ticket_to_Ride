/* 
main purpose of this file is to instantiate a card for different locations 
to transfer from one location to the next. Note that location Enum has all the destinations while 
ColorEnum is solely for route color to its respective coordination
*/
public class DestIndex
{
    private LocationPoint source;
    private LocationPoint destination;
    private int score;  
    private static int numberOfDestinationCards = 0;
    private static int scoreOfAllCards = 0;

    public DestIndex(LocationPoint source, LocationPoint destination, int score)
    {
        this.source = source;
        this.destination = destination;
        this.score = score;

        ++numberOfDestinationCards;
        scoreOfAllCards += score;
    }
 // Right here i need to simply merge various data points of strings to easily route two locations
    @Override
    public String toString()
    {
        return (this.source.toString() + " " + this.destination.toString() + " " + Integer.toString(this.score));
    }

    public LocationPoint getSource() throws NullPointerException
    {
        if (this.source == null) throw new NullPointerException();
        return source;
    }

    public LocationPoint getDestination() throws NullPointerException
    {
        if (this.destination == null) throw new NullPointerException();
        return destination;
    }

    @SuppressWarnings("BadRouting")
    public int getScore() { 
        return score; 
    }
    public static int getNumberOfDestinationCards() { 
        return numberOfDestinationCards; 
    }
    public static int getScoreOfAllCards() { 
        return scoreOfAllCards; 
    }
    public void setSource(LocationPoint source) { 
        this.source = source;
    }
    public void setDestination(LocationPoint destination) { 
        this.destination= destination; 
    }
    public void setScore(int score) { 
        this.score= score; 
    }
}