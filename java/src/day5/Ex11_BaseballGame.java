package day5;

import java.util.Scanner;

public class Ex11_BaseballGame {

	public static void main(String[] args) {
		/*숫자 야구 게임을 작성하세요
		 * 중복되지 않은 1~9사이의 세 정수를 입력받아 맞추는 게임
		 * 입력 : 1 2 3 => 원볼
		 * 입력 : 4 5 6 => 아웃
		 * 입력 : 7 8 9 => 2스트라이크
		 * 입력 : 8 3 9 => 1스트라이크 2볼
		 * 입력 : 3 8 9 => 3스트라이크
		 * 
		 * 
		 * 반복횟수 :s가 3보다 작을때까지 반복
		 * 규칙성 : 정수 3개를 입력받음.
		 * 		s와 b를 각각 0으로 초기화
		 * 		com1과 use1이 같으면 s를 1증가
		 * 		com2과 use2이 같으면 s를 1증가
		 * 		com3과 use3이 같으면 s를 1증가
		 *		com1과 use2가 같거나 com1과 use3이 같으면 b를 1증가 
		 *		com2과 use1가 같거나 com2과 use3이 같으면 b를 1증가 
		 *		com3과 use1가 같거나 com3과 use2이 같으면 b를 1증가 
		 *		s가 0이 아니면 xs를 출력
		 *		b가 0이 아니면 yb를 출력
		 *		s가 0이고 b가 0이면 O를 출력
		 *		엔터
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		
				
		int com1 = 3, com2 = 8, com3 = 9;
		int use1, use2 , use3;
		int s = 0, b = 0;
		
		while(s<3) {
			//정수 3개를 입력받음.
			System.out.print("1~9사이 정수를 중복되지 않게 입력하세요 (예 1 2 3)");
			use1 = scan.nextInt();
			use2 = scan.nextInt();
			use3 = scan.nextInt();
			//s와 b를 각각 0으로 초기화
			s=0;
			b=0;
			// com1과 use1이 같으면 s를 1증가
			if(com1 == use1) {
				s++;
			}
			// com2과 use2이 같으면 s를 1증가
			if(com2 == use2) {
				s++;
			}
			// com3과 use3이 같으면 s를 1증가
				if(com3 == use3) {
					s++;
			}
			// com1과 use2가 같거나 com1과 use3이 같으면 b를 1증가 
			if(com1 == use2 || com1 == use3) {
				b++;
			}
		    // com2과 use1가 같거나 com2과 use3이 같으면 b를 1증가 
			if(com2 == use1 || com2 == use3) {
				b++;
			}
			// com3과 use1가 같거나 com3과 use2이 같으면 b를 1증가 
			if(com3 == use1 || com3 == use2) {
				b++;
			}
			 //	s가 0이 아니면 xs를 출력
			if(s!=0) {
				System.out.print(s +"S");
			}
			 //	b가 0이 아니면 yb를 출력
			if(b!=0) {
				System.out.print(b +"B");
			}
			 //	s가 0이고 b가 0이면 O를 출력
			if( s ==0 && b==0) {
				System.out.println("o");
			}
			System.out.println();
			
			
			
		}
		
		
		
		
		
		  /*while(s<3) {
			
			if(com1 == use1) {
				s++;
			}else if(com1 == use2 || com1 == use3) {
				b++;
			}if(com2 == use2) {
				s++;
			}else if(com2 == use1 || com2 == use3) {
				b++;
			}if(com3 == use3) {
				s++;
			}else if(com3 == use1 || com3 == use1) {
				b++;	
			}
			if(s == 3) {
				System.out.print("정답");
			}
			if(s!=0) {
				System.out.print(s +"S");
			}
			 //	b가 0이 아니면 yb를 출력
			if(b!=0) {
				System.out.print(b +"B");
			}
			 //	s가 0이고 b가 0이면 O를 출력
			if( s ==0 && b==0) {
				System.out.print("o");
			}
			System.out.println();
			
			
		}
		
		*/
		scan.close();
	}
		
	
}

		

	


