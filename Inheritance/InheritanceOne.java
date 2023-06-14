package CoreJava.Inheritance;
class Demo{
   //private String name; private members won' participate in inheritance
   String name="srilekha";
    void disp(){
    System.out.println("writing disp method in demo: "+name);
    }
    Demo(){
        System.out.println("Parent Class constructor");
    }
}
class Demo1 extends Demo{
   //super() method calls the parent constructor
/* void disp1(){
    name="sri";
   }*/
    }


public class InheritanceOne{
public static void main(String[] args){
    Demo1 d=new Demo1();
    d.disp();

}
}