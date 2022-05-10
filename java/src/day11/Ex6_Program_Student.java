package day11;

import java.util.Scanner;

public class Ex6_Program_Student {
	/* 학생 정보(이름, 학년, 반, 번호, 국어, 영어, 수학 성적)를 관리하는 프로그램을 작성하세요.
	 * 1. 기능을 정리 = > 주석
	 * - 학생정보 입력
	 *  - 학년, 반, 번호, 이름, 국어, 영어, 수학 성적을 한번에 입력받음.
	 *  - 입력한 학생정보를 저장 
	 * - 학생정보 출력
	 *  - 전체 학생의 학년, 반, 번호, 이름, 국어, 영어 수학 성적을 출력
	 * - 학생정보 수정
	 *  - 학년, 반, 번호를 입력받음.
	 *  - 입력받은 정보와 일치하는 학생이 있으면, 이름, 국어, 영어, 수학 성적을 전부 수정 
	 * - 학생정보 삭제
	 *  - 학년, 반, 번호를 입력받음
	 *  - 일치하는 정보와 일치하는 학생이 있으면, 삭제
	 * - 프로그램 종료   
	 * 2. 필요한 클래스가 있는지 확인하고, 있으면 만들기
	 * - 학생 클래스 : 이름, 학년, 반, 번호, 국어, 영어, 수학 성적
	 * - 기능 : 
	 *   - 학생 정보를 출력하는 기능
	 *   - 학년, 반 ,번호가 주어졌을때 일치하는지 확인하는 기능
	 *   - 주어진 이름, 국어, 영어, 수학점수로 수정하는 기능
	 * - 생성자 : 이름, 학년, 반, 번호, 국어, 영어, 수학 성적이 주어졌을 때 초기화하는 생성자  
	 * 3. 기능을 구현
	 * - 클래스 정의 및 구현
	 * - 반복문을 이용하여 메뉴 출력 및 메뉴 선택
	 * - 선택한 메뉴에 따른 조건문 생성
	 * */

	public static void main(String[] args) {
	
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		final int max = 30;
		Ex6_Student std[] = new Ex6_Student[max];
		int index = 0;
		for( ; menu !=5 ;){
			//메뉴를 출력하고, 메뉴를 선택
			menu = selectMenu(scan);
			  int grade, classNumber, num;
			  String name;
			  double kor, eng, math;
		
			  switch(menu) {
			  case 1 :
				  //학년 반 번호 이름 국어 영어 수학 점수를 입력
				  System.out.println("학생 정보 입력(학년, 반, 번호, 이름) : ");
				  grade = scan.nextInt();
				  classNumber = scan.nextInt();
				  num = scan.nextInt();
				  name = scan.next();
				  System.out.println("학생 성적을 입력(국영수 순서) : ");
				  kor = scan.nextDouble();
				  eng = scan.nextDouble();
				  math = scan.nextDouble();
				 
				  //Ex6_Student의 생성자를 이용하여 객체를 생성한 후 학생 배열 std
				  //index번지에 저장
				  std[index] = new Ex6_Student(grade, classNumber, num, name, kor, eng, math);
				  //index를 1증가
				  index ++;
				  //여기서 index는 현재 저장된 학생의 수 
				  break;
			  case 2 :
				  //반복문을 이용하여 0번지 부터 index명만큼 학생 정보를 출력
				  for(int i =0; i < index ; i++) {
					  std[i].print();	  
				  }
				  break;
			  case 3 :
				  //학년, 반 , 번호를 입력
				  System.out.println("수정할 학생 정보 입력(학년, 반, 번호) : ");
				  grade = scan.nextInt();
				  classNumber = scan.nextInt();
				  num = scan.nextInt();
				  
				  // 반복문을 통해 0번지 부터 index명만큼 학생 정보를 하나씩 가져와서 입력받은 학년, 반, 번호와 일치하는 학생이 있는지 확인
				  for(int i = 0; i < index; i++) {
					  //입력받은 학년, 반, 번호와 일치하는 학생이 있으면 
					  if(std[i].equal(grade, classNumber, num)) {
						  // 이름, 국어, 영어, 수학 성적을 입력받은 후 
						  System.out.println("수정할 학생 성적을 입력(이름,국,영,수 순서) : ");
						  name = scan.next();
						  kor = scan.nextDouble();
						  eng = scan.nextDouble();
						  math = scan.nextDouble();
						  //학생정보를 수정하고, 반목문 종료
						  std[i].modify(name, kor, eng, math);
						  break;
					  }
					  //등록된 학생 전체를 확인해서 일치하는 학생이 없으면 등록된 학생이 아닙니다 라고 출력
					  if(i+1 == index) {
						  System.out.println("등록된 학생이 아닙니다.");
					  }  
				  }
				  break;
			  case 4 :
				  System.out.println("삭제할 학생 정보 입력(학년, 반, 번호) : ");
				  grade = scan.nextInt();
				  classNumber = scan.nextInt();
				  num = scan.nextInt();
				  int delIndex = -1;
				  //반복문을 이용하여 0번지 부터 index명의 학생을 비교하여 일치하는 학생 정보가 있으면 delIndex번지인지 기억하고 반복문을 종료
				  for(int i = 0; i < index; i++) {
					  //일치하는 학생 정보가 있으면 delIndex번지인지 기억하고 반복문을 종료
					  if(std[i].equal(grade, classNumber, num)) {
						  delIndex = i;
						  break;
					  }  
				  }
				  //delIndex가 0이상이면 반복문을 이용하여 delIndex-1번지까지 다음번지에 있는 정보를 현재 번지에 저장
				  //delIndex가 0이상이면 => 일치하는 학생이 있으면 / index를 1감소 
					  if(delIndex >= 0) {
						  //0이상이면 반복문을 이용하여 delIndex-2번지까지 다음번지에 있는 정보를 현재 번지에 저장
						  for(int i = delIndex; i < index-1; i ++) {
							 std[i] = std[i+1]; 
						  }
						  //index를 1감소
						  index --;
					  }
					  else {
						  System.out.println("등록된 학생이 아닙니다.");
					  }
				  //delIndex가 0 미만이면 등록된 학생이 아닙니다를 출력
				  break;
			  case 5 :
				  System.out.println("프로그램 종료");
				  break;
			  default : 
				  System.out.println("잘못된 메뉴입니다.");
			  }
		
			
			
		}
		
		
		
		
		
		scan.close();
		
	}
	/* 기능 : 메뉴를 출력하고 메뉴를 입력하면 입력한 메뉴를 돌려주는 메소드
	 * 매개변수 : 입력받기위한 Scanner = > Scanner scan
	 * 리턴타입 : 입력한 메뉴 => 정수 => int
	 * 메소드명 : selectMenu
	 * */
	
	public static int selectMenu(Scanner scan) {
		  System.out.println("------메뉴");
		  System.out.println("1. 학생정보 입력");
		  System.out.println("2. 학생정보 출력");
		  System.out.println("3. 학생정보 수정");
		  System.out.println("4. 학생정보 삭제");
		  System.out.println("5. 프로그램 종료");
		  System.out.print("메뉴를 선택하세요 : ");
		  int menu = scan.nextInt();
		  System.out.println("--------------");
		  return menu;
		
	}

}
