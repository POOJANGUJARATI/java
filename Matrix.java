import java.util.*;
public class Matrix
{
	public static void main(String args[])
	{

	 	int r,c,i,j,k,r2,c2;
	 	Scanner obj=new Scanner(System.in);
	 	System.out.println("enter rows=");
	 	r=obj.nextInt();
	 	System.out.println("enter columns=");
	 	c=obj.nextInt();
	 	System.out.println("enter rows=");
	 	r2=obj.nextInt();
	 	System.out.println("enter columns=");
	 	c2=obj.nextInt();
	 	int m[][]=new int[r][c];
		int n[][]=new int[r2][c2];
		int z[][]=new int[r][c2];
	 	if(c!=r2)
	 	{
			System.out.println("matrix not possible");
		}
		else
		{
	 	System.out.println(" enter elements of first matrix=");
	 	for(i=0;i<r;i++)
	 	{
			for(j=0;j<c;j++)
			{
				m[i][j]=obj.nextInt();
			}
		}
		System.out.println("enter elements of second matrix=");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				 n[i][j]=obj.nextInt();
			}
		}
		for ( i=0;i<r;i++)
		{
		     for ( j=0; j<c;j++)
		      {
		            for( k=0;k<r2;k++)
		            {
		                    z[i][j] = z[i][j] + m[i][k] * n[k][j];
		            }
           		}
	    }
		System.out.println("product matrix...");
	     for( i=0;i<r2; i++)
		  {
		        for ( j=0; j<c; j++)
		         {
		                System.out.print(z[i][j] + " ");
		          }
		            System.out.println();
           }
}
}

}


