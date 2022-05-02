package day6;

import java.util.Scanner;

public class Ex8_Array6_Divisor {

	public static void main(String[] args) {
		/* 정수 num의 약수를 배열에 저장 한 후, 출력하는 코드를 작성하세요.
		 * 약수는 최대 10개만 저장*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int max = 10;
		int div []= new int[max];
		int j =1;
		
		int num = scan.nextInt();
		for(int i = 1; i<= num; i++) {
			if((num%i) == 0) {
			// System.out.println(i + " ");
			//j번지가 10보다 작은지 확인하여 10보다 작으면 배열 j번지에 i를 저장
				if(j < max) {
					//?번지에 저장한 값을 출력
					div[j] = i;
					//?를 1증가	
					j++;
				}
			}
		}
		//출력
		for(int i = 1; i < j; i++) {
			System.out.println(div[i] + "");
		}
	
		
		scan.close();
		}}
	


