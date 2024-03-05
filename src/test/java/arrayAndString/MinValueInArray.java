package arrayAndString;

public class MinValueInArray {

	public static void main(String[] args) {
		int a[]= {2,5,1,5,2,5,9};
		int min=a[0];//consider zero index value is minimum
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)//compare zero index value with another value in array
			{
				min=a[i];//first min value store in a[i] then replace min
			}
			
		}
    System.out.println("Min Value In Array "+min);
	}

}
