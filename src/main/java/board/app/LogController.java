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
		
		System.out.println("아이디는: "+joinId+",비밀번호는: "+joinPwd);
		
		model.addAttribute("user_id", joinId);
		model.addAttribute("user_pwd", joinPwd);
		
		return "show";
	}

}
