package pattern;

public class DownwardTrianglePattern {

	public static void main(String[] args) {

//		 *****
//		  ****
//		   ***
//		    **
//		     *

		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)//if we not print space in first roe then j value should be 2
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
