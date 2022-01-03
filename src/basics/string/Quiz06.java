package basics.string;
/*
 * �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
 * �Է�: ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * ���: ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
 * ksekkset -> kset
 */
import java.util.Scanner;

public class Quiz06 {
	
	public static String solution(String str) {
		
//		boolean [] check = new boolean [26];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
//			�ش� ���ڿ��� index�� �ش� ���ڿ��� ó�� �����ϴ� index�� ������ üũ
//			System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) == i) // ���� ���� �ߺ��� �ƴϴ�.
				sb.append(str.charAt(i));
		
			
//			int idx = str.charAt(i) - 'a';
//			if (!check[idx]) {
//				sb.append(str.charAt(i));
//				check[idx] = true;
//			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String result = solution(str);
		in.close();
		System.out.println(result);
	}
}
