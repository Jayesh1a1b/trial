package arrayAndString;

public class SearchingOfElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int search =100;
		boolean status=false;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Element found");
				status=true;
			}
		}
		if(status==false)
		{
			System.out.println("Element not found ");
		}

	}

}
