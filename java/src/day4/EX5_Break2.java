package day4;

import java.util.Scanner;

public class EX5_Break2 {

	public static void main(String[] args) {
		/* 양의 정수를 무한으로 입력하고, 정수를 콘솔에 출력하는 코드를 작성하세요.
		 * 입력받은 정수가 음수이면 반복문을 빠져 나오게 수정해보세요.
		 * 무한루프 : 조건식없애거나 for(; ;)
		 * 반복횟수 : i는 1부터 5까지 1씩증가
		 * 규칙성 : 스캐너를 이용하여 정수를 입력받아 num에 저장하고, num를 출력 /num가 음수이면 반복문을 뻐져 나가고 아니면 num를 출력
		 * 반복문 종료 후 : 출력
		 */
		
		Scanner scan = new Scanner(System.in);
	
		
		
		int num;
		
		//i는 1부터 5까지 1씩증가
		for( ;  ; ) {
			System.out.println("양의 정수를 입력하세요");
			//스캐너를 이용하여 정수를 입력받아 num에 저장하고, num를 출력
			num =scan.nextInt();
			//num가 음수이면 반복문을 뻐져 나가고
			if(num < 0){
				break;
		}
			System.out.println(num);
				
			}
		
		
		//scan.close();

	}
	
}



