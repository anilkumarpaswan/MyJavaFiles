import java.util.Vector;

import java.util.ArrayList;
import java.util.Stack;
  class ListDemo3{


  public static void main(String args[])
  {
   new ListDemo3();
  
   
  }
  ListDemo3(){
  Stack<String> list = new Stack<String>();
  list.add("A");
  list.add("B");
  list.add("C");
  list.add("D");
  
  
      for(int i =0;i<list.size();i++)
	  {
		  System.out.println(list.pop());
		  
	  }
  }
  }