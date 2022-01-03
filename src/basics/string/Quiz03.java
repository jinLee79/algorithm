package basics.string;
/*
 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ������� �� �ܾ�� �������� ���е˴ϴ�.
 * �Է�: ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 * ���: ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �մϴ�.
 * this is time to study -> study
 */
import java.util.Scanner;

public class Quiz03 {
	public static String solution(String line) {	
		
		if (line == null || line.equals(""))
			return null;
		int maxLen = Integer.MIN_VALUE, pos;   // ����1
		String result = "";	
		
		while ((pos = line.indexOf(" ")) != -1) {  // ����2
			String tmp = line.substring(0, pos);
			int len = tmp.length();
			if (len > maxLen) {
				maxLen = len;
				result = tmp;
			}
			line = line.substring(pos + 1);
		}
		
		// ������ �ܾ�� line.indexOf(" ")�� -1�̹Ƿ� while������ �����Ǿ����.
		if (line.length() > maxLen)
			result = line;
		
		
//		split() ���
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
