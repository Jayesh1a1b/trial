package arrayAndString;

public class ConvertStringToCapitilizationString 
{
	
	public static String CapitalizedWord(String str)
	{
		String[] words = str.split(" ");
		String result="";
		if(str==null)
		{
			System.out.println(" given string is null");
			return str;
		}
		if(str.length()==0)
		{
			System.out.println(" string is empty");
		}
		if(str.length()==1)
		{
			return str.toUpperCase();
		}
		for(String w:words)
		{
			String first = w.substring(0,1).toUpperCase();
			String rest = w.substring(1);
			result =result+first+rest+" ";
		}
		//System.out.println(result); //print extra space at end
		return result.trim();
	}

	public static void main(String[] args) {
  String caps = CapitalizedWord("my name is jayesh");
  System.out.println(caps);
  
  caps=CapitalizedWord("my");
  System.out.println(caps);
  
  caps=CapitalizedWord("m");
  System.out.println(caps);
  
  
  
  
	}

}
