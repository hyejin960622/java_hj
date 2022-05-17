package hw;

import java.util.Scanner;

public class BoardManager implements ConsoleProgram{
	
	private Scanner scan;
	private Board board;
	private final int exitMenu = 4;
	
	
	 public BoardManager(Scanner scan) {
		this.scan = scan;
		board = new Board();
		Post post = new Post("혜진", "2022-05-15", "안녕");
		board.insertPost(post);
	}


	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("=========메뉴=========");
		System.out.println("1. 게시글 등록");
		//게시글을 확인하면 글 내용이 보여야 하나?
		//그렇다면 게시글 등록할때 내용도 추가해야하나?
		//조회수증가 어떻게?
		//게시글을 확인하면 그 게시글 카운트가 증가?
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
		case 1:
			if(insertBoard()) {
				System.out.println("내역을 추가했습니다.");
			}else {
				System.out.println("내역 추가에 실패했습니다.");
			}
			System.out.println("=====================");
			break;
		case 2:
			board.readPosts();
			break;
		case 3:
			if(modifyBoard()) {
				System.out.println("수정에 성공했습니다.");
			}else {
				System.out.println("수정에 실패했습니다.");
			}
			System.out.println("=====================");
			break;
		case 4:
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
	
	//(공지/일반) 구분을 어떻게해야하는지 서브메뉴 만들듯이 하면되는건지,,,
	//공지글이면 맨위에 보여야하는건지?
	
	public boolean insertBoard() {
		System.out.print("작정자 : ");
		String writer = scan.next();
		System.out.print("날짜 : ");
		String date = scan.next();
		System.out.print("제목 : ");
		String title = scan.next();
		
		Post post = new Post(writer, date, title);
		return board.insertPost(post);
	}
	
	public boolean modifyBoard() {
		board.readPosts();
		System.out.print("수정할 항목(정수) : ");
		int modIndex = scan.nextInt();
		System.out.println("=====================");
		
		Post tmp = board.getPost(modIndex-1);
		if(tmp != null) {
			System.out.println(modIndex+". " + tmp);
		}else {
			return false;
		}
		System.out.println("=====================");
		System.out.print("선택한 내역은 위 내역입니다. 수정하시겠습니까?[예:true/아니오:false] : ");
		boolean ok = scan.nextBoolean();
		if(!ok) {
			return false;
		}
		
		System.out.print("작성자를 수정하겠습니까?[예:true/아니오:false] : ");
		ok = scan.nextBoolean();
		String writer2 = null;
		if(ok) {
			System.out.print("작성자 : ");
			writer2 = scan.next();
		}
		System.out.print("날짜를 수정하겠습니까?[예:true/아니오:false] : ");
		ok = scan.nextBoolean();
		String date2 = null;
		if(ok) {
			System.out.print("작성자 : ");
			date2 = scan.next();
		}
		System.out.print("제목을 수정하겠습니까?[예:true/아니오:false] : ");
		ok = scan.nextBoolean();
		String title2 = null;
		if(ok) {
			System.out.print("제목 : ");
			title2 = scan.next();
		}
		
		return board.modifyPost(modIndex-1, writer2, date2, title2);

	}
}
