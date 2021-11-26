
public class MethodaOverriding {
	
	void show() {
		System.out.println("Amit Kumar");
		
	}
}
      class Anil extends MethodaOverriding{
    	  void show() {
    		  
    		  System.out.println("Ankush kumar");
    		  
    	  }
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodaOverriding mo = new MethodaOverriding();
		mo.show();
		
		
		
		Anil a= new Anil();
		a.show();
		 
		  
	}

}
