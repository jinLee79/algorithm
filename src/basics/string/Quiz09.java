package basics.string;
/*
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 * 입력: 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * 출력: 첫 줄에 자연수를 출력합니다.
 * g0en2T0s8eSoft -> 208
 */
import java.util.Scanner;

public class Quiz09 {
	
	public static int solution(String str) {
		
		// ASCII 숫자: c >= 48 && c <= 57
		// int ans = ans * 10 + (x - 48)
		// char x = 48 이므로 48을 빼줘야 원래 숫자대로 연산이 됨. 
		
		int ans =  str.chars()  // ASCII 넘버로 Intstream 생성됨
			.filter(x -> (x >= 48 && x <= 57))
//			.filter(x -> Character.isDigit(x))
//			.filter(Character::isDigit)
			.reduce(0, (a, b) -> a * 10 + (b - 48));
				
		return ans;
		
		
//		 str = str.chars()
//			.filter(Character::isDigit)
//			.mapToObj(ch -> String.valueOf((char)ch))
//			.collect(Collectors.joining());
		
		// Integer.parseInt(str)하면 자동으로 0사라지므로 이 과정 필요없음
		// while (str.charAt(0) == 0)  
		//	 str.substring(1);
		 
//		 return Integer.parseInt(str);
		 
			
		// (1) Stream
		// map: 요소들을 특정 조건에 해당하는 값으로 '변환'해 줌. 최종결과물인 map을 반환하는 최종 연산(terminal operations)
		
		// filter: 요소들을 조건에 따라 '거르는' 작업을 해 줌. 중간결과물인 stream을 반환하는 중간 연산(intermediate operations)
		
		// reduce: 요소를 변환하지 않고 더하거나 빼는 등의 연산ㅇ르 수행해 하나의 값으로 만듬.
		
		// sorted: 요소들을 '정렬'해주는 작업을 해 줌.
			
		// mapToObj
		
		// collect: 요소들의 가공이 끝났다면 리턴해줄 결과를 collect를 통해 만들어 줌.
			
		
		// (2) :: 이중콜론. 메소드 참조 표현식. 람다식에서 파라미터를 중복해서 쓰기 싫을 때 사용. 
		// 람다식에서만 사용 가능
		// 인스턴스::메소드명(또는 new)  static메소드일 경우 인스턴스 대신 클래스이름
		
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
