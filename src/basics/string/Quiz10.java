package basics.string;
/*
 * �� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �Է�: ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * ���: ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.
 * teachermode e -> 1 0 1 2 1 0 1 2 2 1 0
 */
import java.util.Scanner;
import java.util.stream.IntStream;

public class Quiz10 {
	
	public static void solution(String a, char t) {	
		
		// �տ������� �� ��, �ڿ������� �� �� loop
		// �׷��� ���ʿ��� �ִ� e�κ����� �Ÿ��� �����ʿ� �ִ� e�κ����� �Ÿ��� ���� ���ؼ�
		// ���� ���ؼ� ���� ���� ���� ������ �̾Ƴ� �� �ִ�.
		int [] ans = new int [a.length()];
		int p = 1000;  // � ū ����
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == t) {
				p = 0;
				ans[i] = p;
			}
			else {
				p++;
				ans[i] = p;
			}
		}
		
		p = 1000;
		for (int i = a.length()-1; i >= 0; i--) {
			if (a.charAt(i) == t) {
				p = 0;
			}
			else {
				p++;
				ans[i] = Math.min(p, ans[i]);
			}
		}
		
		IntStream.of(ans).forEach(x -> System.out.print(x+" "));
	}

//	public static void solution(String a, char b) {	
//		int shrtIdx = a.indexOf(b);
//		
//		if (shrtIdx == -1)
//			return;
//		
//		int nxtIdx = shrtIdx;
//		for (int i = 0; i < a.length(); i++) {
//			
//			nxtIdx = a.indexOf(b, i);
//			
//			shrtIdx = Math.abs(nxtIdx - i) <= Math.abs(shrtIdx - i) ? nxtIdx : shrtIdx;
//			
//			System.out.print(Math.abs(shrtIdx - i));
//			
//			if (i < a.length() - 1)
//				System.out.print(" ");
//		}
//	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		char b = in.next().charAt(0);
		solution(a, b);
		in.close();
	}
}
