class Selection{
public static void main(String args[]){
int[]a = {38,52,9,18,6,62,13};

int anil,kumar =0;

 for(int i=0;i<a.length;i++){
	 
 anil=1;
 for(int j=i+1;j<a.length;j++){
	 
    if(a[j]<a[anil]){
	anil =j;
	}
 }
 kumar=a[i];
 a[i]=a[anil];
 a[anil] =kumar;
 }
  for(int i=0;i<a.length;i++){
	  System.out.print(a[i]+" ");
	  
  }
}

}