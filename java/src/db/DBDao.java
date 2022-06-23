package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBDao {
	Connection con;
	

	public DBDao(Connection con) {
		this.con = con;
	}
	public List<StudentVO> selectStudent(){
		if(con == null)
			throw new RuntimeException("DB와 연결에 않아 실행할수 없습니다.");
		String sql = "select * from student";
		List<StudentVO> list = new ArrayList<StudentVO>();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				 ResultSet rs = ps.executeQuery(sql);
		         while(rs.next()) {
		            String st_num = rs.getString("st_num");
		            String st_name = rs.getString("st_name");
		            String st_pr_num = rs.getString("st_pr_num");
		            StudentVO std = new StudentVO(st_num, st_name, st_pr_num);
		            list.add(std);
		            System.out.println(std);
		         }

			} catch (SQLException e) {
				e.printStackTrace();
			}
		return list;
	}
	public int insertStudent(String st_num, String st_name, String st_pr_num) {
		if(con == null)
			throw new RuntimeException("DB와 연결에 않아 실행할수 없습니다.");
		String sql = "insert into student(st_num, st_name, st_pr_num) values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, st_num);
			ps.setString(2, st_name);
			ps.setString(3, st_pr_num);
			
			int res = ps.executeUpdate();
			return res;
	    
		} catch (SQLException e) {
			return -1;
		}
		
	}
	
	public int updateStudentName(String st_num, String st_name) {
		if(con == null)
			throw new RuntimeException("DB와 연결에 않아 실행할수 없습니다.");
		String sql = "update student set st_name = ? where st_num = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, st_name);
			ps.setString(2, st_num);
			
			int res = ps.executeUpdate();
			return res;
	    
		} catch (SQLException e) {
			return -1;
		}
		
	
	}
}
