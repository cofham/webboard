package board.app;

import java.sql.*;

public class DBConnect {
	Connection conn = null;
	Statement stmt = null;
	String table;
	
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost/mydb";
	String mysqlId="root";
	String mysqlPwd="1234";
	
	public void insert(String id,String pwd,String sex,String name,String hp,String mail) {
		
		StringBuilder sb = new StringBuilder();
		String sql = sb.append("INSERT INTO member(id, pwd, sex, name, hp, mail) VALUES (")
				.append("'"+id+"'").append(", ")
				.append("'"+pwd+"'").append(", ")
				.append("'"+sex+"'").append(", ")
				.append("'"+name+"'").append(", ")
				.append("'"+hp+"'").append(", ")
				.append("'"+mail+"'").append(");")
				.toString();
		
		System.out.println(sql);
	
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(url,mysqlId,mysqlPwd);
			System.out.println("연결 성공");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : "+e);
		}
		catch(SQLException e) {
			System.out.println("SQLException : "+e);
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		finally {
			try {
				if(conn!=null &&!conn.isClosed()) {
					conn.close();
				}
			}
			catch(SQLException e) {
				System.out.println("SQLException : "+e);
			}
		}
		
	}
}
