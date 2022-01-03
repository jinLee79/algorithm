package basics.string;
/*
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 * 입력: 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 * 출력: 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 * ksekkset -> kset
 */
import java.util.Scanner;

public class Quiz06 {
	
	public static String solution(String str) {
		
//		boolean [] check = new boolean [26];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
//			해당 문자열의 index와 해당 문자열이 처음 등장하는 index가 같은가 체크
//			System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) == i) // 같을 떄만 중복이 아니다.
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
