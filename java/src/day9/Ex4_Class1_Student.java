package day9;

public class Ex4_Class1_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HightSchoolStudent std =  new HightSchoolStudent("운호", "진혜진", 1, 10, 53);
		std.print();

	}

}
/* 고등학생 클래스에 필요한 필드를 주석으로 써 보고 선언해보세요.*/
class HightSchoolStudent{
	// 학교이름, 학생이름, 학년, 반, 번호, 국어, 영어, 수학 => 
	String schoolName; 
	String name;
	int grade;
	int classNumber;
	int number;
	int kor;
	int eng;
	int math;
	
	void print() {
		System.out.println("고등학교 : " + schoolName);
		System.out.println("이름 : " + name);
		System.out.println("학년 :" + grade);
		System.out.println("학반 : " + classNumber);
		System.out.println("번호 : " + number);
	}
	
	public HightSchoolStudent(String schoolName, String name, int grade, int classNumber, int number) {
		this.schoolName = schoolName;
		this.name = name;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	

	
	
	
}