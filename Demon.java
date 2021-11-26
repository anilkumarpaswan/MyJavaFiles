import junit.framework.Test;

public class Demon extends Thread{
	public void run() {
		System.out.print("child thread");
		
	}
	public static void main(String agrs[]) {
	
		System.out.println("main thread");
		Test t=new Test();
		t.start();
	}

}
