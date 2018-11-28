
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CoreLoc
{
    public static final int SHUFFLE_MULTIPLIER = 2;
    public static final int TRAINCARDS_LIMIT = 110;
    public static final int COLORED_TRAINCARDS_LIMIT = 12;
    public static final int WILDCARD_TRAINCARDS_LIMIT = 14;
    public static final int DESTINATIONCARDS_LIMIT = 30;

    private Random trainCardsRandomShuffler;
    private Random destinationCardsRandomShuffler;

    private List<ColorEnum> trainCardsList;
    private List<DestEnum> destinationCardsList;

    private ColorEnum[] trainCardsArray;
    private DestEnum[] destinationCardsArray;

    
    public CoreLoc()
    {
        trainCardsList = new ArrayList<>();
        destinationCardsList = new ArrayList<>();

        trainCardsArray = new ColorEnum[TRAINCARDS_LIMIT];
        destinationCardsArray = new DestEnum[DESTINATIONCARDS_LIMIT];

        trainCardsRandomShuffler = new Random();
        destinationCardsRandomShuffler = new Random();

        createAndFillArraysToList();

        for (int i = 0; i < SHUFFLE_MULTIPLIER; ++i)
        {
            Collections.shuffle(trainCardsList, trainCardsRandomShuffler);
            Collections.shuffle(destinationCardsList, destinationCardsRandomShuffler);
        }
    }
    
    public Random getTrainCardsRandomShuffler() { return trainCardsRandomShuffler; }

    public Random getDestinationCardsRandomShuffler() { return destinationCardsRandomShuffler; }

    
    public ColorEnum getNextTrainCard() throws NullPointerException
    {
        if (trainCardsList.isEmpty()) throw new NullPointerException();

        return trainCardsList.remove(0);
    }

    public DestEnum getNextDestinationCard() throws NullPointerException
    {
        if (destinationCardsList.isEmpty()) throw new NullPointerException();

        return destinationCardsList.remove(0);
    }

    public List<ColorEnum> getTrainCardsList() { return trainCardsList; }

    public List<DestEnum> getDestinationCardsList() { return destinationCardsList; }

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

    public void addDestinationCardToBottom(DestEnum destinationCard) throws NullPointerException
    {
        if (this.destinationCardsList.size() >= DESTINATIONCARDS_LIMIT) throw new NullPointerException();

        destinationCardsList.add(destinationCard);
    }

    public void addDestinationCardToTop(DestEnum destinationCard) throws NullPointerException
    {
        if (this.destinationCardsList.size() >= DESTINATIONCARDS_LIMIT) throw new NullPointerException();

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

        destinationCardsArray[0] = new DestEnum(LocationEnum.DENVER, LocationEnum.EL_PASO, 4);
        destinationCardsArray[1] = new DestEnum(LocationEnum.KANSAS_CITY, LocationEnum.HOUSTON, 5);
        destinationCardsArray[2] = new DestEnum(LocationEnum.NEW_YORK, LocationEnum.ATLANTA, 6);
        destinationCardsArray[3] = new DestEnum(LocationEnum.CHICAGO, LocationEnum.NEW_ORLEANS, 7);
        destinationCardsArray[4] = new DestEnum(LocationEnum.CALGARY, LocationEnum.SALT_LAKE_CITY, 7);
        destinationCardsArray[5] = new DestEnum(LocationEnum.HELENA, LocationEnum.LOS_ANGELES, 8);
        destinationCardsArray[6] = new DestEnum(LocationEnum.DULUTH, LocationEnum.HOUSTON, 8);
        destinationCardsArray[7] = new DestEnum(LocationEnum.SAULT_ST_MARIE, LocationEnum.NASHVILLE, 8);
        destinationCardsArray[8] = new DestEnum(LocationEnum.MONTREAL, LocationEnum.ATLANTA, 9);
        destinationCardsArray[9] = new DestEnum(LocationEnum.SAULT_ST_MARIE, LocationEnum.OKLAHOMA_CITY, 9);
        destinationCardsArray[10] = new DestEnum(LocationEnum.SEATTLE, LocationEnum.LOS_ANGELES, 9);
        destinationCardsArray[11] = new DestEnum(LocationEnum.CHICAGO, LocationEnum.SANTA_FE, 9);
        destinationCardsArray[12] = new DestEnum(LocationEnum.DULUTH, LocationEnum.EL_PASO, 10);
        destinationCardsArray[13] = new DestEnum(LocationEnum.TORONTO, LocationEnum.MIAMI, 10);
        destinationCardsArray[14] = new DestEnum(LocationEnum.PORTLAND, LocationEnum.PHOENIX, 11);
        destinationCardsArray[15] = new DestEnum(LocationEnum.DALLAS, LocationEnum.NEW_YORK, 11);
        destinationCardsArray[16] = new DestEnum(LocationEnum.DENVER, LocationEnum.PITTSBURG, 11);
        destinationCardsArray[17] = new DestEnum(LocationEnum.WINNIPEG, LocationEnum.LITTLE_ROCK, 11);
        destinationCardsArray[18] = new DestEnum(LocationEnum.WINNIPEG, LocationEnum.HOUSTON, 12);
        destinationCardsArray[19] = new DestEnum(LocationEnum.BOSTON, LocationEnum.MIAMI, 12);
        destinationCardsArray[20] = new DestEnum(LocationEnum.VANCOUVER, LocationEnum.SANTA_FE, 13);
        destinationCardsArray[21] = new DestEnum(LocationEnum.CALGARY, LocationEnum.PHOENIX, 13);
        destinationCardsArray[22] = new DestEnum(LocationEnum.MONTREAL, LocationEnum.NEW_ORLEANS, 13);
        destinationCardsArray[23] = new DestEnum(LocationEnum.LOS_ANGELES, LocationEnum.CHICAGO, 16);
        destinationCardsArray[24] = new DestEnum(LocationEnum.SAN_FRANCISCO, LocationEnum.ATLANTA, 17);
        destinationCardsArray[25] = new DestEnum(LocationEnum.PORTLAND, LocationEnum.NASHVILLE, 17);
        destinationCardsArray[26] = new DestEnum(LocationEnum.VANCOUVER, LocationEnum.MONTREAL, 20);
        destinationCardsArray[27] = new DestEnum(LocationEnum.LOS_ANGELES, LocationEnum.MIAMI, 20);
        destinationCardsArray[28] = new DestEnum(LocationEnum.LOS_ANGELES, LocationEnum.NEW_YORK, 21);
        destinationCardsArray[29] = new DestEnum(LocationEnum.SEATTLE, LocationEnum.NEW_YORK, 22);

        Collections.addAll(trainCardsList, trainCardsArray);
        Collections.addAll(destinationCardsList, destinationCardsArray);
    }
}