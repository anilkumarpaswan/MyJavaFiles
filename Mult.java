package Case2;

public class Mult extends Thread{
	public  void run() {
		System.out.println("case1");
		
	}
	public class Mult1 extends Thread{
		public void run() {
			System.out.print("case2");
			
		}
		public class Mult2 extends Thread{
			public void run() {
				System.out.println("Case3");
				
			}
		
			class Main{
				public void main(String agrs[]) {
					Mult mu =new Mult();
					mu.start();
					Mult mu2 =new Mult();
					mu2.start();
					Mult mu3 =new Mult();
					mu3.start();
				
					
				}
			
		
		}
	}

}
}
