package CoreJava.Dependency_inj.Manytooneassociation.main;
import CoreJava.Dependency_inj.Manytooneassociation.bean.Branch;
import CoreJava.Dependency_inj.Manytooneassociation.bean.Student;
public class TestApp {
    public static void main(String[] args) {
        Branch branch = new Branch();
        branch.setBid("IND100");
        branch.setBname("bengaluru");
        Student s1 = new Student();
        s1.setSid("10");
        s1.setSname("srilekha");
        s1.setSaddr("guntur");
        s1.setBranch(branch);

        Student s2 = new Student();
        s2.setSid("101");
        s2.setSname("sri");
        s2.setSaddr("chpet");
        s2.setBranch(branch);

        Student s3 = new Student();
        s3.setSid("18");
        s3.setSname("ajay");
        s3.setSaddr("usa");
        s3.setBranch(branch);

        System.out.println("student details are: ");
        System.out.println("student id is: " + s1.getSid());
        System.out.println("student name is: " + s1.getSname());
        System.out.println("student address is: " + s1.getSaddr());
        System.out.println("student branch id is: " + s1.getBranch().getBid());
        System.out.println("student branch name is: " + s1.getBranch().getBname());

        System.out.println("==================");
        System.out.println("student id is: " + s2.getSid());
        System.out.println("student name is: " + s2.getSname());
        System.out.println("student address is: " + s2.getSaddr());
        System.out.println("student branch id is: " + s2.getBranch().getBid());
        System.out.println("student branch name is: " + s2.getBranch().getBname());

        System.out.println("==================");
        System.out.println("student id is: " + s3.getSid());
        System.out.println("student name is: " + s3.getSname());
        System.out.println("student address is: " + s3.getSaddr());
        System.out.println("student branch id is: " + s3.getBranch().getBid());
        System.out.println("student branch name is: " + s3.getBranch().getBname());

    }

}
