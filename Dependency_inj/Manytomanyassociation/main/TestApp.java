package Dependency_inj.Manytomanyassociation.main;

import Dependency_inj.Manytomanyassociation.bean.Course;
import Dependency_inj.Manytomanyassociation.bean.Student;

public class TestApp {
    public static void main(String[] args){
        Course [] course=new Course[3];
        course[0]=new Course("FSD","JAVA",16000);
        course[1]=new Course("DSA","JAVA",3000); 
        course[2]=new Course("BI","DATA",1000);

        Student s1=new Student("IND10", "SACHIN", "MI", course);
        Student s2=new Student("IND7", "Srilekha", "CSK", course);
        Student s3=new Student("IND8", "kohli", "RCB", course);

        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();






        
    }
    
}
