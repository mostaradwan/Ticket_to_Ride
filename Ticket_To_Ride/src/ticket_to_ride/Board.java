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
public class Board {
    DeckFunction trainDeck;
    DeckFunction destinationDeck;
    
    ArrayList<Player> players;
    
    
    ArrayList<TrainCards> river;
    //setsup the board and global variables
    Board(int numPlayers){
        players = new ArrayList<>();
        for(int x = 0; x < numPlayers; x++){
           Player pTemp = new Player(trainDeck,destinationDeck);
           players.add(pTemp);
        }
        drawRiver();
    }
    
    
    
    //draws the cards for the face up cards 
    //that players can choose from
    public void drawRiver(){
        if(river.size() == 0){
            
            for(int x = 0; x<5; x++){
                try{
                    river.add(trainDeck.draw());
                }
                catch(EmptyDeckException ed){
                
                }
            }
        }
        else
        {
            while(river.size() < 5){
                try{
                    river.add(trainDeck.draw());
                }
                catch(EmptyDeckException ed){
                    
                }
            }
        }
    }
    
}