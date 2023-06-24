package CoreJava.WrapperClasses;
public class Sample {
    public static void main(String[] args)
{
Boolean b1 =new Boolean("yes");//false
Boolean b2 =new Boolean("no");//false
System.out.println(b1);
System.out.println(b2);
System.out.println(b1.equals(b2));//false.equals(false)-> true
System.out.println(b1 == b2);//false
Integer i1 = new Integer(10);
Integer i2 = new Integer(10);
System.out.println(i1);//10
System.out.println(i2);//10
System.out.println(i1.equals(i2));//true
}
  
}
