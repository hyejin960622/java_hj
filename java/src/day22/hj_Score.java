package day22;

public class hj_Score {
	
	private String name;
	private int midterm, finals, perfor, grade, term;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMidterm() {
		return midterm;
	}
	public void setMidterm(int midterm) {
		if(midterm < 0 || midterm > 100)
			new RuntimeException("중간고사 성적은 0~100사이의 정수를 입력하세요");
		this.midterm = midterm;
	}
	public int getFinals() {
		return finals;
	}
	public void setFinals(int finals) {
		if(finals < 0 || finals > 100)
			new RuntimeException("기말고사 성적은 0~100사이의 정수를 입력하세요");
		this.finals = finals;
	}
	public int getPerfor() {
		return perfor;
	}
	public void setPerfor(int perfor) {
		if(perfor < 0 || perfor > 100)
			new RuntimeException("수행평가 성적은 0~100사이의 정수를 입력하세요");
		this.perfor = perfor;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		if(grade < 1 || grade > 3)
			new RuntimeException("학년은 1~3사이의 정수를 입력하세요.");
		this.grade = grade;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		if(grade < 1 || grade > 2)
			new RuntimeException("학기은 1~2사이의 정수를 입력하세요.");
		this.term = term;
	}
	public hj_Score(int grade, int term, String name, int midterm, int finals, int perfor) {
		this.name = name;
		setMidterm(midterm);
		setFinals(finals);
		setPerfor(perfor);
		setGrade(grade);
		setTerm(term);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + term;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		hj_Score other = (hj_Score) obj;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (term != other.term)
			return false;
		return true;
	}



}
