package CoreJava.Dependency_inj.onetomanyassociation.bean;

//targeted object
public class Departments {

    private String did;
    private String dname;
    private Employee[] emps;

    // constructor injection
    public Departments(String did, String dname, Employee[] emps) {
        this.did = did;
        this.dname = dname;
        this.emps = emps;
    }

    public void getDepartmentDetails() {
        System.out.println("department details are: ");
        System.out.println("=============");
        System.out.println("department is is: " + did);
        System.out.println("department name is: " + dname);

        System.out.println("---------------------");
        for (Employee emp : emps) {
            System.out.println("employee details are: ");
            System.out.println("employee id is: " + emp.eid);
            System.out.println("employee name is: " + emp.ename);
            System.out.println("employee address is: " + emp.eaddr);
            System.out.println();

        }
    }

}
