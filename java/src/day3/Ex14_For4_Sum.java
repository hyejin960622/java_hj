package day3;

public class Ex14_For4_Sum {

	public static void main(String[] args) {
		/*1부터 5까지 합을 구하는 코드를 작성하세요.
		 *       sum = 0
		 * i =1  sum = 0+1      
		 * i =2  sum = 0+1+2    
		 * i =3  sum = 0+1+2+3  
		 * i =4  sum = 0+1+2+3+4   
		 * i =5  sum = 0+1+2+3+4+5  
		 *  sum = 0
		 * i =1  sum1 = 0+1      
		 * i =2  sum2= 0+1+2    
		 * i =3  sum3 = 0+1+2+3  
		 * i =4  sum4 = 0+1+2+3+4   
		 * i =5  sum5 = 0+1+2+3+4+5
		 * 규칙성 : sum = sum + i
		 * 반복문 종료 후 : sum을 출력 
		 * */
		
		int sum = 0;
		int i;
		
		for(i = 1; i<=5; i++) {
			sum = sum + i;//sum += i;
		}
		System.out.println("1부터 5까지의 합" + sum);
		
       
			
	}

}
