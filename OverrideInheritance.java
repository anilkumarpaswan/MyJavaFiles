class OverrideInheritance{
	//no of argument same//
 //void show(){//
 //types of argument//
 void show(String a){
	 //sequence of argument//
	 void show(String a,int b){
 System.out.println("Fiest");
 }
}
class Abc extends OverrideInheritance{
	//no of argument same//
//void show(int a){//
//void show(String a){//
//sequence of argument//
void show(String a ,int b){
System.out.println("second");	
}
//exucution itsef Abc class//
public static void main(String agrs[]){
OverrideInheritance ovr =new OverrideInheritance();
//peramiter change a/c sequence//
ovr.show("aa",20);

Abc abc =new Abc();
abc.show("ss" ,30);


}
}