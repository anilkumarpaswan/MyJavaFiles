
public class SuperkWord {
	
	
	void show() {
		System.out.println("Anshu kumari");
	}
}
class Anil extends SuperkWord{
	void show() {
		super.show();
		System.out.println("Priya kumari");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		Anil a = new Anil();
		a.show();
	}

}
