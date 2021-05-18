package board.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DBController {
	
	
	@RequestMapping(value="/selectDB.do")
	public String Select() {
		
		
		return "list";
	}
	
	@RequestMapping(value="/insertDB.do",method=RequestMethod.POST)
	public String Insert(HttpServletRequest req) {
		
		String joinId = req.getParameter("join_id");
		String joinPwd = req.getParameter("join_pwd");
		String joinSex = req.getParameter("join_sex");
		String joinName= req.getParameter("join_name");
		String joinHp_1 = req.getParameter("join_hp_1");
		String joinHp_2 = req.getParameter("join_hp_2");
		String joinHp_3 = req.getParameter("join_hp_3");
		String joinHp = joinHp_1 + joinHp_2 + joinHp_3;
		String joinMail_1 = req.getParameter("join_mail_1");
		String joinMail_2 = req.getParameter("join_mail_2");
		String joinMail = joinMail_1 + "@"+joinMail_2;
		
		DBConnect db = new DBConnect();
		db.insert(joinId, joinPwd, joinSex, joinName, joinHp, joinMail);
		
		return "index";
	}
}
