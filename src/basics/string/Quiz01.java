package basics.string;
/*
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
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
