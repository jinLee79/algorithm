package basics.string;
/*
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력: 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 * a#b!GE*T@S -> S#T!EG*b@a
 */
import java.util.Scanner;

public class Quiz05 {
	
	public static String solution(String str) {
		char [] x = str.toCharArray();  // 뒤집은 문자열을 담아야 하니까 char 배열로 만들어서 조작.
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
//			if (xx[i] == '\u0000') {       // char의 초기값
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
