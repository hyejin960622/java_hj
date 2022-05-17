package day15;

public class Ex1_NestedClass {

	public static void main(String[] args) {
		//A.num = 10; // 호출x -> 인스턴스 변수이어서 클래스를 통해 호출할수 없다.
		A.num2 = 10; //static이 붙어있기 때문에 객체 생성없이 바로 호출 가능
		A a = new A(); //A생성자 호출
		A.B b = a.new B(); //B생성자 호출
		A.C c =new A.C(); //C생성자 호출 - A객체 생성 없이 호출가능 (static이 붙어있어서)
		
		a.method(1);

	}

}


class A{
	public int num = 1;
	public static int num2;
	
	B b1 = new B();
	C c1 = new C();
	//static B b2 =  new B(); // 객체 A를 생성한 후에 써야함, static사용불가 
	static C c2 = new C();
	//인스턴스(객체) 멤버 클래스
	class B{
		int num=2;
		public B() {
			System.out.println("B생성자");   
			System.out.println(this.num);//B객체의 num를 호출
			System.out.println(A.this.num); //바깥 클래스 A객체의 num를 호출
	
		}
	}
	//정적(클래스) 멤버 클래스
	static class C{
		public C() { System.out.println("C생성자");}
	}
	public void method(int num) {
		char ch ='a';
		//로컬 클래스
		//로컬 클래스에서 메소드의 매개변수와 지역변수를 사용 할 수 있는데
		//이때 자동으로 final이 붙는다.(처음부터 붙는게 아니라 로컬에서 호출할때 final이 붙음)
		//그래서 매개변수와 지역변수를 로컬클래스에서 수정할수없다.
		class D{
			public D() {System.out.println("D생성자");}
			//ch = 'b';
			//num = 2;
		}
		D d = new D();
		ch = 'c';
	}
	public A() {System.out.println("A생성자"); }
}
