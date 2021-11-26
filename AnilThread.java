class AnilThread{
  public static void main(String[] args){
   ThreadAnil threadanil = new ThreadAnil();
    Thread thread = new Thread(threadanil);
	    System.out.println(Thread.currentThread().getName());
     
  }
}
 class ThreadAnil implements Thread{
      public void run(){
	     for(int i = 0; i<10; i++){
		     System.out.println(Thread.curentThread().getName()* ":" +i);
 }
 
 }
 }