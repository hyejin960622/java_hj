package day11;

import day11_1.Ex5_B; //day11_1.* 도 가능 *가 모든을 의미
 
public class Ex5_AccessModifier {

	public static void main(String[] args) {
		Ex5_A t1 = new Ex5_A();
		//public은 모두 사용 가능
		System.out.println(t1.num1);
		//default는 같은 패키지내에서 사용 가능
		System.out.println(t1.num2);
		//private는 내 클래스에서만 사용 가능
		//System.out.println(t1.num3); //에러발생
		
		Ex5_B t2 = new Ex5_B();
		//public은 모두 사용 가능
		System.out.println(t2.num1);
		//default는 같은 패키지내에서 사용 가능 - 다른패키지에 있어서 에러발생
		//System.out.println(t2.num2); // 다른패키지에 있는 클래스 이기 때문
		//private는 내 클래스에서만 사용 가능
		//System.out.println(t1.num3); //에러발생
		
		//public int num = 2; // 지역 변수에 접근제한자를 붙일 수 없다.
				
	}
	public int num = 2;

}
