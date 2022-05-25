package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Ex08_Lambda_Predicate {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 1, 1, 100, 90, 80, "홍길동"));
		list.add(new Student(1, 1, 2, 100, 70, 60, "임걱정"));
		list.add(new Student(1, 2, 3, 20, 50, 80, "둘리"));
		list.add(new Student(1, 2, 4, 10, 60, 30, "고길동"));
		
		
		
		System.out.println("1학년 학생들의 평균 : " + avg(list, s->s.getGrade()==1));
		System.out.println("1학년 1반 학생들의 평균 : " + avg(list, s-> s.getGrade()==1 && s.getClassNum()==1));
		System.out.println("1학년 2반 학생들의 평균 : " + avg(list, s-> s.getGrade()==1 && s.getClassNum()==2));
		System.out.println("1학년 1반 1번 학생 평균 : " + avg(list, s-> s.getGrade()==1 && s.getClassNum()==1 && s.getNum()==1));
	

	}
	public static double avg(List<Student>list, Predicate<Student> function) {
		double sum = 0;
		int count = 0;
		for(int i =0; i<list.size(); i++) {
			Student tmp = list.get(i);
			if(function.test(tmp)) {
				count++;
				sum+=tmp.getEng() + tmp.getKor() + tmp.getMath();
			}
		}
		return sum/(double)(3*count);
	}

}
