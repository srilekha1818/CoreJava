package CoreJava.Interface.Interface;
interface ISample{
    void disp();
    void show();
    
}
abstract class SampleImpl implements ISample{
    public void disp(){
        System.out.println("disp is implementing in sampleimpl");
    }
}
class Sample extends SampleImpl{
    public void show(){
        System.out.println("show is extending in sample");
    }
}


public class FirstCode {
public  static void main(String[] args) {
ISample smp=new Sample();
smp.disp();
smp.show();

    
}
    
}
