package board.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="login")
@Controller
public class LogController {
	
	@RequestMapping(value="/joinPage",method=RequestMethod.GET)
	public String viewInput(Model model) {
		return "login/join";
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login() {
		System.out.println("login");;
		return "main";
	}
	
	@RequestMapping(value="/join.do",method=RequestMethod.POST)
	public String join(HttpServletRequest req,Model model) {
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
		
		System.out.println("아이디는: "+joinId+",비밀번호는: "+joinPwd);
		System.out.println("성별은: "+joinSex+",이름은: "+joinName);
		System.out.println("핸드폰번호는: "+joinHp+",메일주소는: "+joinMail);
		
		model.addAttribute("user_id", joinId);
		model.addAttribute("user_pwd", joinPwd);
		model.addAttribute("user_sex",joinSex);
		model.addAttribute("user_name",joinName);
		model.addAttribute("user_hp",joinHp);
		model.addAttribute("user_mail",joinMail);
		
		return "show";
	}

}
