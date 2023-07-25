package CoreJava.WrapperClasses;
public class Test3
{
public void methodOne(int ...i){System.out.println("Var arg method");}
public void methodOne(int i){System.out.println("Int arg method");}
public static void main(String[] args)
{

Test3 t= new Test3();

t.methodOne(10);//Int arg method
t.methodOne();//Var arg method
t.methodOne(10,20,30);//var arg method

}
}
