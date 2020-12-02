package application;

import java.sql.*;

public class Insert {

	public static void insert() {
		CRUD cr = new CRUD();
		
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
		try {
			System.out.println(cr.str);
			String quary = "INSERT INTO PROJECT01 VALUES(?, ?, ?)";
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);
			System.out.println("str전");
			System.out.println(cr.str);
			pstm.setString(1, cr.str);
			System.out.println("끝");
			pstm.setInt(2, 123);
			pstm.setInt(3, 300);
			
			int success = pstm.executeUpdate();
			if(success > 0)
				System.out.println("데이터 입력 성공");
			else
				System.out.println("데이터 입력 실패");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}

