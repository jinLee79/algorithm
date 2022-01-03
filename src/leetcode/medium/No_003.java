package leetcode.medium;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 3. Longest Substring Without Repeating Characters
 */
public class No_003 {
	
//	TO-DO: HashMap 사용해서 풀어보기
	
	public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0)
            return 0;
        
		HashSet<Character> hs = new HashSet<>();
        int p = 0, q = p + 1, maxLen = 1;
        hs.add(s.charAt(p));

        while (p < s.length() && q < s.length()) {
        	if (!hs.add(s.charAt(q))) {
        		p = q - hs.size() + 1;
        		q = p + 1;
        		hs.clear();
        		hs.add(s.charAt(p));
        	}
        	else {
        		if (hs.size() > maxLen)
        			maxLen = hs.size();
        		q++;
        	}
        }
        
        return maxLen;
    }
	
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int result = lengthOfLongestSubstring(str);
		System.out.println(result);
		in.close();
	}
}
