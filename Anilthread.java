
public class Anilthread implements Runnable  {
	@Override
	public void run() {
		System.out.println("Anshu priya");
		
	}
	public static void main(String agrs[]) {
		Anilthread at =new Anilthread();
		Thread th =new Thread(at);
		th.run();
		
	}
}














