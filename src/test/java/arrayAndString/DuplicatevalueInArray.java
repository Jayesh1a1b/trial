package arrayAndString;

public class DuplicatevalueInArray {

	public static void main(String[] args) {
		int a[]= {2,4,5,6,1,2,4};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j]) 
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
