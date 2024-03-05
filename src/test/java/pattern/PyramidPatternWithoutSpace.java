package pattern;

public class PyramidPatternWithoutSpace {

	public static void main(String[] args) {
//		*
//	   ***
//	  *****
//	 ******* space left triangle right triangle
		
for(int i=1;i<=4;i++)
{
	for(int j=4;j>=i;j--)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print("*");
	}
	for(int m=2;m<=i;m++)
	{
		System.out.print("*");
	}
	System.out.println();
	
}

	}

}
