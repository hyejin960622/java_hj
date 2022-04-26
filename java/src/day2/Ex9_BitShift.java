package day2;

public class Ex9_BitShift {

	public static void main(String[] args) {
		/*A << B : A를 2의 B제곱만큼 곱한 결과값
		 * 3 << 2 :
		 * 00001100 =>12 (앞에 00버리고 뒤에)
		 * A >> B : A를 2의 B제곱만큼 나눈 결과의 몫
		 * 3 >> 1
		 * 오른쪽으로 하나밀고 옮겨서 왼쪽
		 * 00000001 => 1
		 * -4 >> 1
		 * 11111110 => -2
		 * -4 >>> 1
		 * 01111110 => 126
		 * 01111111 11111111 11111111 11111110 => 2147483646
		 * */
		byte num1 = 3;
		byte num2 = -4;
		
		System.out.println(num1<<2);
		System.out.println(num1>>1);
		System.out.println(num2>>1);
		System.out.println(num2>>>1);
				

	}

}
