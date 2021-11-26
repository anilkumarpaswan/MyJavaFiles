 abstract class Overrindabstractrelation{
 abstract void display();
 
 void show()throws RuntimeException{
 System.out.println("Overrindabstractrelation1");
 }
class Anilk extends Overrindabstractrelation{
void show(){
System.out.println("Overrindabstractrelation2");
}
public static void main(String agrs[]){
	
//abstract methods of cannt object creat//
//Overrindabstractrelation o =new Overrindabstractrelation();//
//o.show();//

Anilk obj =new Anilk();
obj.show();
}
}
}