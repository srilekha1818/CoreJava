package CoreJava.StaticKeyword;

public class StaticExecution {
    static int num;
    static int num1;
    static{
        System.out.println("static block gets executed automatically");
        num=10;
        num1=11;
    }
    static void disp(){
        System.out.println("static method gets executed when we call it");
        System.out.println(num1);
        System.out.println(num);
    }
    void add(){
        System.out.println("non-static method");
       
         }  
         {
        System.out.println("non-static block");

         }
         StaticExecution(){
            System.out.println("constructor gets executed after the non-static block execution");
         }
    public static void main(String[] args){
System.out.println("main method gets executed automatically");
StaticExecution st=new StaticExecution();
disp();
st.add();
    }
}
