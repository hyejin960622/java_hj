package day9;

import java.util.Scanner;

public class Ex3_Method3_Sort {

	public static void main(String[] args) {
		/* 5명의 학생의 성적을 입력받아 오름차순으로 출력하는 코드를 작성하세요.
		 * 단, 입력받은 성적은 배열에 저장해야합니다.
		 * 
		 * 
		 * */
		//배열 선언 및 생성
		/*
		int score [] = new int [5];
		//반복문과 scanner를 이용하여 성적을 입력받음
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 입력 (5명) : ");
		for(int i = 0; i <score.length; i++) {
			 score[i] = scan.nextInt();
		}
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 입력 (5명) : ");

		int score[] = inputCreateArray(scan, 5);
			 
		// 반복문을 이용하여 성적을 정렬
		bubbleSort(score, false);
		
	/*	for(int i=0; i <score.length-1; i++) {
			for(int j=0; j <score.length-1-i; j++) {
				if(score[j] > score[j+1]) {
					int tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
				}
			}
		}
		*/
		
		// 반복문을 이용하여 배열 값 출력
	/*	for(int tmp : score){
			System.out.print(tmp + " ");
		} */
		
		printArray(score);
		System.out.println();
		
		
		scan.close();

	}
	
	public static void printArray(int num[]) {
		if(num == null || num.length ==0) {
			System.out.println("출력할 배열이 없습니다.");
			return; //메소드를 종료하는 역할
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
	}
	
	public static int[] inputCreateArray(Scanner scan, int n) {
		if( n <= 0) {
			return null;
		}
		int arr [] = new int [n];
		for(int i = 0; i <n; i++) {
			arr[i] =scan.nextInt();
		}
		return arr;
	}

	/* 기능 : 정수 배열이 주어지면 오름차순 또는 내림차순으로 정렬하는 메소드
	 * 매개변수 : 정수배열, 오름(Ascending)/내림 여부 => int arr [], boolean asc
	 * 리턴타입 : 없음 = void
	 * 메소드명 : bubbleSort*/
	
	public static void bubbleSort(int arr[], boolean asc) {
		if(arr == null) {
			return;
		}
		for(int i=0; i <arr.length-1; i++) {
			for(int j=0; j <arr.length-1-i; j++) {
				//오름차순인 경우
				if(asc && arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				
				else if(!asc && arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
