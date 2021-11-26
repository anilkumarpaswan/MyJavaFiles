//ArithmeticException unchek option//

class OverrExceptionhandling{
//throws runtimeException provoide//
void show()throws runtimeException{

System.out.println("Anshu Kumari");

}

}
class KumarAnil extends OverrExceptionhandling{
//Exception onli write which AeithmeticException chek ArithmeticException //
 //throws runtimeException//
 void show()throw ArithmeticException{

System.out.println("Priya kumari");

}
public static void main(String agrs[]){
OverrExceptionhandling oeh =new OverrExceptionhandlingp();
oeh.show();

KumarAnil ka =new KumarAnil();
ka.show();
}
}