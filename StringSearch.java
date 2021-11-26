
public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String []arr= {"Anil","Sunil","Manoj","Ankush","Amil","Pria","anshu"};
         String item ="Mithhu";
         int temp=0;
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i].equals(item)) {
        		 
        		 
        		 System.out.println("item is Present "+i+" index position");
        		 temp=temp+1;
        		 
        		 
        	 }
        	 
         }
         if(temp==0) {
        	 System.out.println("Item is not present in the list");
        	 
         }
	}

}
