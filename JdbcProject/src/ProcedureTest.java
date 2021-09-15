import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProcedureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver registered...");
			Connection conn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:XE","system", "Anupama@01");
			System.out.println("Connection established...");
			System.out.println(conn);
			
			PreparedStatement preparedStatement= conn.prepareStatement("select * from emp where job=?");
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);

			Scanner scan3 = new Scanner(System.in);


	}

}
