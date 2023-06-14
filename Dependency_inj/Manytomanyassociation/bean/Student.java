package CoreJava.Dependency_inj.Manytomanyassociation.bean;

public class Student {
    private String sid;
    private String sname;
    private String saddr;
    //has-a variable
    private Course[] course;
    //constructor injection
    public Student(String sid, String sname, String saddr, Course[] course) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
        this.course = course;
    }
    public void getStudentDetails(){
        System.out.println("sid is ::"+sid);
        System.out.println("sname is::"+sname);
        System.out.println("saddr is:: "+saddr);
        System.out.println("course details are:: ");
        for(Course c:course){
            System.out.println("cid is:: "+c.cid);
            System.out.println("cname is :: "+c.cname);
            System.out.println("cost is:: "+c.ccost);
        }
            System.out.println("-------------------");
        
    }
    
}
