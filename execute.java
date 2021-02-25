import java.sql.*;
public class execute {
public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		String msAccDB = "D:/upes.mdb";
        String dbURL = "jdbc:ucanaccess://"+ msAccDB; 
        
		
		// Load the driver (registers itself)
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
		Connection c = DriverManager.getConnection(dbURL);
		Statement s = c.createStatement();

		boolean b = s.execute("SELECT * FROM SERVER_DATABASE ");

		System.out.println("Type of SQL is = " + b);
		
		ResultSet r = s.getResultSet(); 		
		
		while (r.next()) {
			System.out.print(r.getString("IP_ADDRESS"));
			System.out.print("            ");
			System.out.println(r.getString("FILE_NAME"));
			
		}
		
		r.close();
		s.close();
		c.close();
	}
}
