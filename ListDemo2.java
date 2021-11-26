import java.util.Vector;
import java.util.ArrayList;
  class ListDemo2{


  public static void main(String args[])
  {
   new ListDemo2();
  
   
  }
  ListDemo2(){
  Vectork<String> list = new Vector<String>();
  list.add("A");
  list.add("B");
  list.add("C");
  list.add("D");
  
  
      for(int i =0;i<list.size();i++)
	  {
		  System.out.println(list.get(i));
		  
	  }
  }
  }
  
  