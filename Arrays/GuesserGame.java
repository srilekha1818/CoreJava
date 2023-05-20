import java.util.Scanner;

class Guesser{
    int guessNum;
    int GuesserNum() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a guessing number: ");
        guessNum=sc.nextInt();
        return guessNum;
    }

}
class player{
    int guessNum;
    int GuesserNum() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a guessing number: ");
        guessNum=sc.nextInt();
        return guessNum;
    }

}
class judge{
    int guesserNum;
    int playerNum1;
    int playerNum2;
    void collectNumGuesser(){
        Guesser g=new Guesser();
        guesserNum=g.GuesserNum();
    }
    void collectNumPlayers(){
        player p1=new player();
        player p2=new player();
        playerNum1=p1.GuesserNum();
        playerNum2=p2.GuesserNum();
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
        judge j= new judge();
        j.collectNumGuesser();
        j.collectNumPlayers();
        j.compare();

    }
}