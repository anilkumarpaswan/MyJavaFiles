class ThreeDemo{
	public static void main (String args[]){
 
        int[][][] a =  {{{10,20,30},{30,40,50},{100,200,400}}};
         //System.out.println(a);//
		 //Systrm.out.println([0][0][0]);//
		  //System.out.println(a.length);//
		  //System.out.println(a[0][1][2]);//
		  
		  for(int i= 0;i<a.length;i++)
		  {
			  
			  for(int j=0;j<a[i].length;j++)
			 
			  {
				  for(int k =0;k<a[i][j].length;k++){
					  
				  
				  System.out.println(a[i][j][k]+"");
				  
				  
			         }
			   System.out.println();
			  
		  }
		  
  
   
      }
    }
}