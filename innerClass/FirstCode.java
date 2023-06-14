package CoreJava.innerClass;
class outer{
    public void show(){
        System.out.println("show outer");
    }
    class inner{
        public void show1(){
            System.out.println("show inner class"); 
        }
    }
}

public class FirstCode {
    public static void main(String[] args){
        outer obj=new outer();
        obj.show();
        outer.inner obj1;
        //obj1=new outer.inner; //if class is static we can access using outer class name
        obj1=obj.new inner();//if class is non static we use object of outer class 
        obj1.show1();

    }
    
}
