package day17;

public class Ex02_Math {

	public static void main(String[] args) {
		/* 주어진 정수를 소수점 둘째자리에서 반올림하는 코드를 작성하세요.*/
		double pi = 3.141592;
		int num = 2;
		
		double pi1 = (Math.round(pi*10))/10.0;
		System.out.println(pi1);
		//10을 곱해서 반올림
		double pi2 = pi * Math.pow(10, num-1);
		//반올림한 값에서 10으로 나눔
		double pi3 = Math.round(pi2) / Math.pow(10, num-1);
		double pi4 = Math.round(pi * Math.pow(10, num-1))/Math.pow(10, num-1);
		
		System.out.println(pi3);
		System.out.println(pi4);
		
	
	}

}
