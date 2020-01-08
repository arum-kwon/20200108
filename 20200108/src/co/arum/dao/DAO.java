package co.arum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.arum.dto.JobDto;

public class DAO {
	public Connection conn;

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	
	public DAO() { //생성될 때 드라이버 로드와 연결함
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
