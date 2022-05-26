package day23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_UpDownGame {

	public static <game> void main(String[] args) {
		/* 1~100사이의 랜덤한 수를 맞추는 up down 게임 프로그램을 작성하세요.
		 * - 기록을 저장하는 기능을 추가
		 * - 기록은 최대 5등까지
		 * - 5등이내의 기록은 이름을 기록하여 저장
		 * - 한 사람이 여러 기록을 가질 수 있다
		 * - 같은 기록인 경우 기록된 순서대로
		 * - 잘못된 정수를 입력해도 시도한걸로 인정
		 * 
		 * 
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * */
		
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 100;
		List<Record> list =  new ArrayList<Record>();
		int menu ;
		
		
		
		
		do {
			System.out.println("1. 플레이");
			System.out.println("2. 기록확인");
			System.out.println("3. 종료");
			System.out.println("=================");
			System.out.print("메뉴 선택: ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				int r = (int)(Math.random() * (max-min+1) + min);
				int count =0; //시도 횟수
				System.out.println("랜덤수가 생성되었습니다. : " + r);
			
	
				while(true) {
					System.out.print("1~100사이의 정수를 입력하세요 : ");
					int num = scan.nextInt(); 
					count++;
					if(num < 1 || num > 100) {
						System.out.println("범위가 아닙니다. 다시 입력하세요.");
					}
					else if(num == r) { 
						System.out.println("정답");
						break;
					}else if(num > r) {
						System.out.println("down");
					}else {
						System.out.println("up");
					}
				}
				//내 기록 확인
				//새 기록이면(5등이내이면)
				//이름 입력하고 저장
				int i;
				for(i =0; i <list.size(); i++) {
					if(list.get(i).getCount() > count) {
						break;
					}
				}
				//list.size() <5 저장된 기록이 5개 미만
				//i < list.size() : 저장된 기록이 5개 이상 중에 지금 플레이한 
				//					기록이 등수에 포함될 때
				//					위에서 break가 동작하면 i는 list.size()보다 작고
				//					break가 동작 안하면 i는 list.size()
				if(list.size() < 5 || i < list.size()) {
					System.out.println("새로운 기록이 달성됐습니다. 이름을 입력하세요");
					System.out.print("이름 : ");
					list.add(i, new Record(count, scan.next()));
					
					if(list.size() > 5) {
						list.remove(5);
					}
				}
				break;
			case 2:
				//기록확인
				for(int j = 0; j <list.size(); j++) {
					System.out.println(j+1 + "." + list.get(j));
				}
				
				
				break;
			case 3: 
				System.out.println("게임을 종료합니다."); 
				break;
			default:
				System.out.println("잘못 선택하셨습니다. 메뉴를 다시 골라주세요.");
			}
		}while(menu != 3);	
		
		
		
		scan.close();
		
		
	}
	
	


}
class Record{
	private int count;
	private String name;
	
	public Record(int count, String name) {
		this.count = count;
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "[" +  name + ":" + count + "]";
	}
	
	
	
	
	
	
}
