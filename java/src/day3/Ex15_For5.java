package day3;

import java.util.Scanner;

public class Ex15_For5 {

	public static void main(String[] args) {
		/* 정수 num의 약수를 출력하는 코드를 작성하세요.
		 * A의 약수 : A를 어떤 수로 나누었을 때 나머지가 0과 같은 수
		 * 12의 약수 : 1 2 3 4 6 12
		 * 반복횟수 : I는 1부터 NUM까지 1씩증가
		 * 규칙성 I가 NUM의 약수이면 I를 출력
		 * =>NUM를 I로 나누었을때 나머지가 0과 같다면 I를 출력
		 * */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("약수를 구할 정수를 입력하세요. : ");

		 int num= scan.nextInt(); 

		 int i;

		 for(i=1; i<=num; i++) {

            if((num%i) == 0) {

            	System.out.println(i);

            }

            
            
            scan.close();
		 }

	}
}
