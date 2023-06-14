package CoreJava.method_overloading;
class Sri{
 
int add(int a,int b,int c){
return a+b+c;
 }


float add(int a,float b)
{
    return a+b;
}

double add(int a,double b)
{
    return a+b;
}
 
}
public class MethodOl{
    public static void main (String[] args){
        Sri sri1=new Sri();
        int a=12;int b=4;
        double m=13.456;
        float n=12.34f;
        System.out.println(sri1.add(a,n));
        System.out.println(sri1.add(a,m));
        System.out.println(sri1.add(a,b));


    }
}