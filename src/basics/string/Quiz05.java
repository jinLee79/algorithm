package basics.string;
/*
 * ���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
 * Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �Է�: ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.
 * ���: ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.
 * a#b!GE*T@S -> S#T!EG*b@a
 */
import java.util.Scanner;

public class Quiz05 {
	
	public static String solution(String str) {
		char [] x = str.toCharArray();  // ������ ���ڿ��� ��ƾ� �ϴϱ� char �迭�� ���� ����.
		int lt = 0, rt = x.length - 1;
		
		while (lt < rt) {
			if (!Character.isLetter(x[lt]))  // isAlphabetic ? 
				lt++;
			
			else if (!Character.isLetter(x[rt]))
				rt--;
			
			else {
				char tmp = x[lt];
				x[lt++] = x[rt];
				x[rt--] = tmp;
			}
		}
		return String.valueOf(x);
	}
	
	
//	public static String solution(String str) {	
//		char [] x = str.toCharArray(), xx = new char [x.length];
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < x.length; i++) {
//			if (!Character.isLetter(x[i]))
//				xx[i] = x[i];
//			else
//				sb.append(x[i]);
//		}
//		
//		sb.reverse();
//		
//		int k = 0;
//		for (int i = 0; i < xx.length; i++) {
//			if (xx[i] == '\u0000') {       // char�� �ʱⰪ
//				xx[i] = sb.charAt(k++);
//			}	
//		}
//		
//		return String.valueOf(xx);
//	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String result = solution(str);
		in.close();
		System.out.println(result);
	}
}
