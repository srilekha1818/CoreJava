package CoreJava.Interface.Interface;
//variables
interface bluetooth{
    boolean wireless=true;
}
public class ThirdCode implements bluetooth {
    public static void main(String[] args){
        //wireless=false; cannot assign a value to final variable
        boolean wireless=false; //local variable
        System.out.println(bluetooth.wireless);
        System.out.println(wireless);//false
    }
    
}
