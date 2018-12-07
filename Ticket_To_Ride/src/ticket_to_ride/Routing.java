import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Routing {
    private int points;
    private List<LocationPoint>[]nearestList;
    private int numberOfLocationPoints = 0;
    
    public Routing(int units){
        nearestList = new ArrayList[units];
        this.points = points;
        for(int n = 0; n< units; n++)
        {
            nearestList[n] = new ArrayList<>();
        }
    }
    
   // @Override
    
    public String toString(int m){ 
        
        int numberOfLocationPoints;
        String returnString = " ";
        String originString;
        String destinationString;
        String mileageString;
        String routeColorString; 
        
        for(int n=0; n < points; n++){
            List<LocationPoint> list = nearestList[n]; 
            for(int i = 0; i < list.size(); ++i){
            originString = nearestList[n].get(i).getOrigin().toString();
            destinationString = nearestList[n].get(i).getDestination().toString();
            mileageString = Integer.toString(nearestList[n].get(i).getUnit()); 
            routeColorString = nearestList[n].get(i).getRouteColor().toString();
            
            returnString.concat(originString + " towards " + destinationString + " " + routeColorString + "\n");
            }
        }
       // return returnString;
        
    /**
     *
     * @throws IOException
     */
    public void Board() throws IOException
    {
            if(this.numberOfLocationPoints > 0){
                throw new UnsupportedOperationException(); 
            }
            
            this.DeclarableLocationPoint(LocationEnum.VANCOUVER, LocationEnum.CALGARY, ColorEnum.WILDCARD, 3); 
            this.DeclarableLocationPoint(LocationEnum.VANCOUVER, LocationEnum.SEATTLE, ColorEnum.WILDCARD, 1);
            this.DeclarableLocationPoint(LocationEnum.VANCOUVER, LocationEnum.SEATTLE, ColorEnum.WILDCARD, 1);        
            this.DeclarableLocationPoint(LocationEnum.SEATTLE, LocationEnum.CALGARY, ColorEnum.WILDCARD, 4); 
            this.DeclarableLocationPoint(LocationEnum.SEATTLE, LocationEnum.PORTLAND, ColorEnum.WILDCARD, 1); 
            this.DeclarableLocationPoint(LocationEnum.SEATTLE, LocationEnum.HELENA, ColorEnum.YELLOW, 6); 
            this.DeclarableLocationPoint(LocationEnum.PORTLAND, LocationEnum.SAN_FRANCISCO, ColorEnum.GREEN, 5);
            this.DeclarableLocationPoint(LocationEnum.PORTLAND, LocationEnum.SAN_FRANCISCO, ColorEnum.PURPLE, 5);
            this.DeclarableLocationPoint(LocationEnum.PORTLAND, LocationEnum.SALT_LAKE_CITY, ColorEnum.BLUE, 6);
            this.DeclarableLocationPoint(LocationEnum.SAN_FRANCISCO, LocationEnum.LOS_ANGELES, ColorEnum.PURPLE, 3);
            this.DeclarableLocationPoint(LocationEnum.SAN_FRANCISCO, LocationEnum.SALT_LAKE_CITY, ColorEnum.WHITE, 5);
            this.DeclarableLocationPoint(LocationEnum.SAN_FRANCISCO, LocationEnum.LOS_ANGELES, ColorEnum.YELLOW, 3);
            this.DeclarableLocationPoint(LocationEnum.SAN_FRANCISCO, LocationEnum.SALT_LAKE_CITY, ColorEnum.ORANGE, 5);
            this.DeclarableLocationPoint(LocationEnum.HELENA, LocationEnum.SALT_LAKE_CITY, ColorEnum.PURPLE, 3);
            this.DeclarableLocationPoint(LocationEnum.LAS_VEGAS, LocationEnum.LOS_ANGELES, ColorEnum.WILDCARD, 2); 
            this.DeclarableLocationPoint(LocationEnum.SALT_LAKE_CITY, LocationEnum.LAS_VEGAS, ColorEnum.ORANGE, 3); 
            this.DeclarableLocationPoint(LocationEnum.LOS_ANGELES,LocationEnum.PHOENIX, ColorEnum.WILDCARD, 3); 
            this.DeclarableLocationPoint(LocationEnum.LOS_ANGELES, LocationEnum.EL_PASO, ColorEnum.BLACK, 6); 
            this.DeclarableLocationPoint(LocationEnum.EL_PASO, LocationEnum.PHOENIX, ColorEnum.WILDCARD, 3); 
            this.DeclarableLocationPoint(LocationEnum.EL_PASO, LocationEnum.HOUSTON, ColorEnum.GREEN, 6);
            this.DeclarableLocationPoint(LocationEnum.PHOENIX, LocationEnum.SANTA_FE, ColorEnum.WILDCARD, 3);
            this.DeclarableLocationPoint(LocationEnum.PHOENIX, LocationEnum.DENVER, ColorEnum.WHITE, 5); 
            this.DeclarableLocationPoint(LocationEnum.DENVER, LocationEnum.SALT_LAKE_CITY, ColorEnum.YELLOW, 3); 
            this.DeclarableLocationPoint(LocationEnum.DENVER, LocationEnum.SALT_LAKE_CITY, ColorEnum.RED, 3); 
            this.DeclarableLocationPoint(LocationEnum.DENVER, LocationEnum.KANSAS_CITY, ColorEnum.ORANGE, 4); 
            this.DeclarableLocationPoint(LocationEnum.DENVER, LocationEnum.KANSAS_CITY, ColorEnum.BLACK, 4);  
            this.DeclarableLocationPoint(LocationEnum.DENVER, LocationEnum.OKLAHOMA_CITY, ColorEnum.RED, 4); 
            this.DeclarableLocationPoint(LocationEnum.DENVER, LocationEnum.SANTA_FE, ColorEnum.WILDCARD, 2); 
            this.DeclarableLocationPoint(LocationEnum.DENVER, LocationEnum.HELENA, ColorEnum.GREEN, 4); 
            this.DeclarableLocationPoint(LocationEnum.DENVER, LocationEnum.OMAHA, ColorEnum.PURPLE, 4); 
            this.DeclarableLocationPoint(LocationEnum.SANTA_FE, LocationEnum.EL_PASO, ColorEnum.WILDCARD, 2);
            this.DeclarableLocationPoint(LocationEnum.OKLAHOMA_CITY, LocationEnum.SANTA_FE, ColorEnum.BLUE, 3); 
            this.DeclarableLocationPoint(LocationEnum.OKLAHOMA_CITY, LocationEnum.EL_PASO, ColorEnum.YELLOW, 5); 
            this.DeclarableLocationPoint(LocationEnum.OKLAHOMA_CITY, LocationEnum.DALLAS, ColorEnum.WILDCARD, 2);
            this.addUndirectedLocationPoint(LocationEnum.OKLAHOMA_CITY, LocationEnum.DALLAS, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.OKLAHOMA_CITY, LocationEnum.LITTLE_ROCK, ColorEnum.WILDCARD, 2);
            this.addUndirectedLocationPoint(LocationEnum.OKLAHOMA_CITY, LocationEnum.KANSAS_CITY, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.OKLAHOMA_CITY, LocationEnum.KANSAS_CITY, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.DALLAS, LocationEnum.EL_PASO, ColorEnum.RED, 4); 
            this.addUndirectedLocationPoint(LocationEnum.DALLAS, LocationEnum.HOUSTON, ColorEnum.WILDCARD, 1); 
            this.addUndirectedLocationPoint(LocationEnum.DALLAS, LocationEnum.HOUSTON, ColorEnum.WILDCARD, 1); 
            this.addUndirectedLocationPoint(LocationEnum.DALLAS, LocationEnum.LITTLE_ROCK, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.HOUSTON, LocationEnum.NEW_ORLEANS, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.NEW_ORLEANS, LocationEnum.LITTLE_ROCK, ColorEnum.GREEN, 3); 
            this.addUndirectedLocationPoint(LocationEnum.NEW_ORLEANS, LocationEnum.ATLANTA, ColorEnum.ORANGE, 4); 
            this.addUndirectedLocationPoint(LocationEnum.NEW_ORLEANS, LocationEnum.ATLANTA, ColorEnum.YELLOW, 4);
            this.addUndirectedLocationPoint(LocationEnum.NEW_ORLEANS, LocationEnum.MIAMI, ColorEnum.RED, 6); 
            this.addUndirectedLocationPoint(LocationEnum.NEW_ORLEANS, LocationEnum.MIAMI, ColorEnum.BLUE, 5); 
            this.addUndirectedLocationPoint(LocationEnum.ATLANTA, LocationEnum.MIAMI, ColorEnum.BLUE, 5);
            this.addUndirectedLocationPoint(LocationEnum.ATLANTA,LocationEnum.CHARLESTON, ColorEnum.WILDCARD, 2);
            this.addUndirectedLocationPoint(LocationEnum.ATLANTA,LocationEnum.RALEIGH, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.ATLANTA,LocationEnum.RALEIGH, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.ATLANTA,LocationEnum.NASHVILLE, ColorEnum.WILDCARD, 1); 
            this.addUndirectedLocationPoint(LocationEnum.LITTLE_ROCK, LocationEnum.NASHVILLE, ColorEnum.WHITE, 3); 
            this.addUndirectedLocationPoint(LocationEnum.LITTLE_ROCK, LocationEnum.SAINT_LOUIS, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.SAINT_LOUIS, LocationEnum.PITTSBURG, ColorEnum.GREEN, 5); 
            this.addUndirectedLocationPoint(LocationEnum.SAINT_LOUIS, LocationEnum.NASHVILLE, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.KANSAS_CITY, LocationEnum.SAINT_LOUIS, ColorEnum.PURPLE, 2); 
            this.addUndirectedLocationPoint(LocationEnum.KANSAS_CITY,LocationEnum.SAINT_LOUIS, ColorEnum.BLUE, 2); 
            this.addUndirectedLocationPoint(LocationEnum.KANSAS_CITY, LocationEnum.OMAHA, ColorEnum.WILDCARD, 1); 
            this.addUndirectedLocationPoint(LocationEnum.KANSAS_CITY, LocationEnum.OMAHA, ColorEnum.WILDCARD, 1); 
            this.addUndirectedLocationPoint(LocationEnum.OMAHA,LocationEnum.CHICAGO, ColorEnum.BLUE, 4); 
            this.addUndirectedLocationPoint(LocationEnum.OMAHA,LocationEnum.DULUTH, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.OMAHA,LocationEnum.DULUTH, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.OMAHA,LocationEnum.HELENA, ColorEnum.RED, 5); 
            this.addUndirectedLocationPoint(LocationEnum.DULUTH,LocationEnum.HELENA, ColorEnum.ORANGE, 6); 
            this.addUndirectedLocationPoint(LocationEnum.DULUTH,LocationEnum.WINNIPEG, ColorEnum.BLACK, 4); 
            this.addUndirectedLocationPoint(LocationEnum.DULUTH,LocationEnum.SAULT_ST_MARIE, ColorEnum.WILDCARD, 3); 
            this.addUndirectedLocationPoint(LocationEnum.DULUTH,LocationEnum.TORONTO, ColorEnum.PURPLE, 6); 
            this.addUndirectedLocationPoint(LocationEnum.DULUTH,LocationEnum.CHICAGO, ColorEnum.RED, 3); 
            this.addUndirectedLocationPoint(LocationEnum.CHICAGO,LocationEnum.TORONTO, ColorEnum.WHITE, 4); 
            this.addUndirectedLocationPoint(LocationEnum.CHICAGO,LocationEnum.PITTSBURG, ColorEnum.ORANGE, 3); 
            this.addUndirectedLocationPoint(LocationEnum.CHICAGO,LocationEnum.PITTSBURG, ColorEnum.BLACK, 3);
            this.addUndirectedLocationPoint(LocationEnum.CHICAGO,LocationEnum.SAINT_LOUIS, ColorEnum.GREEN, 2); 
            this.addUndirectedLocationPoint(LocationEnum.PITTSBURG, LocationEnum.NASHVILLE, ColorEnum.YELLOW, 4); 
            this.addUndirectedLocationPoint(LocationEnum.PITTSBURG, LocationEnum.RALEIGH, ColorEnum.WILDCARD, 2);  
            this.addUndirectedLocationPoint(LocationEnum.PITTSBURG, LocationEnum.WASHINGTON, ColorEnum.WILDCARD, 2);
            this.addUndirectedLocationPoint(LocationEnum.PITTSBURG, LocationEnum.NEW_YORK, ColorEnum.YELLOW, 2); 
            this.addUndirectedLocationPoint(LocationEnum.PITTSBURG, LocationEnum.NEW_YORK, ColorEnum.GREEN, 2); 
            this.addUndirectedLocationPoint(LocationEnum.PITTSBURG, LocationEnum.TORONTO, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.NASHVILLE,LocationEnum.RALEIGH, ColorEnum.BLACK, 3); 
            this.addUndirectedLocationPoint(LocationEnum.RALEIGH,LocationEnum.WASHINGTON, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.RALEIGH,LocationEnum.WASHINGTON, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.RALEIGH,LocationEnum.CHARLESTON, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.CHARLESTON,LocationEnum.MIAMI, ColorEnum.PURPLE, 4); 
            this.addUndirectedLocationPoint(LocationEnum.WASHINGTON,LocationEnum.NEW_YORK, ColorEnum.BLACK, 2); 
            this.addUndirectedLocationPoint(LocationEnum.WASHINGTON,LocationEnum.NEW_YORK, ColorEnum.ORANGE, 2); 
            this.addUndirectedLocationPoint(LocationEnum.NEW_YORK,LocationEnum.BOSTON, ColorEnum.RED, 2);
            this.addUndirectedLocationPoint(LocationEnum.NEW_YORK,LocationEnum.BOSTON, ColorEnum.YELLOW, 2); 
            this.addUndirectedLocationPoint(LocationEnum.NEW_YORK,LocationEnum.MONTREAL, ColorEnum.BLUE, 3);
            this.addUndirectedLocationPoint(LocationEnum.BOSTON,LocationEnum.MONTREAL, ColorEnum.WILDCARD, 2);
            this.addUndirectedLocationPoint(LocationEnum.BOSTON, LocationEnum.MONTREAL, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.MONTREAL, LocationEnum.TORONTO, ColorEnum.WILDCARD, 3); 
            this.addUndirectedLocationPoint(LocationEnum.MONTREAL, LocationEnum.SAULT_ST_MARIE, ColorEnum.BLACK, 5); 
            this.addUndirectedLocationPoint(LocationEnum.SAULT_ST_MARIE, LocationEnum.TORONTO, ColorEnum.WILDCARD, 2); 
            this.addUndirectedLocationPoint(LocationEnum.SAULT_ST_MARIE,LocationEnum.WINNIPEG, ColorEnum.WILDCARD, 6); 
            this.addUndirectedLocationPoint(LocationEnum.WINNIPEG, LocationEnum.HELENA, ColorEnum.BLUE, 4); 
            this.addUndirectedLocationPoint(LocationEnum.HELENA, LocationEnum.CALGARY, ColorEnum.WILDCARD, 4); 
            this.addUndirectedLocationPoint(LocationEnum.CALGARY, LocationEnum.WINNIPEG, ColorEnum.WHITE, 6); 
        } 
        
        public void printRoute(){
            String originString;
            String destinationString;
            String mileageString;
            String routeColorString; 
            int numberOfLocationPoints; 
            for (int n= 0; n < points; n++){
                List<LocationPoint> list = nearestList[n];
            } 
            for (int m = 0; m < LocationPoint.size(); m++){
                int n = 0;
                originString = nearestList[n].get(m).getOrigin().toString();
                destinationString = nearestList[n].get(m).getDestination().toString();
                mileageString = Integer.toString(nearestList[n].get(m).getUnit()); 
                routeColorString = nearestList[n].get(m).getRouteColor().toString(); 
                System.out.println(originString + " to " + destinationString + " distance " + mileageString + " " + routeColorString);
            }
        } 
        // System.out.print("Number of Locations: " + this.numberOfLocationPoints);

    private void DeclarableLocationPoint(LocationEnum locationEnum, LocationEnum locationEnum0, ColorEnum colorEnum, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }

   


