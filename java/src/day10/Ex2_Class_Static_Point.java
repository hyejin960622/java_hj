package day10;

public class Ex2_Class_Static_Point {

	public static void main(String[] args) {
		// 에러발생 : print()메소드는 객체 메소드이기 때문에 클래스 이름으로 호출할수없음.
		// Point1.print();
		Point1 p1 = new Point1(10,20);
		p1.ptrint();
		//printDimensional() 메소드는 클래스 메소드이기 떼문에 클래스 이름으로 호출할수 있다.
		Point1.printDimensional();
		//클래스메소드는 객체를 이용하여 호출할수 있지만 경고가 뜬다.
		p1.printDimensional();
		
		System.out.println(Math.random()); //대문자 클래스

	}

}

class Point1{
	static String dimensional = "이차원"; //클래스변수
	int x, y;//객체변수
	
	public Point1(int x, int y) {
		// 내 필드 x,y에 매개변수 x,y의 값을 저장
		this.x =x;
		this.y =y;
	
	}
	public Point1() {
		this(0,0);
	}
	public void ptrint() {
		System.out.println("차원 : " + dimensional);
		System.out.println("좌표 : " + x + "," + y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void printDimensional() { //객체변수가 없으면 static을 붙여도됨
		System.out.println("차원 : " + dimensional);
	}
	
}