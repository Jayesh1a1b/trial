package pattern;

public class RowPrint {

	public static void main(String[] args) {
		//************
		//123456789
		//abcdefghi
		
		for(int i=0;i<=8;i++)
		{
			System.out.print("*");
		}
		System.out.println();
        System.out.println("-----------------------------");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		 System.out.println("-----------------------------");
		for(char i='A';i<='J';i++)
		{
			System.out.print(i);
		}
		System.out.println();
	    System.out.println("-----------------------------");
	}

}
