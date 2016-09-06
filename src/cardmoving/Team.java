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
public class Team {
    private ArrayList<Integer> gridSize = new ArrayList<>();
    private int[] pos = {0,0};
    private boolean joker = false;
    private int distanceMoved;
    private int teamNum;
    public void update(ArrayList<Integer> card){
        joker = false;
        if(card.get(0)==5){
            joker = true;
        }else{
            if(card.get(1)<=10){
                distanceMoved = 1;
            }else{
                distanceMoved = 2;
            }
            switch(card.get(0)){
                case 1:
                    System.out.print("They __ed from " + pos[0] + ", " + pos[1]);
                    if(pos[1]+distanceMoved > gridSize.get(1)){
                        pos[1]-=distanceMoved;
                        System.out.println(" to " + pos[0] + ", " + pos[1] + " because they hit the wall!");
                    }else{
                        pos[1]+=distanceMoved;
                        System.out.println(" to " + pos[0] + ", " + pos[1]);
                    }
                    
                    break;
                case 2:
                    System.out.print("They __ed from " + pos[0] + ", " + pos[1]);
                    if(pos[1]-distanceMoved < gridSize.get(1)){
                        pos[1]+=distanceMoved;
                        System.out.println(" to " + pos[0] + ", " + pos[1] + " because they hit the wall!");
                    }else{
                        pos[1]-=distanceMoved;
                        System.out.println(" to " + pos[0] + ", " + pos[1]);
                    }
                    break;
                case 3:
                    System.out.print("They __ed from " + pos[0] + ", " + pos[1]);
                    if(pos[0]-distanceMoved < gridSize.get(0)){
                        pos[0]+=distanceMoved;
                        System.out.println(" to " + pos[0] + ", " + pos[1] + " because they hit the wall!");
                    }else{
                        pos[0]-=distanceMoved;
                        System.out.println(" to " + pos[0] + ", " + pos[1]);
                    }
                    break;
                case 4:
                    System.out.print("They __ed from " + pos[0] + ", " + pos[1]);
                    if(pos[0]+distanceMoved > gridSize.get(0)){
                        pos[0]-=distanceMoved;
                        System.out.println(" to " + pos[0] + ", " + pos[1] + " because they hit the wall!");
                    }else{
                        pos[0]+=distanceMoved;
                        System.out.println(" to " + pos[0] + ", " + pos[1]);
                    }
                    break;
                default:
                    break;
            }
        }
    }
    public int[] getPos(){
        return(pos);
    }
    public void setPos(int newX, int newY){
        pos[0] = newX;
        pos[1] = newY;
    }
    public boolean checkJoker(){
        return(joker);
    }
    public int getTeamNum(){
        return(teamNum);
    }
    public Team(ArrayList<Integer> gridDim, int newTeamNum){
        gridSize.addAll(gridDim);
        teamNum = newTeamNum;
    }
}
