package case1;

public class Multthread extends Thread{
public void run() {
	System.out.println("case1");
	
	
}
public static void main(String agrs[]) {
	//System.out.println("Hello case1");//
	
	Multthread mul1 =new Multthread();
	mul1.start();
	Multthread mul2 =new Multthread();
	mul2.start();
	
}







}
