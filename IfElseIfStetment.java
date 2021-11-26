public class IfElseIfstetment{
public static void main(String[]arg){
int a=250;
int b=350;
int c=440;
int d=540;
int e=670;
int f=700;
int g=800;
int h=900;
int i=1000;

if(a<250){
   System.out.print("fail");
}
else if(a>=250 && b<350)
{ 
    System.out.println(" B is great");
}
else if(b>350 && c<440){
     System.out.println("C is great");
}

else if(d>440 && e<670){
    System.out.println("e is great");
}
else if(e>670 && f<700){
   System.out.println("f is great");
}
else if(f>700 && h<800){
     System.out.println("h is great");
}
else if(h>800 && i<1000){
     System.out.println("i is great");

}else{
   System.out.println("envalid no");
}
}
}
