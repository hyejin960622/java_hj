package day5;

public class Ex9_MultiplicationTable {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 작성하세요.
		 * 7 X 1 = 7   7 * ? = ??
		 * 7 X 2 = 14
		 * 7 X 3 = 21
		 * 7 X 4
		 * 7 X 5
		 * 
		 * 7 X 9
		 * 
		 * 반복횟수 : i는 1부터 9까지 1씩증가
		 * 규칙성 : 7 * i = (7*i)를 출력
		 * 반복문종료후 : 없음
		 * */
		
		
		/*강사
		 * int num = 7;
		 * for( int i = 1; i <=9; i++){
		 * sysout(num +  "X" +j +"=" + (num*i) 
		 * */
		
		
		/*내가한코드
		 * for(int i = 7; i <8 ; i++) {
			for(int j =1; j<=9 ;j++)
				System.out.println(i + "X" +j +"=" + (i*j));
			*/
		
		
		/*구구단 2단에서 9단까지 출력하는 코드*/
		
		for(int i = 2; i <= 9 ; i++) {
			for(int j =1; j<=9 ;j++)
				System.out.println(i + "X" +j +"=" + (i*j));
			 
		}

	}

}
