
public class MultiTaskMultiThreadAnil1 extends Thread {
	public void run() {
		System.out.println("Thread 1");
	}

	public class MultiTaskMultiThreadAnil2 extends Thread{
		public void run() {
			System.out.println("Thread 2");
		}
	}
	
	public class MultiTaskMultiThreadAnil3 extends Thread{
		public void run() {
			System.out.println("Thread 3");
		}
	
	}
	
	public class MultiTaskMuliThreadAnil4 extends Thread{
		public void run() {
			System.out.println("Thread 4");
		}
	}
	
	public static void main(String[] args) {
		MultiTaskMultiThreadAnil1 mtm1 =new  MultiTaskMultiThreadAnil1();
		mtm1.start();
		
	    MultiTaskMultiThreadAnil2 mtm2 = new MultiTaskMultiThreadAnil2();
	    mtm2.start();
		
		MultiTaskMultiThreadAnil3 mtm3 = new MultiTaskMultiThreadAnil3();
		mtm3.start();
		
		MultiTaskMuliThreadAnil4  mtm4 = new MultiTaskMuliThreadAnil4();
		mtm4.start();
	}

} 
	

