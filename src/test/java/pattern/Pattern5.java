package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		
//		55555
//		44444
//		33333
//		22222
//		11111
		
		int row=5;int column=5;		
		for(int i=5;i>=1;i--)
		{
			for(int j=column;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
