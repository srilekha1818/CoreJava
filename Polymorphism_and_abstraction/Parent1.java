package Polymorphism_and_abstraction;
class Parents{
    public void cry(){
        System.out.println("parents crying");
    }
}

class child11 extends Parents{
    public void cry(){
        System.out.println("child1 crying");
    }
    public void eat(){
       
            System.out.println("child1 eats less");
        
    }


}
class child12 extends Parents{
    public void cry(){
        System.out.println("child2 crying");
    }
    public void eat(){
       
            System.out.println("child2 eats more");
        
    }


}


public class Parent1 {
    public static void main(String[] args){
        Parents p=new child11();
        p.cry();
       // p.eat(); directly you cannot call child methods
       ((child11)p).eat();//downcasting
       Parents p2=new child12();
       p2.cry();
       ((child12)p2).eat();

    }
}
