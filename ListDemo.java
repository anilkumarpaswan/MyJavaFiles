import java.util.Stack;
import java.util.LinkedList;
  class ListDemo{


  public static void main(String args[]){
   new ListDemo();
   
  }
  ListDemo(){
  LinkedList<String> list = new LinkedList<String>();
  list.add("A");
  list.add("B");
  list.add("C");
  list.add("D");
  
  
      for(int i =0;i<4;i++){
		  System.out.println(list.pop());
		  
	  }
  }
} 
  

	
