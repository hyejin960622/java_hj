package day4;

public class Ex11_While3_Alphabet {

	public static void main(String[] args) {
		/* a에서 z까지 출력하는 코드를 while문으로 작성하세요.
		 * 
		 * 반복횟수 : i는 a부터 z까지 1씩증가
		 * 규칙성 : i를 출력
		 * 반복문 종료 후 : 없음
		 * 
		 * 
		 * */
		
		char i = 'a';
		while(i <= 'z') {
			System.out.print(i);
			i++;
		}
		
		
		System.out.println();
		i = 'a';
		while(i <= 'z') {
			System.out.print(i++);
		}
			
	}

}
