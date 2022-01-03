package basics.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

/*
 * ��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
 * (())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.
 * �Է�: ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.
 * ���: ù ��° �ٿ� YES, NO�� ����Ѵ�
 * (()(()))(() -> NO
 */
public class Quiz01 {

	public static String solution (String a) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char x : a.toCharArray()) {			
			if (x == '(')
				stack.push(x);
			
			else {
				// �ݴ� ��ȣ�� ���� ��
				if (stack.isEmpty())
					return "NO";
				stack.pop();
			}
		}
		
		// ȸ���� ������ �� stack�� ��ȣ�� �����ִ°�? (���� ��ȣ�� ���� ��) -> "NO" ���
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
