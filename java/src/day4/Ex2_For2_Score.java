package day4;

import java.util.Scanner;

public class Ex2_For2_Score {

	public static void main(String[] args) {
		/* 3명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요. 반목문 이용
		 * 단, 총점과 평균만 알면 됨. => 총점과 평균을 구한 후 각 학생의 점수를 기억할 필요가 없다.
		 * 
		 * 반복횟수 : 3번 i는 1부터 3까지 1씩증가
		 * 규칙성 : 성적을 입력받고 총점에 누적
		 * 		  Scanner를 이용하여 정수를 입력받아 num에 저장한 후,
		 * 		  sum에 num를 더해서 sum에 저장
		 * 반목문 종료 후 : 총점을 출력하고, 총점을 이용하여 평균을 계산 한 후, 총점을 출력
		 * 				sum를 출력하고, sum을 3으로 나누어서 avg에 저장한 후, avg 출력
		 * */
		Scanner scan = new Scanner(System.in);
	
		
		
		//내가한 코드
		System.out.println("3명의 국어점수를 입력하세요 : ");
		
		int sum = 0;
		int num = 0;
		
		for(int i =1; i <=3 ; i++) {
			num = scan.nextInt();
			sum = sum + num;
		}
		
		double avg; 
		avg= sum/(double)3;
		System.out.println("총점은" + sum);
		System.out.println("평균은" + avg);
		
						
		
		/*강사가 한 코드
		int i, num, sum = 0;
		double avg;
		
		// 1부터 3까지 1씩증가
		for(i = 1; i <=3 ; i++) {
			num = scan.nextInt();
			//Scanner를 이용하여 정수를 입력받아 num에 저장한 후
			sum = sum + num; // sum += num
		}
		//sum을 3으로 나누어서 avg에 저장한 후, avg 출력
		System.out.println("3명 학생의 국어 총점 : " + sum);
		avg = sum/(double)3;
		System.out.println("3명학생 국어 평균" + :avg);
		
		*/
		scan.close();
				

	}

}
