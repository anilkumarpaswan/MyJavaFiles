
public class Test extends Thread {
	public void run() {
		System.out.println("Kumar Tast");
		
	}
	public static void main(String agrs[]) {
		Test t =new Test();
		t.start();
		//t.start();//
		
	}

}
