package CoreJava.Interface.Interface;


interface x{
    void m1();
    void m2();
    void m3();

}
abstract class AdapterImp implements x{

    @Override
    public void m1() {
        
    }

    @Override
    public void m2() {
         }

    @Override
    public void m3() {
         }


}
public class AdapterClass extends AdapterImp{
    public void m3(){
        System.out.println("i am m3");
    }
    public static void main(String[] args){
        AdapterClass adp=new AdapterClass();
        adp.m3();
    }
}