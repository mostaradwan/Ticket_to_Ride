//samk2020
public enum ColorEnum { 
    //needs more editing
    RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE, BLACK, WHITE, WILDCARD;  
    private static ColorEnum [] allValues = values();

    public static ColorEnum fromOrg(int x) { 
        return allValues[x]; 
    }
}
 
