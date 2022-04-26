package day2;

public class Ex17_Test5 {

	public static void main(String[] args) {
		/* num가 2의 배수이면 2의 배수라고 출력하고,
		 * num가 3의 배수이면 3의 배수라고 출력하고,
		 * num가 6의 배수이면 6의 배수라고 출력하고,
		 * num가 2,3,6의 배수가아니면 2,3,6의 배수가 아니라고 출력하는 코드를 작성하세요
		 * 단, num가 6이면 6의 배수라고 출력, 2의배수, 3의 배수 출력이 나오면 안됩니다.
		 * 힌트1 : 6의 배수를 먼저체크
		 * 힌트2 : 2의 배수를 확인할 때 3의 배수가 아닌 숫자를 확인
		 * 
		 * */
		
		int num = 9;
		
		if(num % 6 == 0) {
			System.out.println(num + "는6의 배수입니다.");
		}
		else if(num % 2 == 0) { // 조건식 && num &3 != 0 추가하면 가능
			System.out.println(num + "는2의 배수입니다.");
		}
		else if(num % 3 == 0) {// 조건식 && num &2 != 0 추가하면 가능
			System.out.println(num + "는3의 배수입니다.");
		}
		else {
			System.out.println("2,3,6의 배수가 아닙니다.");

		}

	}

}
