import java.sql.*;
public class Create {
	public static void main(String args[]) {

		String msdb = "D:/upes.mdb";
		String dbURL = "jdbc:ucanaccess://D:/upes.mdb";

		Connection con;
		Statement stmt;
		String queryString;

		queryString = "create table SERVER_DATABASE " + "(IP_ADDRESS CHAR(40), " + "FILE_NAME CHAR(20))";

		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(dbURL);
			stmt = con.createStatement();
			stmt.executeUpdate(queryString);
			System.out.println("Table Created");
			con.close();

		} catch (SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println("SQLException: " + ex.getMessage());
		}
	}

}
