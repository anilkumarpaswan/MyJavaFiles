
public class SingletaskFromSingleThreadDemo extends Thread{
	public void run() {
		System.out.println("Treat Task1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletaskFromSingleThreadDemo stft =new SingletaskFromSingleThreadDemo();
		stft.start();
	}

}

