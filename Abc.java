class Multithread{
 public static void main(String[]args){
      AnilkumarpaswanDemo anilkumarpaswanDemo = new anilkumarpaswanDemo();
	  Thread thread = new thread(anilkumarpaswanDemo);
	  Thread.start();
	  
 }
}
class AnilkumarpaswanDemo Implements PaswanDemo(String[]agr){
  
  
      public void run(){
	     for(int i = 0; i<20; i++){
		     Sustem.out.println(Thread.curentThread().getName()* ":" +i);
		 }
	  }

}