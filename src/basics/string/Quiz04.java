package basics.string;
/*
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * 입력: 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *      두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * 출력: N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * 3
 * good   doog
 * Time   emiT   
 * Big    giB
 */
import java.util.Scanner;

public class Quiz04 {
	public static String solution(String str) {	
		
//		return new StringBuilder(str).reverse().toString();
		
//		직접 뒤집기2 by lt, rt
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
		
//		직접 뒤집기
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
