class TotalEarnings{

int total =0;
public void run(){
for(int i=1;i<400;i++){

total =total+400;
}
}

class MoviesBookApp{

public static void main(string agrs[]){
TotalEarnings te =new TotalEarnings();
te.start();
System.out.println(TotalEarnings:"+te.total+"rs");
}
}
}
