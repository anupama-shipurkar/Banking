import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver registered...");
			Connection conn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:XE","system", "Anupama@01");
			System.out.println("Connection established...");
			System.out.println(conn);
			Statement statement = conn.createStatement();
			System.out.println("Statement created : "+statement);

			PreparedStatement preparedStatement= conn.prepareStatement("insert into emp values ?,?,?,?,?,?,?,?");
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			Scanner scan4 = new Scanner(System.in);
			Scanner scan5 = new Scanner(System.in);
			Scanner scan6 = new Scanner(System.in);
			Scanner scan7 = new Scanner(System.in);
			Scanner scan8 = new Scanner(System.in);
			Scanner scan9 = new Scanner(System.in);
			Scanner scan10 = new Scanner(System.in);
			
			System.out.println("Enter employee number : ");
			int empno = scan1.nextInt();
			
			System.out.println("Enter employee name   : ");
			String empName = scan2.nextLine();
			
			System.out.println("Enter employee job    : ");
			String empJob = scan3.nextLine();
			
			System.out.println("Enter employee manager: ");
			int manager= scan4.nextInt();
			
			
			System.out.println("Enter employee Hiring year  : ");
			int year = scan5.nextInt();
			
			System.out.println("Enter employee Hiring month : ");
			int month = scan6.nextInt();
			
			System.out.println("Enter employee Hiring day   : ");
			int day = scan7.nextInt();
			
			java.util.Date date= new java.util.Date(year,month,day);
			
			java.sql.Date hiringDate = new java.sql.Date(date.getTime());
			
			System.out.println("Enter employee salary : ");
			int salary = scan8.nextInt();
			
			System.out.println("Enter employee comm   : ");
			int comm = scan9.nextInt();
			
			System.out.println("Enter employee deptno : ");
			int deptno = scan10.nextInt();
			
			preparedStatement.setInt(1, empno ); 
			preparedStatement.setString(2, empName);
			preparedStatement.setString(3, empJob);
			preparedStatement.setInt(4, manager );
			preparedStatement.setDate(5, hiringDate);
			preparedStatement.setInt(6, salary);
			preparedStatement.setInt(7, comm);
			preparedStatement.setInt(8, deptno );
			
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows+" Rows created ");
		
			preparedStatement.close();
			conn.close();
			System.out.println("DB resources are closed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	