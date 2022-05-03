package day7;

import java.util.Scanner;

public class Ex6_Array_Lotto {

	public static void main(String[] args) {
		/*1에서 45사이의 중복되지 않은 수 7개를 배열에 저장하고 출력하는 코드를 작성하세요.
		 * */
		
		int lotto[] = new int[7]; //번지가 보너스 번호
		int count = 0;//배열에 저장된 중복되지 않은 숫자의 개수
		
		//로또 당첨 번호
		int min = 1, max = 45;
		for(  ; count < 7; ) {
			//랜덤한 수 생성
			 int r = (int)(Math.random() * (max-min+1)+ min); 
			 //랜덤한 수와 저장된 배열값들을 비교하여 중복이 안되면 저장
			 int i =0;
			 for(i =0;i < count ; i++) {
				 if(r == lotto[i]){
					 break;
				 }
			 }
			 //반복문 종료 후 i가 count와 같다는 의미는 중복된 수가 없다는 의미
			 if(i == count) {
				 lotto[count++] = r;
				 System.out.print(r + " ");
				 
			 }
		}
		//사용자 번호 : 1~45사이의 정수 6개를 입력받아 user배열에 저장하는 코드를 작성하세요
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.print("로또 번호 입력 : ");
		int user [] = new int [6];
		
		for(int i = 0; i < user.length; i++) {
			user[i] = scan.nextInt();
			
		}
		
		//로또 번호와 사용자 번호를 이용하여 등수를 출력하는 코드를 작성하세요.
		//1등 - 6개 일치
		//2등 - 5개 + 보너스(6번지)일치
		//3등 - 5개일치 , 4등 - 4개일치, 5층 - 3개일치, 꽝 - 그외
		
		int count2 = 0; //일치하는 번호의 갯수
		
		for(int i = 0; i <user.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(lotto[i] == user[j]) {
					count2++;
				}
			}
		}
		switch(count2) {
		case 6 :
			System.out.println("1등");
			break;
		case 5 :
			int k;
			for(k=0; k<user.length;k++) {
				if(user[k] == lotto[6]) {
				break;	
				}
			}
			if(k == user.length) {
				System.out.println("3등");
			}else {
				System.out.println("2등");
			}
			break;
			
		
		case 4 :
			System.out.println("4등");
			break;
		case 3 :
			System.out.println("5등");
			break;
		default:
			System.out.println("꽝");
		}
	
		scan.close();
	
	}

}
