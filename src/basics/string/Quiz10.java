package basics.string;
/*
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 입력: 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다. 문자열의 길이는 100을 넘지 않는다.
 * 출력: 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * teachermode e -> 1 0 1 2 1 0 1 2 2 1 0
 */
import java.util.Scanner;
import java.util.stream.IntStream;

public class Quiz10 {
	
	public static void solution(String a, char t) {	
		
		// 앞에서부터 한 번, 뒤에서부터 한 번 loop
		// 그러면 왼쪽에서 있는 e로부터의 거리와 오른쪽에 있는 e로부터의 거리를 각각 구해서
		// 서로 비교해서 작은 값을 최종 답으로 뽑아낼 수 있다.
		int [] ans = new int [a.length()];
		int p = 1000;  // 어떤 큰 숫자
		
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
