package rajkumar;

import java.util.Arrays;

public class AnagramChecker {
	
	static boolean areAnagrams(String s1, String s2) {
		//remove whitespace & convert to lowercase
		s1 = s1.replaceAll("\s+", "").toLowerCase();
		s2 = s2.replaceAll("\s+", "").toLowerCase();
		
		//check if lengths are different
		if(s1.length() != s2.length()) {
			return false;
		}
		//convert string to character array
		char[] ch1= s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		//sort the character array
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//check if sorted arrays are equal
		return Arrays.equals(ch1, ch2);
	}
	

	public static void main(String[] args) {
		String s1 = "listen"; 
		String s2 = "good";
		
		if(areAnagrams(s1, s2)) {
			System.out.println(s1 +" and "+ s2 + " are anagrams ");
		}else {
			System.out.println(s1 +" and "+ s2 + " are not anagrams ");
		}

	}

}
