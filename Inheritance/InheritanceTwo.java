package CoreJava.Inheritance;

class Parent {
    int a;
    int b;

    Parent() {
       
        a = 10;
        b = 20;
        System.out.println("parent class constr1");

    }

    Parent(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("parent class constr");

    }
}

class Child1 extends Parent {
    int x;
    int y;

    Child1() {
        this(111, 222);
        x = 100;
        y = 200;

    }
    Child1(int x, int y) {
        super(x,y);
        this.x = x;
        this.y = y;
        

    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }

}

public class InheritanceTwo {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        ch1.disp();
        Child1 ch2 = new Child1(1000,2000);
        ch2.disp();

    }

}
