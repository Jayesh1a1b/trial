package pattern;

public class NumberPattern2 {

	public static void main(String[] args) {
//		11111
//		22222
//		33333
//		44444
//		55555
//row=5;column=5
int row=5;int column=5;		
		for(int i=1;i<=row;i++)
		{
			for(int j=column;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
