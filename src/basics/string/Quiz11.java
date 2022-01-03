package basics.string;
/*
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 * 입력: 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 출력: 첫 줄에 압축된 문자열을 출력한다.
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
