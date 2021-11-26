class Returnsubtypeoverride{
void show(){
System.out.println("Returnsubtypeoverride1");
}
}
class AnilR extends Returnsubtypeoverride{
void show(){
System.out.println("Returnsubtypeoverride2]");
}
public static void main(String agrs[]){
Returnsubtypeoverride rto =new Returnsubtypeoverride();
rto.show();

AnilR  a= new AnilR();
a.show();
}
} 