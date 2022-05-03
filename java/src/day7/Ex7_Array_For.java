package day7;

public class Ex7_Array_For {

	public static void main(String[] args) {
		// 향상된 for문 값을 가져와서 활용하는 경우 사용
		int score[] = {100, 90, 30};
		int sum = 0;
		double avg;
		
		for(int tmp : score) {
			sum += tmp;
		}
		avg = sum /(double)score.length;
		System.out.println("총점" + sum + "," +"평균" + avg);

	}

}
