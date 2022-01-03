package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 22. Generate Parentheses
 */
public class No_022 {
	
	static ArrayList<String> al;
	
	
	public static List<String> generateParenthesis(int n) {
		
		al = new ArrayList<>();
		btrk("", 0, 0, n);
		return al;
    }
	
	public static void btrk(String pr, int o, int d, int n) {
		
		if (pr.length() == n * 2) {
			al.add(pr);
			return;
		}
		
		if (o < n)
			btrk(pr + "(", o + 1, d, n);
		
		if (d < o)
			btrk(pr + ")", o, d + 1, n);
	}
	
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> result = generateParenthesis(n);
		System.out.println();
		result.forEach(re -> System.out.println(re.toString()));
		in.close();
	}
}
