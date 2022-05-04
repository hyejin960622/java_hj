package day8;

import java.util.Scanner;

public class Ex2_Method2_Caculator {

	public static void main(String[] args) {
		
		int a =1, b =2; //이름이 꼭 같을 필요는 없음
		char op = '/';
		double res = calculator(a, op, b);
		System.out.println("" + a +op + b +"=" +res);
		

	}
	
	/* 기능 : 두 정수와 산술연산자가 주어지면 산술연산 결과를 알려주는 메소드
	 * 매개변수 : 두 정수, 산술연산자 = > int num1, char op, int num2
	 * 리턴타입 : 산술연산 결과 => 실수 => double
	 * 메소드명 : calculator
	 * */
	
	public static double calculator(int num1, char op, int num2) {
			double res = 0;
			switch(op) {
			case '+' : res = num1 + num2; break;
			case '-' : res = num1 - num2; break;
			case '8' : res = num1 * num2; break;
			case '/' : res = num1 / (double)num2; break;
			case '%' : res = num1 % num2; break;
			default : res = 0;
			}
			return res;
	}

}
