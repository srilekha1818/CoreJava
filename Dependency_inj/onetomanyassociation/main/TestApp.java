package CoreJava.Dependency_inj.onetomanyassociation.main;

import CoreJava.Dependency_inj.onetomanyassociation.bean.Departments;
import CoreJava.Dependency_inj.onetomanyassociation.bean.Employee;

public class TestApp {
    public static void main(String[] args){
    Employee[] emps=new Employee[3];
emps[0]=new Employee("10","sachin","mi");
emps[1]=new Employee("20","srilekha","csk");
emps[2]=new Employee("30","ajay","rcb");

Departments dept=new Departments("IPL22", "BCC", emps);
dept.getDepartmentDetails();
    }   
}
