
public class Intruup extends Thread {
	public void run() {
		
		
		//System.out.println("A :"+Thread.currentThread().isInterrupted());
		System.out.println(Thread.interrupted());

	try {
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
			  
			System.out.println("B :"+Thread.interrupted());
		}
		
	}
	
	catch(Exception e) {
		System.out.println("Thread Interrupted :"+e);
		
		
	}
	}
	public static void main(String[] args) {
		Intruup i= new Intruup();
		i.start();
		i.interrupt();
	
		
		
	}

}
