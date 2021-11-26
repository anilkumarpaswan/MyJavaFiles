import java.util.*;
import java.util.Hashtable;
class HashTableDemo{
public static void main(String []args){
   Hashtable s = new Hashtable();
    s.put("200" , 'A');
	s.put("300", 'B');
	s.put("400", 'C');
	s.put("500", 'D');
	Set st = s.entrySet();
	Iterator itr = st.iterator();
	Map.Entry entry =(Map.Entry)itr.next();
	       while(itr.hasNext()){
	        System.out.println(itr.Next());
	        }
	
          }
      }