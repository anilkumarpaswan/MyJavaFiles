
public class MyThtread1 extends Thread{
	public void run() {
		System.out.println("Multilpe task Multiple thread");
	}
}
class MyThread2 extends Thread{
	public void run() {
		System.out.println("Multiple task multipal Threada");
	}
	
}
class MyThread3 extends Thread{
	public void run() {
		System.out.println("Multiple task multiple Threads");
		
	}
	
}


public class Mythread{
	public static void main(String agrs[]) {
		
		
		MyThread1 my =new MyThtread1();
	     my.start();
	     
	     MyThread2 mth2= new MyThread2();
	     mth2.start();
	     
	     MyThread3 mth3 =new MyThread3();
	     mth3.start();
		}

		
		
		
	}
