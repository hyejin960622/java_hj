package day10;

public class Ex3_Class_Static2 {

	public static void main(String[] args) {
	
		test t1 = new test();
		//t1.printX();
		test t2 = new test();
		test t3 = new test();
		
		/* sum은 객체 메소드이긴 때문에 클래스 메소드인 main에서 호출하려면
		 * 객체를 생성한 후, 객체를 통해 호출해야한다.*/
		Ex3_Class_Static2 ex3= new Ex3_Class_Static2();
		System.out.println(ex3.sum(1,2));

	}
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	

}

class Test1{
	int x;
	static int count;// tes1 클래스로 만들어진 객체의 수
	
	void printX() {
		System.out.println(x);
	}
	static void printCount() {
		System.out.println(count);
	}
	public Test1() {count++;}
	
}
