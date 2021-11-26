
public class MultiTaskMultiC extends Thread {
	public void run() {
		System.out.println("Playing Video");
	}



public class MultiTaskMultic2 extends Thread{
	public void run() {
		System.out.println("Playing Game");
	}

}
public class MultiTaskMultic3 extends Thread{
	public void run() {
		System.out.println("Playaing Music");
	}
}

public class MultiTaskMultiC4 extends Thread {
	public void run() {
		System.out.println("playaing background");
	}
	
}

public class MultiTaskMultiC5 extends Thread {
	public void run() {
		System.out.println("playaing background");
	}
	
}

public class MultiTaskMultiC6 extends Thread {
	public void run() {
		System.out.println("playaing background");
	}
	
}


    public class Anil{
    }
    public static void main(String agrs[]) {	
    MultiTaskMultiC mult1 =new MultiTaskMultiC();
	mult1.start();
	
	MultiTaskMultiC mult2 =new MultiTaskMultiC();  
	mult2.start();
	
	MultiTaskMultiC mult3 =new MultiTaskMultiC();
	mult3.start();
	
	MultiTaskMultiC mult4 =new MultiTaskMultiC();
	mult4.start();
	
	MultiTaskMultiC mult5 =new MultiTaskMultiC();
	mult5.start();
	
	MultiTaskMultiC mult6 =new MultiTaskMultiC();
	mult6.start();

	       }
	
	 
	}


