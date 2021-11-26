
public class Threadclass extends Thread {
	public void run() {
		System.out.println("thread task");
	}
	public static void main(String agrs[]){
		Test t=new Test();
		t.start();
	}

}
