package basics.string;
/*
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 */
import java.util.Scanner;

public class Quiz02 {
	public static String solution(String str) {	
		StringBuilder sb = new StringBuilder();		
		for (char x : str.toCharArray()) {
			// ASCII Code: 대소문자 차이는 32 (소문자 - 32 = 대문자)
			// 대문자: 65 - 90 (26개)
			// 소문자: 97 - 122 (26개)
			// char를 연산자로 쓰면 그냥 숫자
			if (x >= 97 && x <= 122)       // 소문자인가? 
				sb.append((char)(x - 32));
			else
				sb.append((char)(x + 32));
		}
		
//		for (char x : str.toCharArray()) {
//			if (Character.isLowerCase(x)) 
//				sb.append(Character.toUpperCase(x));
//			else
//				sb.append(Character.toLowerCase(x));
//		}

//		for (int i = 0; i < str.length(); i++) {
//			if (Character.isUpperCase(str.charAt(i)))
//				sb.append(Character.toLowerCase(str.charAt(i)));
//			else
//				sb.append(Character.toUpperCase(str.charAt(i)));
//		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String result = solution(str);
		System.out.println(result);
		in.close();
	}
}
