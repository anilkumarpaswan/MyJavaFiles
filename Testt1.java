
public class Testt1 extends Thread{
	public void run() {
		System.out.println("Task1 anil");
	}


	public class Testts2 extends Thread{
		public void run() {
			System.out.println("Task2 kumar");
		}
	
		public class Testt3 extends Thread{
			public void run() {
				System.out.println("Task2 kumar");
			}
		}
			public class Testt4 extends Thread{
				public void run() {
					System.out.println("Task2 kumar");
				}
			}
				public class Testt5 extends Thread{
					public void run() {
						System.out.println("Task2 kumar");
					}
				
			
		
	}
	public class Thread{
		
	public static void main(String agrs[]) 
	{
		Testt1 t1=new Testt1();
		t1.start();
		Testt1 t2= new Testt1();
		t2.start();
		Testt1 t3 =new Testt1();
		t3.start();
		Testt1 t4 =new Testt1();
		t4.start();
		Testt1 t5 =new Testt1();
		t5.start();
		
	}


		}
	}
}