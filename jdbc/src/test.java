import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		emp ep = new emp();
		ep.setEmpno(0);
		ep.setEmpname("路通");
		ep.setJob("编程");
		ep.setSal(1000);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs=null;
		StringBuffer sb = new StringBuffer();
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
			stmt = conn.createStatement();
			//String sql = "update emp1 set Empname='产品2',epmsal=100 where Empno=1";
			String sql="select username from usertable";
			rs=stmt.executeQuery(sql);
		
			System.out.println("请输入用户名：");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			while(rs.next()){
				
				System.out.println(rs.getString("username"));
				if(str.equals(rs.getString("username"))){
					System.out.println("名字相同");
				}
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}if(stmt!=null){
					try {
						stmt.close();
					} catch (SQLException e) {
					
						e.printStackTrace();
					}if(rs!=null){
						try {
							rs.close();
						} catch (SQLException e) {
						
							e.printStackTrace();
						}
					}
				}
			}
				
		}
		System.out.println("已经存入"+rs.toString());

	}

}
