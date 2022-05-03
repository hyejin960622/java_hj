package day7;

import java.util.Scanner;

public class Ex2_Array2_Duplicated {

	public static void main(String[] args) {
		/* 정수 num를 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드를 작성하세요.*/
		
		
		int arr[] = {1,2,4};
		int num, count = 0;
		Scanner scan = new Scanner(System.in);
		//정수입력
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		//0번지와 num가 같은지 확인
		if(arr[0] == num) {
			count++;
		}
		//1번지와 num가 같은지 확인
		if(arr[1] == num) {
			count++;
		}
		//2번지와 num가 같은지 확인
		if(arr[2] == num) {
			count++;
		}
		if(count >= 1) {
			System.out.println("배열에는 " + num + "가 있습니다.");
			
		}
		else
		{
			System.out.println("배열에는 " + num + "가 없습니다.");
		}
		
		
		// 반복문 사용1 : 배열 전체를 탐색 => 있는지는 확인 할수 있음. 하지만 어디에 있는지 모름.
		count =0;
		for(int i =0; i <arr.length; i++) {
			if(arr[i] ==num) {
				count++;
			}
		}
		if(count >= 1) {
			System.out.println("배열에는 " + num + "가 있습니다.");	
		}else{
			System.out.println("배열에는 " + num + "가 없습니다.");
		}
		
		//반복문 사용2 : 첫번째 중복 숫자가 나오면 확인 중단
		int i;
		for(i =0; i <arr.length; i++) {
			if(arr[i] ==num) {
				break;
			}
		}
		//반복문에서 break를 만나면 i는 3보다 작고, break를 안만나면 i는 3인 특성을 이용 =>있으면 i번지에 있음.
			if(i < arr.length) {
				System.out.println("배열에는 " + num + "가 있습니다.");	
			}else{
				System.out.println("배열에는 " + num + "가 없습니다.");
			}
		
		
	// 별도 설명 : 배열 출력시 주소
			System.out.println(arr); //주소값
			
		
		scan.close();
		
		

	}

}
