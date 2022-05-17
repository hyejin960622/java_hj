package hw;

public class Post {
	
	private String writer;
	private String date;
	private String title;
	
	
	public void modify(String writer, String date, String title) {
		if(date != null) {
			this.date = date;
		}
		if(writer != null) {
			this.writer = writer;
		}
		if(title != null) {
			this.title = title;
		}
	}
	

	
	@Override
	public String toString() {
		return "게시글 [작성자 = " + writer + ", 날짜 = " + date + ", 제목 = " + title + "]";
	}




	public Post(String writer, String date, String title) {
		this.writer = writer;
		this.date = date;
		this.title = title;
	}




	public String getWriter() {
		return writer;
	}




	public void setWriter(String writer) {
		this.writer = writer;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
