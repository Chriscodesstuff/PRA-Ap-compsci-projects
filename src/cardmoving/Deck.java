/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardmoving;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author chris
 */
public class Deck {
    private Random rn = new Random();
    private ArrayList<ArrayList<Integer>> cards = new ArrayList<>();
    private ArrayList<Integer> cardDrawn = new ArrayList<>();
    
    public ArrayList draw (){
        System.out.println(cards.size() + "cards left!");
        int draw = rn.nextInt(cards.size());
        cardDrawn.clear();
        cardDrawn.addAll(cards.get(draw));
        cards.remove(draw);
        return(cardDrawn);
    }
    public boolean cardsLeft(){
        return(cards.size()>0);
    }
    /*public void goThru (){
        for(ArrayList card:cards){
            System.out.println(card.get(0) + " " + card.get(1));
        }
    }*/
    public Deck(){
        for(int suit = 1; suit <= 4;suit++){
            for(int value = 2; value <=14; value++){
                cards.add(new ArrayList());
                cards.get(cards.size()-1).add(suit);
                cards.get(cards.size()-1).add(value);
            }
        }
        cards.add(new ArrayList());
        cards.get(cards.size()-1).add(5);
        cards.get(cards.size()-1).add(1);
        cards.add(new ArrayList());
        cards.get(cards.size()-1).add(5);
        cards.get(cards.size()-1).add(1);
        
    }
}
