package day13;

public interface Controller {
	
	int MIN = 19; //public static final이 앞에 자동으로 붙는다.- 상수
	void run(); //public abstract 가 앞에 자동으로 붙는다.
	void stop();
	void print();
	default void test() {}

}
