package numerical;

public class ReVerseNumber {

	public static void main(String[] args) {
		int n=12345;
		int rev=0;
		while(n!=0)
		{
			int R=n%10;
			rev=rev*10+R;
			n=n/10;
		}
		System.out.println(rev);
	}

}
