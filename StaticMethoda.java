 class StaticMethoda{
 
 
 void display(){
 System.out.println("1");
 }
 public static void main(String[] agrs){
	 StaticMethoda s =new StaticMethoda();
	 s.display();
	 StaticMethoda.show();
	 
 }
 }
 class Anil{
	 static void show(){
		 System.out.println("2");
	 }
 }