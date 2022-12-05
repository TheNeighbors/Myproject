package testMySQl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.a.result.ResultsetRowsStatic;

public class JavaData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String input = sc.nextLine();
		selectData();
	}

	public static void selectData() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root",
					"root");
			PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM books "); // WHERE idbooks = ?
			// pstmt.setString(1, input);
			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				// resultSet.next();
				// String t = resultSet.getString("bookName");
				System.out.println(resultSet.getString("bookName") + resultSet.getString("bookDescription"));
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
