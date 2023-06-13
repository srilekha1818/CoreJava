package Interface;

interface demo1 {
    void m1();
}
interface demo12{
    void method12();

}
class demo2 {
   public void m2(){
    System.out.println("m2 is a method");
   }
}

interface demo3 extends demo1,demo12 {
   
    void method12();
    void m1();
    void m3();

}

class DemoI extends demo2 implements demo3 {

    @Override
    public void m1() {
        System.out.println("m1 is implemented ");
    }

    @Override
    public void m3() {
        System.out.println("m3 is implemented ");
    }

    @Override
    public void m2() {
        
        super.m2();
        System.out.println("m2 is overridden ");
    }

    @Override
    public void method12() {
        System.out.println("m12 is implemented ");
    }


}



   



public class SecondCode {
    public static void main(String[] args) {
        DemoI dm = new DemoI();
        dm.m1();
        dm.m2();
        dm.m3();
    }
}