package Polymorphism_and_abstraction;
//private String name; private members won' participate in inheritance
class Plane{


public void takingOff(){
    System.out.println("Plane is taking off ");
    }
   public  void fly(){
       System.out.println("writing fly method in Plane ");
       }
      public void landing(){
           System.out.println("writing landing method in Plane ");
           }
}

class CargoPlane extends Plane{
  

   public void fly(){
       System.out.println("cargo plane flies at low heights ");//overriding method
   }
   
}  
class PassengerPlane extends Plane{
    public void fly(){
        System.out.println("passenger plane flies at medium heights ");//overriding method
    }  
}
class Airport{
    public void permit(Plane plane){
        plane.takingOff();
        plane.landing();
        plane.fly();
    }
}

public class CodeFlexib {
    public static void main(String[] args){
        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        Airport a=new Airport();
        a.permit(cp);
        a.permit(pp);
    }
    
}
