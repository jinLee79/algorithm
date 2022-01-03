package basics.string;
/*
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 출력: 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 * this is time to study -> study
 */
import java.util.Scanner;

public class Quiz03 {
	public static String solution(String line) {	
		
		if (line == null || line.equals(""))
			return null;
		int maxLen = Integer.MIN_VALUE, pos;   // 문법1
		String result = "";	
		
		while ((pos = line.indexOf(" ")) != -1) {  // 문법2
			String tmp = line.substring(0, pos);
			int len = tmp.length();
			if (len > maxLen) {
				maxLen = len;
				result = tmp;
			}
			line = line.substring(pos + 1);
		}
		
		// 마지막 단어는 line.indexOf(" ")가 -1이므로 while문에서 누락되어버림.
		if (line.length() > maxLen)
			result = line;
		
		
//		split() 사용
//		String [] strs = line.split(" ");
//		
//		for (String str : strs) {
//			if (str.length() > maxLen) {
//				maxLen = str.length();
//				result = str;
//			}
//		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String result = solution(line);
		System.out.println(result);
		in.close();
	}
}
