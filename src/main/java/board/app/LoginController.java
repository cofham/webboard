package board.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.cj.protocol.Resultset;

@Controller
public class LoginController {
	
	@RequestMapping(value="/joinPage",method=RequestMethod.GET)
	public String goJoin() {
		return "login/join";
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(HttpServletRequest req) {
		
		String login_id = req.getParameter("login_id");
		String login_pwd = req.getParameter("login_pwd");
		
		DBConnect db = new DBConnect();
		int a = db.login(login_id, login_pwd);
		
		if(a==1) {
			return "success";
		}
		else if(a==0) {
			return "fail";
		}
		return "index";
	}
}
