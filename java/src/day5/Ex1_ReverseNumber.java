package day5;

import java.util.Scanner;

public class Ex1_ReverseNumber {

	public static void main(String[] args) {
		/* 양의 정수를 입력받아 입력받은 정수를 역으로 출력하는 코드를 작성하세요.
		 * 1230 => 0321 (1의 자리를 출력)
		 * 1230 = > 0을 출력, 1230 = > 123
		 * 123=> 3을 출력, 123=>12
		 * 12=> 2를 출력 , 12=>1
		 * 1=>1을 출력, 1=>0
		 * 
		 * 945 => 5를 출력, 945 => 94
		 * 94 => 4를출력, 94=>9
		 * 9 => 9를출력, 9=>0
		 * 
		 * 반복횟수 : num가 0이 아닐때 까지
		 * 규칙성 : num의 일의 자리를 출력한 후 num를 10으로 나눈 몫을 num에 다시 저장
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요. = ");
		
		int num = 1;
		 num =scan.nextInt();
		
		 while(num > 0) {
			 System.out.print(num % 10);
			 num /= 10;
		 }
		 
	
		
		scan.close();
		
		/*강사님이
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * int num = scan.nextInt();
		 * int reverseNum = 0;- 거꾸로 정수 출력하는방법
		   int tmpNum = num; - 거꾸로 정수 출력하는방법
		 * 
		 * while(num !=0 ){
		 *  System.out.print(num % 10); - 10으로 나누었을때 나머지가 1의 자리
		 *  reverseNum = 10*reverseNum + num % 10;- 거꾸로 정수 출력하는방법
		 *  num = num / 10;
		 * }
		 * System.out.println(tmpNum + "을 거꾸로한 정수  :" + reverseNum);- 거꾸로 정수 출력하는방법
		 * scan.close();
		 * */
		}
		

	}


