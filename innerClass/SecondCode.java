package innerClass;
abstract class Computer{
    public abstract void disp();

  
}
class Laptop extends Computer{

    
    public void disp() {
        System.out.println("it's good");
        // TODO Auto-generated method stub
        
    }
    

}


public class SecondCode {
    public static void main(String[] args){
        Computer obj =new Laptop();
        obj.disp();
    Computer cmp=new Computer() {
        public void disp(){
            System.out.println("it's too good to go now");//anonymous class
        }
        
    };
    cmp.disp();

}
}



