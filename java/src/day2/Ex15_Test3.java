package day2;

public class Ex15_Test3 {

	public static void main(String[] args) {
		/* month가 주어질 때 해달 달의 마지막 일을 출력하는 코드를 if문으로 작성하세요.
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * 그 외의 달은 잘못된 월입니다라고 출력
		 * month
		 * */
		
		int month = 7;
		
		
		if(month < 1 || month > 12 ) {
			System.out.println(month + "월은 잘못된 월입니다.");
		}
		else if(month == 2){
			System.out.println(month + "월은 28일까지 입니다.");
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11){
			System.out.println(month + "월은 30일까지 입니다.");
		}
		else{
			System.out.println(month + "월은 31일까지입니다.");
		}

	}

}
