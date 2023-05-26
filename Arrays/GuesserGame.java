package Arrays;
import java.util.*;

class Guesser{
    int rand;
    int guessNum;
    int min=1;
    int max=5;
    int guessNum(){
        int guessNum=(int)(Math.random()*(max-min+1)+min);
        System.out.println("Guesser No :");
        while(rand>=10 && rand<0) {
            System.out.println("Please Re Enter ");
            guessNum=(int)(Math.random()*(max-min+1)+min);
            
        }
      
        
        return guessNum;
    }

}
class Player{
    int guessNum;
    int guessNum() {
        Scanner sc = new Scanner(System.in);
            System.out.print("player,please! enter a guessing number: ");
            guessNum=sc.nextInt();
        
        return guessNum;
    
    }

}
class Judge{
    int guesserNum;
    int playerNum1;
    int playerNum2;
    void collectNumGuesser(){
        Guesser g=new Guesser();
        guesserNum=g.guessNum();
    }
    void collectNumPlayers(){
        Player p1=new Player();
        Player p2=new Player();
        playerNum1=p1.guessNum();
        playerNum2=p2.guessNum();
    }

    void compare() {
        if(guesserNum==playerNum1){
            if(guesserNum==playerNum2){

        System.out.println("both players wins"); 
        }
        else{
            System.out.println("player1 wins");  

        }
        }
        else if(guesserNum==playerNum2){
           System.out.println("player2 wins");  
        }
        
        else{
           System.out.println("game lost try again!"); 
        }
    }

}
public class GuesserGame{
    public static void main(String[] args){
        Judge j= new Judge();
        j.collectNumGuesser();
        j.collectNumPlayers();
        j.compare();

    }
}