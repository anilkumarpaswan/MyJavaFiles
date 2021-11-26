interface I5{
void show();
}
interface I6{
	void display();
}
class Test8 implements I5 ,I6{
	//multiple Interface used in interface I5,I6

public void show(){
System.out.println("80");

}
public void display(){
	System.out.println("90");
}


public static void main(String agrs[]){

Test8 t= new Test8();
t.show();
t.display();
}
}