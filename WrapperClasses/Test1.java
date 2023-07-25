package CoreJava.WrapperClasses;
public class Test1
{
public static void main(String[] args)
{
Integer x = 128;
Integer y = 128;
System.out.println(x == y);//false
Integer a = 127;
Integer b = 127;
System.out.println(a == b);//true
Boolean b1 = true;
Boolean b2 = true;
System.out.println(b1==b2);//true
Double d1 = 10.0;
Double d2 = 10.0;
System.out.println(d1==d2);//false
}
}