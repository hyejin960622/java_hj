package hw;

public class Board {
	public static final int MAX = 100;
	private Post posts [] = new Post[MAX];
	private int count;
	
	public void readPosts() {
		if(count == 0) {
			System.out.println("입력된 내역이 없습니다.");
			return;
		}
	
		for(int i = 0; i<count; i++) {
			System.out.println(i+1+". "+ posts[i]);
			
		}
	}
	
	public boolean insertPost(Post post) {
		
		if(count == MAX) {
			return false;
		}
		
		if(post == null) {
			return false;
		}
		posts[count++] = post;
		return true;
	}
		
	
	public boolean modifyPost(int modIndex, String writer,  String date, String title) {
		if(modIndex >= count || modIndex < 0) {
			return false;
		}
		posts[modIndex].modify(writer, date, title);
		return true;
	
	}
	public Post getPost(int index) {
		if(index < 0 || index >= count) {
			return null;
		}
		return posts[index];
	}

}
