package basics.string;
/*
 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
 * ��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
 */
import java.util.Scanner;

public class Quiz01 {
	public static int solution(String str, char c) {	
		int cnt = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == Character.toLowerCase(c) || str.charAt(i) == Character.toUpperCase(c))
//				cnt++;
//		}
		
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		for (char x : str.toCharArray()) {
			if (x == c)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char c = in.nextLine().charAt(0);
		int result = solution(str, c);
		System.out.println(result);
	}
}
