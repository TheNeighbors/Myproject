package testMySQl;

import java.sql.*;

public class Test {

	public static void main(String[] args) {
		selectData();
	}

	public static void selectData() {
		Connection connect = null;

		try {

//			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/7-11" + "?user=root&password=root");
			/*
			 * if(connect != null){ System.out.println("Database Connected."); } else {
			 * System.out.println("Database Connect Failed."); }
			 */
			PreparedStatement pstmt = connect.prepareStatement("SELECT * FROM goods   ");
			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				// resultSet.next();
				System.out.println(resultSet.getString("idgoods") + " : " + resultSet.getString("goodsName"));
			}
			connect.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Close
		/*
		 * try { if(connect != null) {connect.close();} } catch (SQLException e) {}
		 */
	}

}
