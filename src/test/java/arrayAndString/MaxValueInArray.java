package arrayAndString;

public class MaxValueInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int max=a[0];//consider zero index value is max
		for(int i=0;i<=a.length-1;i++)//these zero index value is compare with other index value in array with the for loop
		{
			if(a[i]>max)
			{
				max=a[i];//first max value store in a[i] then replace in max
				
			}
			
		}
		System.out.println("Max Value in Array "+max);
	}

}
