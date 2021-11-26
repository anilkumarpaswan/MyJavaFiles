 
interface I1{
voiddisplay1();
}

 abstract class Overrindabstractrelation{
 abstract void display();
 
 void show()throws RuntimeException{
 System.out.println("Overrindabstractrelation1");
 }
class Anilk interfaceI1 Overrindabstractrelation{
public void show(){
System.out.println("Overrindabstractrelation2");
}
public static void main(String agrs[]){
	


Anilk obj =new Anilk();
obj.show();
}
}
}