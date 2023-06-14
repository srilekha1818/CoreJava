package CoreJava.StaticKeyword;

import java.util.Scanner;

class Student{
    private float pa;
    private float si;
    private float td;
    private static float ri;
    static{
        ri=2.5f;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("kindly,enter the pa amount: ");
        pa=sc.nextFloat();
        System.out.println("kindly,enter the time duration: ");
        td=sc.nextFloat();

    }
    void calci(){
        si=(pa*ri*td)/100;
    }
    void disp(){
        System.out.println("the calculated si is: " +si);
    }
}
public class StaticWhen {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();


       s1.input(); 
        s1.calci();
        s1.disp();

        s2.input(); 
        s2.calci();
        s2.disp();

    }
    
}
