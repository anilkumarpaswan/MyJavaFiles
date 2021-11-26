package Case2;

public class SingleTaskMultiThread extends Thread{
	public void run() {
		System.out.println("performing single task frome to Multi Thtread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTaskMultiThread stmth =new SingleTaskMultiThread();
	stmth.start();
	
	
	
	SingleTaskMultiThread stmth1 =new SingleTaskMultiThread();
	stmth1.start();
		}

}
