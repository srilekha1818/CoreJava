package CoreJava.Dependency_inj.onetooneassociation.bin;

public class Employees {
    private String eid;
    private String ename;
    private String eaddr;
    Account account;
    public Employees(String eid, String ename, String eaddr,Account account) {
        this.eid = eid;
        this.ename = ename;
        this.eaddr = eaddr;
        this.account=account;
    }
    public void getEmployeeDetails(){
        System.out.println("employee details are: ");
        System.out.println("employee id is: "+eid);
        System.out.println("employee name is: "+ename);
        System.out.println("employee adress is: "+eaddr);
        System.out.println("=========================");
        System.out.println("account details are: ");
        System.out.println("account number is: "+account.accNo);
        System.out.println("account name is: "+account.accName);
        System.out.println("account type is: "+account.accType);


    }
}
