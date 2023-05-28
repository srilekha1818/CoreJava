package Encapsulation;
class Solution1{
  
    /* if data members are not private any one can access it by using the reference.*/
    private int age;
    private String city;
    private String name;
    public Solution1(int age, String city, String name){
        this.age=age;//constructor do not have any return type.
        this.city=city;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
   
    
    
}

public class Student {
    public static void main(String[] args){
        Solution1 sl=new Solution1(18,"uk","srilekha");//constructor gets invoked when the object gets created.
        System.out.println(sl.getAge());
        System.out.println(sl.getName());
        System.out.println(sl.getCity());

    }
}

