package day7;

import java.util.Scanner;

public class Ex5_Array5_Baseball {

	public static void main(String[] args) {
		/* 정수 3개짜리 배열 com을 생성 한 후 랜덤으로(1~9사이)
		 * 세정수를 만들어 배열에 저장하는 코드를 작성하세요.(중복가능)*/
		
		Scanner scan = new Scanner(System.in);
		int com [] = new int[3];
		int user [] = new int[3];
		
		int min = 1, max = 9;
		//랜덤으로 생성한 수아 배열에 저장된 수들을 비교하여 중복된 수가 없으면 배열에 저장, 있으면 건너뜀
		int count = 0;
		for(  ; count < 3; ) {
			//랜덤한 수 생성
			 int r = (int)(Math.random() * (max-min+1)+ min); 
			 //랜덤한 수와 저장된 배열값들을 비교하여 중복이 안되면 저장
			 int i =0;
			 for(;i < count ; i++) {
				 if(r==com[i]) {
					 break;
				 }
			 }
			 //반복문 종료 후 i가 count와 같다는 의미는 중복된 수가 없다는 의미
			 if(i == count) {
				 com[count] = r;
				 System.out.println(com[count] + " ");
				 count++;
				 
			 }
		}
		
		/* 사용자가 정수 3개를 입력하여 3S가 될때까지 게임을 진행하도록 코드를 작성하세요.
		 * 단, 사용자가 입력한 정수도 배열에 저장.*/
		System.out.println();
		System.out.print("정수 3개를 입력하세요(1~9) : ");
		

		
		int s, b;
		
		do {
			s = 0;
			b = 0;
			//정수 3개를 입력 받음.
			for(int i = 0; i <user.length; i++) {
				user[i] = scan.nextInt();
			}
			
			//스트라이크 갯수 확인
			for(int i =0; i <com.length; i++) {
				if(com[i] == user[i]) {
				s++;
				}
			}
			
			for(int i = 0 ; i<com.length; i++) {
				for(int j = 0; j <user.length; j++) {
					if(i == j) {
						continue;
					}
					if(com[i] == user[j]) {
						b++;
					}
				}
			}
			s = 0;
			b = 0;
			for(int i =0; i<com.length; i++) {
				for(int j = 0; j <user.length; j++) {
					if(i == j) {
						s++;
					}else {
						b++;
						
					}
			}
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
				System.out.println("o");
			}
		}while(s<3);
	}
}
			
			
	
			
			
			
		
	
	
		
	


