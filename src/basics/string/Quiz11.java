package basics.string;
/*
 * ���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ� 
 * ���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� �ݺ�Ƚ���� 1�� ��� �����մϴ�.
 * �Է�: ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * ���: ù �ٿ� ����� ���ڿ��� ����Ѵ�.
 * KKHSSSSSSSE -> K2HS7E
 * KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2
 */
import java.util.Scanner;

public class Quiz11 {
	
	public static String solution(String a) {
		
		StringBuilder sb = new StringBuilder();
		a = a + " ";
		int cnt = 1;
		for (int i = 1; i < a.length(); i++) {
			if (a.charAt(i) == a.charAt(i-1)) {
				cnt++;
			}
			else {
				sb.append(a.charAt(i-1));
				if (cnt > 1)
					sb.append(cnt);
				cnt = 1;
			}
		}		
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = solution(a);
		System.out.println(b);
		in.close();
	}
}
