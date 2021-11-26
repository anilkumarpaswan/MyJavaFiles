class Anonymous{
public static void main(String []args){
Anonymous.sum(new int[]{30,40,50,80,90});
 }
 static void sum(int[] no){
 int total =0;
 for(int i:no)
 {
 total=total+i;
 
      }
	  System.out.print("sum is:"+total);
 
    }
}