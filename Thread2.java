
public class Thread2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());//Thread-0
		System.out.println("Thread");
	}
	
	public static void main(String agrs[]) {
		Thread2 th2= new Thread2();
		th2.start();
		

		System.out.println(Thread.currentThread().getName());//main Methods
		
		
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(th2.isAlive());
	}
	

}
