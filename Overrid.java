class Overrid{

void show(){
System.out.println("first seconds");
}
}
class Test extends Overrid{

void show(){
System.out.println("second fourth");
}

public static void main(String agrs[]){
Overrid O = new Overrid();
O.show();

 Test t =new Test();
 t.show();

}
}
