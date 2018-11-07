/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket_to_ride;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Player {
    int Score;
    int trainCount;
    String name;
    DeckFunction trainDeck;
    DeckFunction destinationDeck;
    ArrayList<TrainCards> trainHand;
    ArrayList<TrainCards> destinationHand;
    ColorEnum col;
    
    Player(DeckFunction tDeck ,DeckFunction dDeck){
        trainCount = 45;
        Score = 1;
        trainDeck = tDeck;
        destinationDeck = dDeck;
        trainHand = new ArrayList<>();
        destinationHand = new ArrayList<>();
        
        for(int x = 0; x<4; x++){
            try{
                trainHand.add(trainDeck.draw());
            }
            catch(EmptyDeckException ed){
                
            }
        }
    }
    
    Player(String nameIn, DeckFunction tDeck ,DeckFunction dDeck){
        trainCount = 45;
        Score = 1;
        name = nameIn;
        trainDeck = tDeck;
        destinationDeck = dDeck;
        trainHand = new ArrayList<>();
        destinationHand = new ArrayList<>();
        
        for(int x = 0; x<4; x++){
            try{
                trainHand.add(trainDeck.draw());
            }
            catch(EmptyDeckException ed){
                
            }
        }
        
    }
    
    public int getScore(){
        return Score;
    }
    
    public void addPoint(){
        Score++;
    }
    public void drawTrainCards(){
        try{
            trainHand.add(trainDeck.draw());
        }
        catch(EmptyDeckException ed){
            
        }
    }
    public void drawDestinationCards(){
        try{
            destinationHand.add(destinationDeck.draw());
        }
        catch(EmptyDeckException ed){
            
        }
    }
    public void claimRoute(){
        
    }
}
