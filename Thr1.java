
public class Thr1 extends Thread {
	public void run() {
		System.out.println("Anil1");
	}
}
 class Thre2 extends Thread{
	public void run() {
		System.out.println("Kumar 2");
		
	}
}
 class Thre3 extends Thread{
	public void run() {
		System.out.println("paswan 3");
	}

}
 class Thre4 extends Thread{
	 public void run() {
		 System.out.println("Amit :4");
	 }
 }
 class Thre5 extends Thread{
	 public void run() {
	 System.out.println("Ankush : 5");
 }
 }
   class Main{
	public static void main(String[] args) {
		Thr1 r1 =new Thr1();
		r1.start();
		
        Thre2 r2 =new Thre2();
		r2.start();
		
		Thre3 r3 = new Thre3();
		r3.start();
		
		Thre4 r4 = new Thre4();
		r4.start();
		
		Thre5  r5 = new Thre5();
		r5.start();
		
	}

}
    
