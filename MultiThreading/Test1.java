package CoreJava.MultiThreading;
class MyThread extends Thread{
@Override
public void run(){
try{
for (int i=1;i<=10;i++ ){
System.out.println("I am lazy thread");
Thread.sleep(2000);
}
}
catch (InterruptedException e){
System.out.println("I got interrupted");
}
}
}
public class Test1 {
public static void main(String... args)throws InterruptedException{
MyThread t=new MyThread();
t.start();
t.interrupt();//line-n1
System.out.println("End of Main...");
}
}