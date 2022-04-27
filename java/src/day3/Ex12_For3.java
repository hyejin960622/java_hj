package day3;

public class Ex12_For3 {

	public static void main(String[] args) {
		/*1부터 10사이의 모든 짝수를 출력하는 코드를 작성하세요.
		 * 
		 * */
		//두배

		int i;
		for(i=1 ; i <= 5 ; i++ ) {
			System.out.println( i*2 );
		}
		
		
		//짝수이면 i를 출력
		for(i=1 ; i <= 10 ; i++ ) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//i는 2부터 10까지 2씩증가
		for(i=2; i<=10 ; i +=2) {
			System.out.println(i);
			
		}
	}

}
