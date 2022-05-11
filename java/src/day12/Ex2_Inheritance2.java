package day12;

public class Ex2_Inheritance2 {

	public static void main(String[] args) {
		C c = new C();
		c.print();

	}

}
class A{
	public void print() {
		System.out.println("Hello");
	}
}
class B{
	public void print() {
		System.out.println("Hi");
	}
}
//클래스 c는 클래스 a,b를 동시에 상속받을 수 없다.
//동시 상속이 가능하다면 클래스 c를 이용하여 생성한 객체에 print를 호출했을때 
//a의 프린트 인지 b의 프린트 인지 알 수 없다 => 그래서 동시 상속이 안됨
//class C extends A, B{
class C extends A{}

