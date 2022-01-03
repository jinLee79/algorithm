package basics.string;
/*
 * ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
 * ���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
 * �����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
 * �Է�: ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
 * ���: ù �ٿ� �ڿ����� ����մϴ�.
 * g0en2T0s8eSoft -> 208
 */
import java.util.Scanner;

public class Quiz09 {
	
	public static int solution(String str) {
		
		// ASCII ����: c >= 48 && c <= 57
		// int ans = ans * 10 + (x - 48)
		// char x = 48 �̹Ƿ� 48�� ����� ���� ���ڴ�� ������ ��. 
		
		int ans =  str.chars()  // ASCII �ѹ��� Intstream ������
			.filter(x -> (x >= 48 && x <= 57))
//			.filter(x -> Character.isDigit(x))
//			.filter(Character::isDigit)
			.reduce(0, (a, b) -> a * 10 + (b - 48));
				
		return ans;
		
		
//		 str = str.chars()
//			.filter(Character::isDigit)
//			.mapToObj(ch -> String.valueOf((char)ch))
//			.collect(Collectors.joining());
		
		// Integer.parseInt(str)�ϸ� �ڵ����� 0������Ƿ� �� ���� �ʿ����
		// while (str.charAt(0) == 0)  
		//	 str.substring(1);
		 
//		 return Integer.parseInt(str);
		 
			
		// (1) Stream
		// map: ��ҵ��� Ư�� ���ǿ� �ش��ϴ� ������ '��ȯ'�� ��. ����������� map�� ��ȯ�ϴ� ���� ����(terminal operations)
		
		// filter: ��ҵ��� ���ǿ� ���� '�Ÿ���' �۾��� �� ��. �߰�������� stream�� ��ȯ�ϴ� �߰� ����(intermediate operations)
		
		// reduce: ��Ҹ� ��ȯ���� �ʰ� ���ϰų� ���� ���� ���ꤷ�� ������ �ϳ��� ������ ����.
		
		// sorted: ��ҵ��� '����'���ִ� �۾��� �� ��.
			
		// mapToObj
		
		// collect: ��ҵ��� ������ �����ٸ� �������� ����� collect�� ���� ����� ��.
			
		
		// (2) :: �����ݷ�. �޼ҵ� ���� ǥ����. ���ٽĿ��� �Ķ���͸� �ߺ��ؼ� ���� ���� �� ���. 
		// ���ٽĿ����� ��� ����
		// �ν��Ͻ�::�޼ҵ��(�Ǵ� new)  static�޼ҵ��� ��� �ν��Ͻ� ��� Ŭ�����̸�
		
		// list.stream().map(a -> String.toUpperCase(a));
		// list.stream().map(String::toUpperCase);
		
		// list.stream().map(x -> new Dog(x)).collect(Collectors.toList());
		// list.stream().map(Dog::new).collect(Collectors.toList());
		
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int result = solution(str);
		System.out.println(result);
		in.close();
	}
}
