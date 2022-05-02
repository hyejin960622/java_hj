package day6;

public class Ex6_Array4_Squared {

	public static void main(String[] args) {
		/* 배열에 1의 제곱부터 10의 제곱까지 저장하고, 출력하는 코드를 작성하세요.
		 */
		
		/* 방법 1. 10개짜리 배열을 만들어서 사용 
		 * 장점 : 10개를 사용
		 * 단점 : i의 제곱을 하려면 약간의 작업이 필요
		 * */
		int arr1 [] = new int[10];
		for(int i = 0; i <arr1.length; i++) {
			arr1[i] = (i+1)*(i+1);
			System.out.println(i+1+"의제곱" + arr1[i]);
		}
		
		
		/* 방법 2. 11개짜리 배열을 만들어서 0번지를 이용하지 않고 1번지부터 사용하는 방법 
		 * 장점 : i의 제곱을 작업이 없이 확인 할 수 있다.
		 * 단점 : 쓸모없는 공간이 1개 추가
		 * 
		 * */
		int arr2 [] = new int[11];
		for(int i = 1; i <arr2.length; i++) {
			arr2[i] = i*i;
			System.out.println(i+"의제곱" + arr2[i]);
		}
		
		

	}

}
