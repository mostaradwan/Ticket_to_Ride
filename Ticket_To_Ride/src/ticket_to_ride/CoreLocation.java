//renamed from coreloc to core location
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CoreLocation
{
    public static final int SHUFFLE_MULTIPLIER = 2;
    public static final int TRAINCARDS_LIMIT = 110;
    public static final int COLORED_TRAINCARDS_LIMIT = 12;
    public static final int WILDCARD_TRAINCARDS_LIMIT = 14;
    public static final int DESTINATION_CARDS_LIMIT = 30;

    private Random trainCardsShuffler;
    private Random destinationCardsShuffler;

    private List<ColorEnum> trainCardsList;
    private List<LocationEnum> destinationCardsList;

    private ColorEnum[] trainCardsArray;
    private LocationEnum[] destinationCardsArray;

    
    public CoreLocation()
    {
        trainCardsList = new ArrayList<>();
        destinationCardsList = new ArrayList<>();

        trainCardsArray = new ColorEnum[TRAINCARDS_LIMIT];
        destinationCardsArray = new LocationEnum[DESTINATION_CARDS_LIMIT];

        trainCardsShuffler = new Random();
        destinationCardsShuffler = new Random();

        createAndFillArraysToList();

        for (int i = 0; i < SHUFFLE_MULTIPLIER; ++i)
        {
            Collections.shuffle(trainCardsList, trainCardsShuffler);
            Collections.shuffle(destinationCardsList, destinationCardsShuffler);
        }
    }
    
    public Random getTrainCardsShuffler() { return trainCardsShuffler; }
    public Random getDestinationCardsShuffler() { return destinationCardsShuffler; }
    public ColorEnum getNewTrainCard() throws NullPointerException
    {
        if (trainCardsList.isEmpty()) throw new NullPointerException();
        return trainCardsList.remove(0);
    }

    public LocationEnum getNewDestinationCard() throws NullPointerException
    {
        if (destinationCardsList.isEmpty()) throw new NullPointerException();
        return destinationCardsList.remove(0);
    }

    public List<ColorEnum> getTrainCardsList() { 
        return trainCardsList; 
    }
    public List<LocationEnum> getDestinationCardsList() { 
        return destinationCardsList; 
    }

    public void addTrainCardToBottom(ColorEnum trainCard) throws NullPointerException
    {
        if (this.trainCardsList.size() >= TRAINCARDS_LIMIT) throw new NullPointerException();
        trainCardsList.add(trainCard);
    }

    
    public void addTrainCardToTop(ColorEnum trainCard) throws NullPointerException
    {
        if (this.trainCardsList.size() >= TRAINCARDS_LIMIT) throw new NullPointerException();
        trainCardsList.add(0, trainCard);
    }

    public void addDestinationCardToBottom(LocationEnum destinationCard) throws NullPointerException
    {
        if (this.destinationCardsList.size() >= DESTINATION_CARDS_LIMIT) throw new NullPointerException();
        destinationCardsList.add(destinationCard);
    }

    public void addDestinationCardToTop(LocationEnum destinationCard) throws NullPointerException
    {
        if (this.destinationCardsList.size() >= DESTINATION_CARDS_LIMIT) throw new NullPointerException();
        destinationCardsList.add(0, destinationCard);
    }

    private void createAndFillArraysToList()
    {
        Arrays.fill(trainCardsArray, 0, 12, ColorEnum.PURPLE);
        Arrays.fill(trainCardsArray, 12, 24, ColorEnum.WHITE);
        Arrays.fill(trainCardsArray, 24, 36, ColorEnum.BLUE);
        Arrays.fill(trainCardsArray, 36, 48, ColorEnum.YELLOW);
        Arrays.fill(trainCardsArray, 48, 60, ColorEnum.ORANGE);
        Arrays.fill(trainCardsArray, 60, 72, ColorEnum.BLACK);
        Arrays.fill(trainCardsArray, 72, 88, ColorEnum.RED);
        Arrays.fill(trainCardsArray, 84, 96, ColorEnum.GREEN);
        Arrays.fill(trainCardsArray, 96, 110, ColorEnum.WILDCARD); 

        destinationCardsArray[0] = new LocationPoint(LocationEnum.DENVER, LocationEnum.EL_PASO, 4);
        destinationCardsArray[1] = new LocationPoint(LocationEnum.KANSAS_CITY, LocationEnum.HOUSTON, 5);
        destinationCardsArray[2] = new LocationPoint(LocationEnum.NEW_YORK, LocationEnum.ATLANTA, 6);
        destinationCardsArray[3] = new LocationPoint(LocationEnum.CHICAGO, LocationEnum.NEW_ORLEANS, 7);
        destinationCardsArray[4] = new LocationPoint(LocationEnum.CALGARY, LocationEnum.SALT_LAKE_CITY, 7);
        destinationCardsArray[5] = new LocationPoint(LocationEnum.HELENA, LocationEnum.LOS_ANGELES, 8);
        destinationCardsArray[6] = new LocationPoint(LocationEnum.DULUTH, LocationEnum.HOUSTON, 8);
        destinationCardsArray[7] = new LocationPoint(LocationEnum.SAULT_ST_MARIE, LocationEnum.NASHVILLE, 8);
        destinationCardsArray[8] = new LocationPoint(LocationEnum.MONTREAL, LocationEnum.ATLANTA, 9);
        destinationCardsArray[9] = new LocationPoint(LocationEnum.SAULT_ST_MARIE, LocationEnum.OKLAHOMA_CITY, 9);
        destinationCardsArray[10] = new LocationPoint(LocationEnum.SEATTLE, LocationEnum.LOS_ANGELES, 9);
        destinationCardsArray[11] = new LocationPoint(LocationEnum.CHICAGO, LocationEnum.SANTA_FE, 9);
        destinationCardsArray[12] = new LocationPoint(LocationEnum.DULUTH, LocationEnum.EL_PASO, 10);
        destinationCardsArray[13] = new LocationPoint(LocationEnum.TORONTO, LocationEnum.MIAMI, 10);
        destinationCardsArray[14] = new LocationPoint(LocationEnum.PORTLAND, LocationEnum.PHOENIX, 11);
        destinationCardsArray[15] = new LocationPoint(LocationEnum.DALLAS, LocationEnum.NEW_YORK, 11);
        destinationCardsArray[16] = new LocationPoint(LocationEnum.DENVER, LocationEnum.PITTSBURG, 11);
        destinationCardsArray[17] = new LocationPoint(LocationEnum.WINNIPEG, LocationEnum.LITTLE_ROCK, 11);
        destinationCardsArray[18] = new LocationPoint(LocationEnum.WINNIPEG, LocationEnum.HOUSTON, 12);
        destinationCardsArray[19] = new LocationPoint(LocationEnum.BOSTON, LocationEnum.MIAMI, 12);
        destinationCardsArray[20] = new LocationPoint(LocationEnum.VANCOUVER, LocationEnum.SANTA_FE, 13);
        destinationCardsArray[21] = new LocationPoint(LocationEnum.CALGARY, LocationEnum.PHOENIX, 13);
        destinationCardsArray[22] = new LocationPoint(LocationEnum.MONTREAL, LocationEnum.NEW_ORLEANS, 13);
        destinationCardsArray[23] = new LocationPoint(LocationEnum.LOS_ANGELES, LocationEnum.CHICAGO, 16);
        destinationCardsArray[24] = new LocationPoint(LocationEnum.SAN_FRANCISCO, LocationEnum.ATLANTA, 17);
        destinationCardsArray[25] = new LocationPoint(LocationEnum.PORTLAND, LocationEnum.NASHVILLE, 17);
        destinationCardsArray[26] = new LocationPoint(LocationEnum.VANCOUVER, LocationEnum.MONTREAL, 20);
        destinationCardsArray[27] = new LocationPoint(LocationEnum.LOS_ANGELES, LocationEnum.MIAMI, 20);
        destinationCardsArray[28] = new LocationPoint(LocationEnum.LOS_ANGELES, LocationEnum.NEW_YORK, 21);
        destinationCardsArray[29] = new LocationPoint(LocationEnum.SEATTLE, LocationEnum.NEW_YORK, 22);

        Collections.addAll(trainCardsList, trainCardsArray);
        Collections.addAll(destinationCardsList, destinationCardsArray);
    }
}
