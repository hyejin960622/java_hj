package day3;

import java.util.Scanner;

public class Ex4_If1 {

	public static void main(String[] args) {
		/* 두 정수와 산술연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 두정수와 산술연산자를 입력하세요(예 1+2) : 1 + 2
		 * 1 + 2 = 3
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 산술 연산자를 입력하세요. : ");
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		if(op == '+') {
			System.out.println("" + num1 + op + num2 +"=" + (num1 + num2));
		}
		else if (op == '-'){
			System.out.println("" + num1 + op + num2 +"=" + (num1 - num2));
		}
		else if (op == '*'){
			System.out.println("" + num1 + op + num2 +"=" + (num1 * num2));
		}
		else if (op == '/'){
			System.out.println("" + num1 + op + num2 +"=" +((double)num1 / (double)num2));
		}
		else if (op == '%'){
			System.out.println("" + num1 + op + num2 +"=" + (num1 % num2));
		}
		else {
			System.out.println(op + "는 잘못된 연산자");
		}
		
			
			
		scan.close();	
			
			
			
			
			
		
		
		

	}

}
