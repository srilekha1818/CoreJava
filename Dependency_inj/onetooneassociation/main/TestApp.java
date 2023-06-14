package CoreJava.Dependency_inj.onetooneassociation.main;

import CoreJava.Dependency_inj.onetooneassociation.bin.Account;
import CoreJava.Dependency_inj.onetooneassociation.bin.Employees;

public class TestApp {
    public static void main(String[] args){
        Account account=new Account("abc123", "srilekha","savings");
        //constructor injection
        Employees employee=new Employees("ind10", "srilekha", "mi account",account);
        employee.getEmployeeDetails();
    }
    
}
