package day10;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 * 메뉴
		 * 1. 학생정보 입력
		 * 2. 학생정보 출력
		 * 3. 프로그램 종료
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		Student st = new Student(null, 0, 0, 0);
		int menu = -1;
		for( ; menu !=3 ;){
			  System.out.println("메뉴");
			  System.out.println("1. 학생정보 입력");
			  System.out.println("2. 학생정보 출력");
			  System.out.println("3. 프로그램 종료");
			  System.out.print("메뉴를 선택하세요 : ");
			  menu = scan.nextInt();
			  
			  switch(menu) {
			  case 1:
				  System.out.print("이름 :  ");
				  String name = scan.next();
				  System.out.print("학년 :  ");
				  int grade = scan.nextInt();
				  System.out.print("반 :  ");
				  int classNumver = scan.nextInt();
				  System.out.print("번호 :  ");
				  int number = scan.nextInt();
				  st = new Student(name, grade, classNumver, number);
				  break;
			  case 2 :
				  st.print();
				  break;
			  case 3 : 
				  System.out.println("프로그램을 종료합니다.");
				  break;
			  default:
				  System.out.println("잘못된 메뉴입니다.");
				  
			  }
	

		}
		scan.close();

	}
}

/*학생(Student) 클래스
 - 학생 이름, 학년, 반, 번호를 필드로 가짐
 - 학생 정보를 출력하는 메소드를 가짐(print)
 - 학생 이름, 학년, 반, 번호를 이용하여 필드를 초기화하는 생성자를 가짐
 * */

class Student{
	String name;
	int grade;
	int classNumber;
	int number;
	
	void print() {
		System.out.println(grade + "학년 " + classNumber + "반 " + number + "번 " + name);
		
	}

	public Student(String name, int grade, int classNumber, int number) {
		super();
		this.name = name;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	
	
}