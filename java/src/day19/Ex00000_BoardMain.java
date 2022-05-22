package day19;

import java.util.ArrayList;
import java.util.*;

public class Ex00000_BoardMain {

	public static void main(String[] args) {
		//게시글 리스트 : 게시글들을 담을 공간
		List<Board> list = new ArrayList<Board>();
		//콘솔에서 입력받기 위한 스캐너
		Scanner scan = new Scanner(System.in);
		//프로그램종료번호
		int exitMenu = 4;
		// 종료 메뉴를 선택할 때까지
		int menu;
		
		//테스트 데이터
		list.add(new Board("일반", "일반제목", "내용1", "홍길동"));
		list.add(new Board("일반", "제목2", "내용2", "홍길동"));
		list.add(new Board("일반", "공지 제목3", "내용3", "홍길동"));
		
		
		//게시글 등록, 확인, 수정시에 임시로 사용할 변수/참조변수 
		String title, content, writer, type;
		int num, view;
		do {
			//콘솔창에 메뉴 출력
			System.out.println("메뉴");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 확인");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			
			//실행할 메뉴를 입력받음
			menu = scan.nextInt();
			
			//입력받은 메뉴에 맞는 기능을 실행
			switch(menu) {
			case 1 :
				System.out.println("게시글 정보를 입력하세요.");
				//타입입력
				System.out.print("타입 [일반, 공지] : ");
				type = scan.next();
				scan.nextLine();
				
				//제목입력
				System.out.print("제목 : ");
				title = scan.nextLine();
				
				//내용입력
				System.out.print("내용 : ");
				content = scan.nextLine();
				
				//작성자입력
				System.out.print("작성자 : ");
				writer = scan.next();
				//게시글 생성 후 저장(리스트에 생성한 게시글을 추가)
				list.add(new Board(type, title, content, writer));
				
				break;
			case 2 :
				//전체 게시글 확인
				System.out.println("번호 \t 타입    제목\t 작성자 \t 작성일 \t 조회수");
				for(Board tmp : list) {
					System.out.println(tmp);
				}
				//게시글 선택
				System.out.println("게시글 선택[나가기 : -1] : ");
				num = scan.nextInt();
				if(num>0) {
					//list에서 게시글을 가져옴(num-1번지)
					Board tmp = list.get(num-1);
					//조회수 증가
					//view = tmp.getView(); //새로만들어야함
					//tmp.setView(view+1);
					tmp.updateView(); //그래서 메소드를 새로 생성하여 조회수 증가
					//가져온 게시글의 상세 내용을 확인 : detailprint()호출
					tmp.detailPrint();
					
				}
				
				break;
			//3번 메뉴를 선택 : 게시글 수정기능
			case 3 :
				//전체게시글 확인
				System.out.println("번호 \t 타입    제목\t 작성자 \t 작성일 \t 조회수");
				for(Board tmp : list) {
					System.out.println(tmp);
				}
				//게시글 선택
				System.out.println("게시글 선택 : ");
				num = scan.nextInt();
				scan.nextLine();
				//게시글 제목입력
				System.out.print("제목 : ");
				title = scan.nextLine();
				System.out.print("내용 : ");
				content = scan.nextLine();
				//게시글 수정
				//선택한 게시글 가져옴
				Board tmp = list.get(num-1);
				//가져온 게시글을 수정 : modify를 호출
				tmp.modify(title, content);
				//list.set(num-1, tmp);
				/* List의 set을 이용 안한 이유 : 안해도 가능하기 때문에
				 * List의 get을 이용하여 객체를 가져왔을때, 가져온 객체는 원본의 주소 */
				break;
			case 4 :
				break;
			default:	
			}
			
			
			
			
		}while(menu != exitMenu);
		
		
		
		
		
		scan.close();

	}

}
