
public class OverloadingPoly {
	void show(int a) {
		System.out.println("1");
	}
	
	void show(String b,int a) {
		System.out.println("2");
		
	}

	public static void main(String[] args) {
		
		OverloadingPoly over =new OverloadingPoly();
		over.show(10);
		
	}

}
