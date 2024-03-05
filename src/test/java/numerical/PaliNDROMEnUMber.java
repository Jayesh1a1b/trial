package numerical;

public class PaliNDROMEnUMber {

	public static void main(String[] args) {
		int n=121;
		int rev=0;
		int On=n;
		while(n!=0)
		{
			int R=n%10;
			rev=rev*10+R;
			n=n/10;
		}
		if(On==rev)
		{
			System.out.println(" number is palindrome");
		}
		System.out.println(rev);
	}

}
