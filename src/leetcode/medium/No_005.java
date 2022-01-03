package leetcode.medium;

import java.util.Scanner;

/*
 * 5. Longest Palindromic Substring
 */
public class No_005 {
	
	static int idx, maxLen;
	
	public static void find(String s, int i, int j) {
		
		while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		
		if (maxLen < j-i-1) {
			idx = i + 1;
			maxLen = j - i - 1;
		}
	}
	
	public static String longestPalindrome(String s) {

		if (s == null || s.isEmpty())
			return "";
		
		int len = s.length();
		
		if (len < 2)
            return s;
		
		for (int i = 0; i < len - 1; i++) {
			find(s, i, i);
			find(s, i, i+1);
		}
		
		return s.substring(idx, idx+maxLen);
    }
	
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String result = longestPalindrome(str);
		System.out.println();
		System.out.println(result);
		in.close();
	}
}
