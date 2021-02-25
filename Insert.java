import java.sql.*;
public class Insert {
	public static void main(String[] args) {

		String msAccDB = "D:/upes.mdb";
		String dbURL = "jdbc:ucanaccess://" + msAccDB;
		Connection con;
		Statement stmt;

		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		String IP = "First";
		String FILE = "FILE_ONE";

		try {
			con = DriverManager.getConnection(dbURL);
			stmt = con.createStatement();
			int insert_count = stmt
					.executeUpdate("INSERT INTO SERVER_DATABASE (IP_ADDRESS, FILE_NAME) "
							+ "VALUES('" + IP + "','" + FILE + "')");

			System.out.println("Inserted new rows = " + insert_count);
			System.out.println("Table Created");
			con.close();

		} catch (SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println("SQLException: " + ex.getMessage());
		}

	}
}
