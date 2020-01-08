package co.arum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.arum.dto.JobDto;

public class EmployeeDao {
	private Connection conn;
//	private PreparedStatement psmt;
	private ResultSet rs; // select구문에 결과값을 받기 위해

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	
	public EmployeeDao() { //생성될 때 드라이버 로드와 연결함
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select() {
//		JobDto dto = new JobDto();
//		String sql = "SELECT * FROM jobs";
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while(rs.next()) { //next 처음 커서는 before File next실행시 1행 행이 비어있으면 false
//				dto.setJob_id(rs.getString("job_id"));
//				dto.setJob_title(rs.getString("job_title"));
//				dto.setMax_salary(rs.getInt("max_salary"));
//				dto.setMin_salary(rs.getInt("min_salary"));
//				dto.toString();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			try {
//				if(rs != null) {
//					rs.close();
//				}
//				if(psmt != null) {
//					psmt.close();
//				}
//				if(conn != null) {
//					conn.close();
//				}
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
	}
	
}
