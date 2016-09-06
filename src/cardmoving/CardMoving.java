/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardmoving;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class CardMoving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> grid = new ArrayList<>();
        grid.add(10);//x
        grid.add(10);//y
        Deck deck = new Deck();
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team(grid,1));
        teams.add(new Team(grid,2));
        teams.add(new Team(grid,3));
        teams.add(new Team(grid,4));
        ArrayList<Integer> cardDrawn = new ArrayList<>();
        while(true){
            for(Team team: teams){
                System.out.println("It is Team " + team.getTeamNum() + "'s turn");
                cardDrawn.clear();
                cardDrawn.addAll(deck.draw());
                System.out.println("Draw: " + cardDrawn);
                team.update(cardDrawn);
            }
            if(deck.cardsLeft()==false){
                break;
            }
        }
    }
    
}
