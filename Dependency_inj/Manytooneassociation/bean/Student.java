package Dependency_inj.Manytooneassociation.bean;
//targeted object
public class Student {
    String sid;
    String sname;
    String saddr;
    Branch branch;

   

    public String getSid() {
        return sid;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

}
