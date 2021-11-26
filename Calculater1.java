  class Calculater1{
    int a,b,c,d;
        Calculater(){
		     Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the  number");
		         this.a =sc.nextInt();
			     this.b =sc.nextInt();
			     this.c =sc.nextInt();
			     this.d =sc.nextInt();

 
                   }
 
 
                   void add(){
                   System.out.println("SUM:"+(a+b+c+d));
            }
 
                   void SUB(){
                   System.out.println("SUB:"+(a-b));
                             }
 
                     void MUL(){
                     System.out.println("MUL:"+(a*b*c*d));
                              }
 
                       void add(){
                      System.out.println("SUM:"+(c%d));
               }
        
       }
  