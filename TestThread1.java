import java.lang.*;
public class TestThread1 extends Thread{
public void run(){

System.out.println("Thread first");

}
public static void main(String agrs[]){
System.out.println("Thread 2nds");
TestThread t = new TestThread();
t.setDaemon(true);
t.start();
}
}

