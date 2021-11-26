class Multithread{
 public static void main(String[]args){
      AnilkumarpaswanDemo anilkumarpaswanDemo = new AnilkumarpaswanDemo();
	  Thread thread = new Thread(anilkumarpaswanDemo);
	  System.out.println(Thread.CurentThread().getName());
	  thread.start();
	   Thread thread2 = new Thread(anilkumarpaswanDemo);
	  thread2.start();
	  
 }
}
class AnilkumarpaswanDemo implements paswan{
  
  
      public void run(){
	     for(int i = 0; i<10; i++){
		     System.out.println(Thread.CurentThread().getName()* ":" +i);
		 }
	  }

}
