  import java.util.Scanner;
  class FabonicDemo{

    public static void main(String []args){
	 int prev =0;
	 int current =1;
	 int next=prev+current;
	       
		   
		   while(next<=200){
		     System.out.print(next+ " ");
			 next =prev+current;
			 prev =current;
			 next =next;
			 
		   
		   }
	}
}