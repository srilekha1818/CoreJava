package CoreJava.WrapperClasses;
class Demo
{
//JDK1.5V called Var-args(ellipse)
public void add(int... x){
System.out.println("var-arg approach");
}
}
public class Test2
{
public static void main(String[] args)
{
Demo d =new Demo();
d.add();
d.add(10);
d.add(10,20);
d.add(10,20,30);
}
}
