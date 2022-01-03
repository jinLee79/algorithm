package basics.string;
/*
 * �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 */
import java.util.Scanner;

public class Quiz02 {
	public static String solution(String str) {	
		StringBuilder sb = new StringBuilder();		
		for (char x : str.toCharArray()) {
			// ASCII Code: ��ҹ��� ���̴� 32 (�ҹ��� - 32 = �빮��)
			// �빮��: 65 - 90 (26��)
			// �ҹ���: 97 - 122 (26��)
			// char�� �����ڷ� ���� �׳� ����
			if (x >= 97 && x <= 122)       // �ҹ����ΰ�? 
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
