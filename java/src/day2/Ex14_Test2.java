package day2;

public class Ex14_Test2 {

	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요
		 * A : 90이상 ~ 100이하
		 * B : 80이상 ~ 90미만
		 * C : 70이상 ~ 80미만
		 * D : 60이상 ~ 70미만
		 * F : 0이상 ~ 60미만
		 * 0미만, 100초과인 경우 잘못된 성적이라고 출력하도록 수정하세요.
		 * */
		
		int score = 98;
		
		if(score < 0 || score > 100){
				System.out.println("잘못된 성적입니다.");
		}
		else if(score >= 90) {
			System.out.println("A등급입니다.");
		}
		else if(score >= 80) {
			System.out.println("B등급입니다.");
		}
		else if(score >= 70) {
			System.out.println("C등급입니다.");
		}
		else if(score >= 60) {
			System.out.println("D등급입니다.");
	    }
		else{
			System.out.println("F등급입니다.");
		}
		
	
		}
		
	}

