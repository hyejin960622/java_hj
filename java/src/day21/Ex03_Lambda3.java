package day21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03_Lambda3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(100);
		list.add(36);
		list.add(20);
		
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				return a-b;
			}
			
		});
		//위아래 동일한 코드 
		list.sort((Integer a, Integer b)-> a-b);
		
		
		System.out.println(list);
	}

}
