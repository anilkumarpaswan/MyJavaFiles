import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
class QueueDemo12{
  public static void main(String []arg){
   new QueueDemo12();
  
  }
  QueueDemo12(){
  
  Queue<String>q = new LinkedBlockingQueue();
    q.offer("A");
	q.offer("B");
	q.offer("C");
	q.offer("D");
	q.offer("E");

	
	 /* for(int i=0;i<Size;i++){
	     System.out.println(q.offer());
		 */
		 
		 Iterator itr = q.itrator();
            while(itr.qNext()){
				System.out.println(itr.next());
				
				 
	        }
          }
      }