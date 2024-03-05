package numerical;

public class ReverseNumer {

	public static void main(String[] args) {
		int n=12345;
		String s = Integer.toString(n);
		String  rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		int org = Integer.parseInt(s);
		
		System.out.println(org);
	}

}
