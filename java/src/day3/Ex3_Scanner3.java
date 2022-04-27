package day3;

import java.util.Scanner;

public class Ex3_Scanner3 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자(+ - % * /)를 입력받아 출력하는 코드를 작성하세요.
		 * 산술연잔사는 문자로 받아주세요.
		 * 
		 * 방법1. 
		 * 정수1을 입력하세요
		 * 정수2를 입력하세요
		 * 산술연산자를 입력하세요
		 * 
		 * 방법2. 
		 * 두 정수와 산술연산자를 입력하세요(예 1 + 2 )
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		///방법1.
		System.out.print("정수1을 입력하세요 : ");
		int num3 = scan.nextInt();
		System.out.print("정수2을 입력하세요 : ");
		int num4 = scan.nextInt();
		System.out.print("산술연산자를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		//정수 + 정수 =>정수 
		//+는 유니코드표에서 십진수 43에 해당
		//문자열 + 정수 => 문자열 - 빈 문자열 앞에 추가해줌 "" 추가하는 이유
		System.out.println( "" + num3 + ch + num4 + "=");
		
		//방법2
		System.out.print("정수와 산술연산자를 입력하세요 : ");
		int num5 = scan.nextInt();
		int num6 = scan.nextInt();
		char ch1 = scan.next().charAt(0);
		System.out.println( "" + num5 + ch1 + num6 + "=");
		
		///내가한거
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.print("산술 연산자를 입력하세요 : ");
		char op = scan.next().charAt(0);
		
		
		
		System.out.print("" + num1 + op + num2 + "=" );
		
		scan.close();
		
		
	}

}
