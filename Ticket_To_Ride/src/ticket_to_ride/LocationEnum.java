
public enum LocationEnum { 
    // list of locations needed for the use of player destination
    ATLANTA,BOSTON,CALGARY,CHARLESTON,CHICAGO,DALLAS,
    DENVER,DULUTH,EL_PASO,HELENA,HOUSTON,KANSAS_CITY,
    LAS_VEGAS,LITTLE_ROCK,LOS_ANGELES,MIAMI,MONTREAL,NASHVILLE,
    NEW_ORLEANS,NEW_YORK,OKLAHOMA_CITY,OMAHA,PHOENIX,PITTSBURG,
    PORTLAND,RALEIGH,SAINT_LOUIS,SALT_LAKE_CITY,SAN_FRANCISCO,SANTA_FE,
    SAULT_ST_MARIE,SEATTLE,TORONTO,VANCOUVER,WASHINGTON,WINNIPEG;

    private static LocationEnum[] allValues = values();
    public static LocationEnum fromOrdinal(int n) { return allValues[n]; }
}

