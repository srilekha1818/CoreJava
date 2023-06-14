package CoreJava.Interface.Interface;
interface one{
    void disp();
}
interface two{
   // void disp();//one method implementation is enough
   //int disp(); //we cannot implement two interfaces simultaneously when return type of the methods are different
  void disp(int i);
}
class InterMethod implements one,two{

    @Override
    public void disp(int i) {
        System.out.println("disp with arg"); 
    }

    @Override
    public void disp() {
        System.out.println("disp with no args");
       
        
    }

}
public class InterMethodNaming{


public static void main(String[] args) {
    InterMethod im =new InterMethod();
    im.disp();
    im.disp(12);
            
}          
}
