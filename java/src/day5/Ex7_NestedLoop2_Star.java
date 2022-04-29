package day5;

public class Ex7_NestedLoop2_Star {

	public static void main(String[] args) {
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 * *         i =1, * =1
		 * **		 i =2, * =2
		 * ***		 i =3, * =3
		 * ****		 i =4, * =4
		 * *****	 i =5, * =5
		 * 
		 * */
		
		int num = 5;
		for(int i = 1; i <=5 ; i++) {
			// * 을 i개 출력
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		/*아래와 같이 출려되도록 코드를 작성하세요.
		 *      *  i = 1   " " = 4, * = 1
		 *     **  i = 2   " " = 3, * = 2
		 *    ***  i = 3   " " = 2, * = 3
		 *   ****  i = 4   " " = 1, * = 4
		 *  *****  i = 5   " " = 0, * = 5
		 *     */
		
		
		for(int i = 1; i <= num ; i++) {
			//공백출력
			for(int j = 1; j<=num-i; j++) {
				System.out.print(" ");
			}
			//*을 출력
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
				
			}
			//엔터출력
			System.out.println("");
			
		}
		
		/*     *        i = 1 " " = 4 * =1
		 *    ***       i = 2 " " = 3 * =3
		 *   *****      i = 3 " " = 2 * =5
		 *  *******     i = 4 " " = 1 * =7
		 * *********    i = 5 " " = 0 * =9
		 * 				 	  " " = 
		 * */
		 
		for(int i = 1; i <= 5 ; i++) {
			//공백출력 5-i
			for(int j = 1; j<=5-i; j++) {
				System.out.print(" ");
			}
			// *을출력 : 2*i -1
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			//엔터출력
			System.out.println("");
		}
			
		/*     *         i = 1 " " = 4 * =1
		 *    ** *       i = 2 " " = 3 * =1
		 *   *** **      i = 3 " " = 2 * =2
		 *  **** ***     i = 4 " " = 1 * =3
		 * ***** ****    i = 5 " " = 0 * =4
		 * 
		 * */
		
		for(int i = 1; i <= num ; i++) {
			//공백출력
			for(int j = 1; j<=num-i; j++) {
				System.out.print(" ");
			}
			//*을 출력
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
				
			}
			for(int k = 1; k <= i-1; k++) {
				System.out.print("*");
			}
				
			
			//엔터출력
			System.out.println("");
		}

	}

}
