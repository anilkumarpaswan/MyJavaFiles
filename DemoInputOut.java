import java.util.Scanner;
 class DemoInputOut{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the value");
		  
		int Number;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		Number = sc.nextInt();
	   
		  char chose;
		  do
		  {
		  
				  if(Number>max)
                {
				
				 Number = max;
				 
				}
				if(Number<min)
				{
				 Number = min;
				}
				     System.out.println("do you continue Y/N");
				     chose = sc.next().charAt(0);
				         
						 
						 
						 
		   }while(chose =='Y'||chose =='N');
						        System.out.println("Largest number: "+max);
						             System.out.println("Smallest number: "+min);
						     
						 
				  
        }               
                              
 
 }