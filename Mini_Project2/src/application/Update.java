package application;

import java.sql.*;

public class Update {

	public static void update() {
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			String quary = "UPDATE PROJECT01 SET AGE = ?, SALARY = ? WHERE NAME = ?";
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);
			pstm.setInt(1, 17);
			pstm.setInt(2, 50);
			pstm.setString(3, "홍길동");


			int success = pstm.executeUpdate();
			if(success > 0)
				System.out.println("데이터 변경 성공");
			else
				System.out.println("데이터 변경 실패");

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}           
	}
}
	
