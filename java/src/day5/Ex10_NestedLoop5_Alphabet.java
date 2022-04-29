package day5;

public class Ex10_NestedLoop5_Alphabet {

	public static void main(String[] args) {
		/*a
		 *ab
		 *abc
		 *...
		 *abcdef...z
		 * 
		 * 
		 * 반복횟수 : end는 a부터 z까지 1씩증가
		 * 규칙성 : ch는 a부터 end까지 1씩증가하며 ch를 출력
		 * 
		 * */
		
		
		for(char end = 'a'; end <= 'z' ; end++) {
				for(char ch = 'a'; ch <= end; ch++) {
					System.out.print(ch);
				}
			}
			System.out.print("");
			
		}
		

	}


