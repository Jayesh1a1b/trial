package numerical;

public class WhiteSpacesFormString {

	public static void main(String[] args) {
		String s="MY nAme is jay";
		int count =0;
              for (int i=0;i<=s.length()-1;i++) 
              {
				char blank = s.charAt(i);
				if(blank==' ')
				{
					count++;
				}
				
			}
              System.out.println(count);
	}

}
