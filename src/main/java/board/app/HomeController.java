package board.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	
	@RequestMapping("/aaa")
	public String aaa() {
		return "aaa";
	}
}