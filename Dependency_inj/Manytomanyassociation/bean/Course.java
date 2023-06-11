package Dependency_inj.Manytomanyassociation.bean;
//dependent object
public class Course {
    String cid; 
    String cname;
    int ccost;
    public Course(String cid, String cname, int ccost) {
        this.cid = cid;
        this.cname = cname;
        this.ccost = ccost;
    }

    
    
}
