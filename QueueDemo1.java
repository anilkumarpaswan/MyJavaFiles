import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
class QueueDemo1{
  public static void main(String []arg){
   new QueueDemo1();
  
  }
  QueueDemo1(){
  
  Queue<String>q = new LinkedBlockingQueue(4);
    q.add("A");
	q.add("B");
	q.add("C");
	q.add("D");
	q.add("E");
	int Size = 2;
	  for(int i=0;i<Size;i++){
	     System.out.println(q.remove());
	        }
          }
      }