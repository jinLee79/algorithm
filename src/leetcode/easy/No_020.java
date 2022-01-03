package leetcode.easy;

import java.util.Scanner;
import java.util.Stack;

/*
 * 20. Valid Parentheses
 */
public class No_020 {
	
	static Stack<Character> st;
	
	public static boolean isValid (String s) {
		
		st = new Stack<>();
		
		for (char x : s.toCharArray()) {
			if (st.empty())
				st.push(x);
							
			else if (x == ')' || x == ']' || x == '}') { 
				if (match(x))
					st.pop();
				else
					return false;
			}
			
			else
				st.push(x);
			st.forEach(System.out::println);
		}
		
		return st.isEmpty();
    }
	
	public static boolean match (char x) {		
		char top = st.peek();		
		if ((x == ')' && top == '(') || (x == ']' && top == '[') || (x == '}' && top == '{'))
			return true;			
		return false;		
	}
	
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		boolean b = isValid(s);
		System.out.println(b);
		in.close();
	}
}
