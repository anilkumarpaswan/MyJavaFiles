
public class StringBufferDemo {
	public static void main(String agrs[]) {
	//0StringBuffer sb =new StringBuffer("Anil");//16+String length
		//0StringBuffer sb =new StringBuffer(1000);//catrctor of stringbuffer 1000
		
		
		
		
	StringBuffer sb  = new StringBuffer("Anil Kumar");
	//2System.out.println(sb.length());
	System.out.println(sb.append(" " +"Paswan"));
	
	//1sb.append("Anilkumar");
	//1System.out.println(sb.capacity());
	//1sb.append("Anilkumar paswan");
	//1System.out.println(sb.capacity());//16*2+2=34
	 //or old Capacity+1+2 34 or 34*2+2 =70
	
	
	

}
}
