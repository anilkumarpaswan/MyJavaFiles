
public class SleepExcep extends Thread{
	
	
	public void run() {
		for(int i =1;i<20;i++) {
			
			System.out.println(i);
		}
		
		
	}


public static void main() {
	SleepExcep se =new SleepExcep();
	se.start();
	
}
}
