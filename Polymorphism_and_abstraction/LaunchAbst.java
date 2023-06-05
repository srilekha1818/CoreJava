package Polymorphism_and_abstraction;

abstract class Loan1{
    abstract public void dispInt();
    public void welcomeNote(){
        System.out.println(" welcome to DBS bank");
    }
}
class HomeLoan1 extends Loan1{
    public void dispInt(){
        System.out.println("RI is 12%");
    }

}
class EducationLoan1 extends Loan1{

   
    public void dispInt() {
        System.out.println(" RI is 10%");
    }

}

public class LaunchAbst {
    public static void main(String[] args){
        //Loan1 l=new Loan1();//we cannot create object
        Loan1 loan=new HomeLoan1();
        //we can create ref of abstract class
        loan.dispInt();
        loan.welcomeNote();
        Loan1 loan1=new EducationLoan1();
        loan1.dispInt();
        loan1.welcomeNote();

    }
}
