
public class ReversString {

	public static void main(String[] args) {
		
		String name  = "Anilkumar";
		int length =name.length();
		String rev="";
		for(int i=length-1;i>=0;i--) 
		{
			rev =rev+name.charAt(i);
			
			
		}
		System.out.println("Reve of "+name+ " is " +rev);
	}

}
 