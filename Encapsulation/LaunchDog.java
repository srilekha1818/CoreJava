package Encapsulation;
class Dog{
private String name;
private int cost;

public void setName(String name) {
    this.name = name;
}
public int getCost() {
    return cost;
}
public void setCost(int cost) {
    this.cost = cost;
}
public String getName() {
    return name;
}

}


public class LaunchDog {
    public static void main(String[] args){
Dog d=new Dog();
d.setName("Sheru");
System.out.println(d.getName());
d.setCost(2000);
System.out.println(d.getCost());

    }
}
