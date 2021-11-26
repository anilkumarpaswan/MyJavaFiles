class HasSetDemo{
 public static void main(String []args){
	 
 
   HasSet hs = new HasSet();
    hs.add("100");
	hs.add("200");
	hs.add("300");
	hs.add("400");
	
	  for(Object o:hs){
	  System.out.println(o.toString());
	  }
}
}