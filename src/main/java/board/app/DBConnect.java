package board.app;

import java.sql.*;
import java.util.ArrayList;

import org.springframework.ui.Model;

public class DBConnect {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost/mydb";
	String mysqlId="root";
	String mysqlPwd="1234";
	
	public void select(Model model){
		String sql = "SELECT id, pwd, sex, name, hp, mail FROM member;" ;
		System.out.println(sql);
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(url,mysqlId,mysqlPwd);
			System.out.println("연결 성공");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
			
			while(rs.next()) {
				MemberDTO memberdto = new MemberDTO();
				memberdto.setId(rs.getString("id"));
				memberdto.setPwd(rs.getString("pwd"));
				memberdto.setSex(rs.getString("sex"));				
				memberdto.setName(rs.getString("name"));
				memberdto.setHp(rs.getString("hp"));
				memberdto.setMail(rs.getString("mail"));
				
				list.add(memberdto);
				model.addAttribute("memberlist",list);
			}
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getId());
				System.out.println(list.get(i).getPwd());
				System.out.println(list.get(i).getSex());
				System.out.println(list.get(i).getName());
				System.out.println(list.get(i).getHp());
				System.out.println(list.get(i).getMail());
			}
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
