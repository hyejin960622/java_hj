package day12;

public class Ex4_Final {

	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.print();

	}

}
//String은 final클래스 이기 때문에 상속이 불가능
//class KoreanString extends String{}

class FinalTest{
	private final int max = 30;
	public final void print() {
		//max = 20; // 수정할수 없다. max는 final이 붙어 있기 때문에 
		System.out.println(max);
	}
}
class FinalTestChild extends FinalTest{
	//print()를 오버라이드 할수 없다 => print에 final이 붙어 있기 때문에
	//public final void print() {}
}

