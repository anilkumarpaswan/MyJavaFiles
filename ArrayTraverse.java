class ArrayTraverse{
public static void main(String[] args){
      //int[]a ={10,20,40};1//
	  //int[][]a ={{10,20},{20,30,40}};2//
	  //int[][][]a ={{{80,90,70},{60,30,50},{40,50,60},{10,20,30}}};3//
	  int[][][][]a ={{{{10,10,10},{20,20,20},{30,30,30},{40,60,80}}}};
	  
        for(int i=0;i<a.length;i++)
		{
			 for(int j=0;j<a[i].length;j++)
			 {
				 for(int k =0;k<a[i][j].length;k++)
				 {
					 for(int m=0;m<a[i][j][k].length;m++)
					 {
 
                            // System.out.println(a[i]+" ");1//
			                    //System.out.println(a[i][j]+" ");2//
			                        //System.out.println(a[i][j][k]+" ");3//
			                                System.out.println(a[i][j][k][m]+" ");
                             }
				                                  //System.out.println();2//
				                                      //System.out.println();3//
				                                               System.out.println();
                                 }
                         }
		      }
          }
   }