package basics.string;
/*
 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
 * ���ĺ� �̿��� ���ڵ��� �����մϴ�.
 * �Է�: ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
 * ���: ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
 * found7, time: study; Yduts; emit, 7Dnuof  -> YES
 */
import java.util.Scanner;

public class Quiz08 {
	
	public static String solution(String str) {
		
		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
		
		if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
			return "YES";
		
		return "NO";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String result = solution(str);
		System.out.println(result);
		in.close();
	}
}
