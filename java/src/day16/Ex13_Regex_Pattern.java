package day16;

import java.util.Scanner;



public class Ex13_Regex_Pattern {

	public static void main(String[] args) {
		String regex = "^010(-\\d{4}){2}$";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전화번호 입력");
		String number = scan.next();
		if(java.util.regex.Pattern.matches(regex, number)) {
			System.out.println("올바르게 입력했습니다.");
			
		}else {
			System.out.println("틀리게 입력했습니다.");
		}
		
		scan.close();

	}

}
