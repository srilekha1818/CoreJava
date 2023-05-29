package Inheritance;
class Demo33{
    //private String name; private members won' participate in inheritance
    String name="srilekha";
 void disp(){
     System.out.println("writing disp method in demo33: "+name);//inherited method
     }
     void fly(){
        System.out.println("writing fly method in demo33 ");//overridden method
        }
        void landing(){
            System.out.println("writing landing method in demo33 ");
            }
 }

 class Demo13 extends Demo33{
   

    public void fly(){
        System.out.println("writing fly method in demo13 ");//overriding method
    }
    void boating(){
        System.out.println("writing boating method in demo13 ");//specialized method
    }
     }

public class InheritanceThree {
    
        
   public static void main(String[] args){
    Demo13 d13=new Demo13();
    d13.disp();
    d13.boating();
    d13.fly();
    

   } 
}
