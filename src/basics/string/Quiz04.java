package basics.string;
/*
 * N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �Է�: ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
 *      �� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 * ���: N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
 * 3
 * good   doog
 * Time   emiT   
 * Big    giB
 */
import java.util.Scanner;

public class Quiz04 {
	public static String solution(String str) {	
		
//		return new StringBuilder(str).reverse().toString();
		
//		���� ������2 by lt, rt
		char [] xx = str.toCharArray();
		int lt = 0, rt = xx.length - 1;
		while (lt < rt) {
			char tmp = xx[rt];
			xx[rt] = xx[lt];
			xx[lt] = tmp;
			rt--;
			lt++;
		}
		return String.valueOf(xx);
		
//		���� ������
//		StringBuilder sb = new StringBuilder();
//		
//		char [] xx = str.toCharArray();
//		for (int i = xx.length-1; i >=0; i--)
//			sb.append(xx[i]);
//		
//		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String [] strs = new String [N];
		for (int i = 0; i < N; i++) {
			String str = in.next();
			strs[i] = solution(str);
		}
		in.close();
		
		for (String str : strs)
			System.out.println(str);
	}
}
