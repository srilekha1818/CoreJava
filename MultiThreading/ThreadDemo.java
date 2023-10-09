package CoreJava.MultiThreading;

class MyThread extends Thread{
@Override
public void run(){
for(int i=0;i<10;i++)
System.out.println("child thread");//child thread

}
}

//defining a thread(writing a class and extending a Thread)
//job a thread(code written inside run())
public class ThreadDemo {
public static void main(String... args){
	MyThread t=new MyThread();//Thread instantiation
t.start();//starting a thread
;;;; // At this line 2 threads are there
for(int i=1;i<=5;i++)
System.out.println("Main Thread");//main thread

}
}
