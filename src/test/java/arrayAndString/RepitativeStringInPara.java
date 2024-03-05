package arrayAndString;

import java.util.HashMap;
import java.util.Set;

public class RepitativeStringInPara {

	public static void main(String[] args) {
		String s="abc pqr xyz abc pqr";
		String[] ar = s.split(" ");//{"abc","pqr","xyz","abc","pqr"}
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String s1 = ar[i];
			if(hm.containsKey(s1))
			{
				hm.put(s1, hm.get(s1)+1);
			}
			else
			{
				hm.put(s1, 1);
			}
			
		}
System.out.println(hm);

Set<String> keys = hm.keySet();

//Occurrence of each string
for(String key:keys)
{
	System.out.println(key+" "+hm.get(key));
}

System.out.println("----------------------------------------");
//print only duplicate value
for(String key:keys)
{
	if(hm.get(key)>1)
	{
		System.out.println(key+" "+hm.get(key));
	}
}
	}

}
