package day16;

import java.util.Scanner;

public class Ex3_Class_ForName {

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("java.util.Scanner");
			System.out.println(c);
			c = Class.forName("day12.Car");
			System.out.println(c);
			//newInstance() : 자바 9 버전이후에 없어짐
			//Car car = (Car)c.newInstance();
			
			Scanner scan = (Scanner)c.newInstance();
			c = Class.forName("java.util.Scanner1");
			System.out.println(c);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
