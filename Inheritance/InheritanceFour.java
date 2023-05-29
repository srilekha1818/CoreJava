package Inheritance;
class Interest{

}
class InterestPersonalLoan extends Interest{


}
class Loans11{
   public Interest disp(){
    Interest inte=new Interest();
       return inte;
    }

}
class PersonalLoans extends Loans11{
    public InterestPersonalLoan disp(){
InterestPersonalLoan ipl=new InterestPersonalLoan();
return ipl;
    }
}

public class InheritanceFour{
    public static void main(String[] args){

    }
}