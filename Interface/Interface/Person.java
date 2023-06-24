package CoreJava.Interface.Interface;
abstract class Person{
    String name;
    int age;
    int height;
    int weight;
    Person(String name,int age,int height,int weight){
    super();
    this.name=name;
    this.age=age;
    this.height=height;
    this.weight =weight;
    }
    }
    class Student extends Person{
    int rollno;
    int marks;
    public Student(String name, int age, int height, int weight, int marks) {
        super(name, age, height, weight);
        this.marks = marks;
    }
     
    }
    
