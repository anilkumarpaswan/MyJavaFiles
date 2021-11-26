import java.util.Scanner;
class FactorialDemo{

    public static void main(String[] agrs){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the no");
	        int n = Integer.parseInt(sc.nextInt());
	        int no=6;
	        int a=1;
	        int fact =1;
	     for(int i=1; i<=no; i++){
	 fact=fact*i;
	        }
	            System.out.println("factorial of is " "no"+fact);
	    }
}