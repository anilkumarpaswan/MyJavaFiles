import java.util.ArrayList;
class ArrayListDemo{
    public static void main(String[]args){
		
	  ArrayList a1 =new ArrayList();
	  a1.add(20,30);
	  a1.add(0.40);
	  a1.add("Anil");
	  int n =(int)a1.get(0);
	  double d =(double)a1.get(1);
	  String str =(String)a1.get(2);
	  
	  
	

		ArrayList a2 =new ArrayList();
	  a2.add(30,40);
	  a2.add(0.60);
	  a2.add(" Mr. Anil ");
	  int n2 =(int)a2.get(0);
	  double d2 =(double)a2.get(1);
	  String str2 = (String)a2.get(2);
    }
}