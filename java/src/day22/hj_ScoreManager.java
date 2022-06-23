package day22;

import java.util.*;

import day14.ConsoleProgram;

public class hj_ScoreManager implements ConsoleProgram{

	private Scanner scan;
	private int exitMenu = 4;
	

	public hj_ScoreManager(Scanner scan) {
		if(scan == null)
			scan = new Scanner(System.in);
		this.scan = scan;
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("메뉴");
		System.out.println("1. 성적 추가");
		System.out.println("2. 성적 확인");
		System.out.println("3. 성적 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
		
		int menu = scan.nextInt();
		return menu;
	}

	@Override
	public void excute(int menu) {
		
		switch(menu) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			modifyScore();
			break;
		case 4:
			break;
		default :	
			System.out.println("잘못된 메뉴입니다.");	
		}
		
	}

	private void modifyScore() {
		
		
	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(scan);
			excute(menu);
		}while(menu != exitMenu);	
		System.out.println("프로그램이 종료되었습니다.");
		
	}
	
	

}
