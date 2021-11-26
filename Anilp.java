//Overriden Access Mdifere topices//
class Anilp{
//public protected default be used there//
public void show(){

System.out.println("Anshu Kumari");

}

}
class KumarAnil extends Anilp{

 public void show(){

System.out.println("Priya kumari");

}
public static void main(String agrs[]){
Anilp ap =new Anilp();
ap.show();

KumarAnil ka =new KumarAnil();
ka.show();
}
}