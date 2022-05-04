package day8;

public class Ex3_Method3_GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3, num2 = 7, gcd = 1;
		int res = gcd(num1, num2); //int gcd = gcd(num1, num2);
		System.out.println(num1 + "와" + num2 + "의" + "최대공약수 는 " + res); //res 를 gcd로
		int lcm = lcm(num1, num2);
		System.out.println(num1 + "와" + num2 + "의" + "최소공배수는 " + lcm);

	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 최대공약수 = > 정수 => int
	 * 메소드명 : gcd
	 * */
	
	public static int gcd(int num1, int num2) {
		int res = 0; //int gcd = 1; 이라도 써도됨 => 메소드명이랑 겹쳐도 상관없음.
		for(int i = 1; i <= num1 ; i++) {
			if(num1 % i == 0 && num2 % i ==0) {
				res = i; //gcd = i;
				}
			}
		return res; //return gcd; 

		}
	
	/* 기능 : 두 정수의 최소 공배수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 최소공배수 => 정수 int
	 * 매소드명 : lcm
	 * */
	
	public static int lcm(int num1, int num2) {
		int lcm = 0;
		for(int i = 1; i <= num1*num2 ; i++){
			if(i % num1 == 0 && i % num2 ==0) {
				lcm = i;
				break;
			}
		}
			return lcm;
	//int res = num1 * num2 /gcd(num1, num2); => 최소공배수 공식
	//return res;
	//return num1 * num2 /gcd(num1, num2); => 바로출력가능.
	}

}
