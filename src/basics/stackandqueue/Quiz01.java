package basics.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

/*
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 * 입력: 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * 출력: 첫 번째 줄에 YES, NO를 출력한다
 * (()(()))(() -> NO
 */
public class Quiz01 {

	public static String solution (String a) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char x : a.toCharArray()) {			
			if (x == '(')
				stack.push(x);
			
			else {
				// 닫는 괄호가 많을 때
				if (stack.isEmpty())
					return "NO";
				stack.pop();
			}
		}
		
		// 회전을 끝냈을 때 stack에 괄호가 남아있는가? (여는 괄호가 많을 때) -> "NO" 출력
		if (!stack.isEmpty())
			return "NO";
		
		return "YES"; 
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b= solution(a);
		System.out.println(b);
		in.close();
	}
}
