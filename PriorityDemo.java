
public class PriorityDemo extends Thread{
  public  void run() {
	   System.out.println("Child Thread");
	   System.out.println("main thread Priority:"+Thread.currentThread().getPriority());
   }
	public static void main(String[] args) {
		
		
		
		PriorityDemo pd =new PriorityDemo();
		 pd.start();
           System.out.println("Main thread priority :"+Thread.currentThread().getPriority());
           Thread.currentThread().setPriority(MIN_PRIORITY);
           
           System.out.println("Main Thread new Priority: "+Thread.currentThread().getPriority());
           pd.setPriority(MAX_PRIORITY);
	}

}
