package basics.string;
/*
 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
 * �Է�: ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
 * ���: ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
 * gooG -> YES
 */
import java.util.Scanner;

public class Quiz07 {
	
	public static String solution(String str) {
		
//		str = str.toLowerCase();
//		for (int i = 0; i < (str.length()/2); i++) {   // ������ ���ݸ� ���鼭 ù�� �� ��
//			if(str.charAt(i) != str.charAt(str.length()-1-i))
//				return "NO";
//		}
//		return "YES";
		
		if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
			return "YES";
		
		return "NO";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			String str = in.nextLine();
			if (str.equals("exit"))
				break;
			String result = solution(str);
			System.out.println(result);
		}
		in.close();
	}
}
