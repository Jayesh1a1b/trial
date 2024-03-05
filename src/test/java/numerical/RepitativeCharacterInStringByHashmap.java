package numerical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class RepitativeCharacterInStringByHashmap {

	public static void main(String[] args) {
		String s = "jayesh choudhary";
		char[] a = s.toCharArray();// convert string into char array for using for each loop
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

//by using for each loop
		/*
		 * for(char ch:a) 
		 * { 
		 * if(hm.containsKey(ch)) 
		 * 
		 * { 
		 * hm.put(ch, hm.get(ch)+1);
		 * }
		 *   else 
		 * {
		 * hm.put(ch, 1); 
		 * } 
		 * }
		 */

//without using for each
		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);// return char
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);// when Character repited then increased by 1
			} else {
				hm.put(c, 1);// verified character not present in HashMap or first time store then simple
								// else part execute
			}
		}
		System.out.println(hm);// print but not organized view space also count
		Set<Character> allValues = hm.keySet();
		for (Character key : allValues) {
			System.out.println(key + " " + hm.get(key));
		}
	}

}
