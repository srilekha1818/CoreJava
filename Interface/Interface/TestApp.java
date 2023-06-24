package CoreJava.Interface.Interface;
class Parent {
Parent() {
System.out.println(this.hashCode());
}
}
class Child extends Parent {
public Child() {
System.out.println(this.hashCode());
}
}
public class TestApp {
public static void main(String[] args) {
Child c = new Child();
System.out.println(c.hashCode());
}
}