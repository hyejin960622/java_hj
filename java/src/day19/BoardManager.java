package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day14.ConsoleProgram;




public class BoardManager implements ConsoleProgram{
	private Scanner scan;
	private int exitMenu = 4;
	private List<Board> list;
	


	public BoardManager(Scanner scan) {
		this.scan =scan;
		list = new ArrayList<Board>();
		
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("=========메뉴=========");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 확인");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = scan.nextInt();
		System.out.println("=====================");
		
		return menu;
	}

	@Override
	public void excute(int menu) {
		
		switch(menu) {
		case 1 : 
			Board bd = inputBoard();
			insertBoard(bd);
			
			break;
		case 2 : 
			printBoard();
			detailBoard();
			
			break;
		case 3 : 
			printBoard();
			modifyBoard();
			break;
		case 4 : 
			break;
		default :	
			System.out.println("잘못된 메뉴입니다.");
			System.out.println("=====================");	
		}
		
	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(scan);
			excute(menu);
		}while(menu != exitMenu);	
		System.out.println("게시판 프로그램이 종료되었습니다.");
		System.out.println("=====================");
		
		
	}
	private Board inputBoard() {
		System.out.print("공지/일반을 선택하세요 : ");
		String type = scan.next();
		scan.nextLine();
		
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String content = scan.nextLine();
		System.out.print("작성자 : ");
		String writer = scan.next();
		return new Board(type, title, content, writer);
		
	}
	
	private void insertBoard(Board bd) {
		if(bd ==null) {
			return;
		}
		list.add(bd);
		
		
	}
	
	private void printBoard() {
		if(list.size() == 0) {
			System.out.println("게시글이 없습니다.");
			return;
		}
		System.out.println("--------------------");
		for(Board tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("---------------------");
	}
	
	private void detailBoard() {
		System.out.println("게시글 상세 내용을 보려면 해당 게시글 번호를 선택하고 아니면 나가기(-1)를 선택하세요.");
		int num = scan.nextInt();
		if(num == -1) {
			System.out.println("나가기");
			return;
		}else {
			Board tmp = list.get(num-1);
			tmp.updateView();
			tmp.detailPrint();
		}
	}
	
	
	private Board SearchBoard() {
		System.out.println("수정할 게시글 번호를 검색하세요.");
		System.out.println("게시글 번호 입력 : ");
		int num = scan.nextInt();
	// 입력한 게시글 번호와 일치하는 게시글 불러오기 어떻게,,,?
		for(int i = 0; i<list.size(); i++) {
			if(num == i+1) {
				System.out.println(list.get(num-1));
			}
		}
		
		return null;		
	}

	private void modifyBoard() {
		System.out.println("수정할 게시글 번호 선택 : ");
		int num = scan.nextInt();
		scan.nextLine();
		for(Board tmp : list) {
			System.out.println(tmp);
		}
		//게시글 제목입력
		System.out.print("수정할 제목 : ");
		String title = scan.nextLine();
		System.out.print("수정할 내용 : ");
		String content = scan.nextLine();
		//게시글 수정
		//선택한 게시글 가져옴
		Board tmp = list.get(num-1);
		//가져온 게시글을 수정 : modify를 호출
		tmp.modify(title, content);
		}
	
	
}
