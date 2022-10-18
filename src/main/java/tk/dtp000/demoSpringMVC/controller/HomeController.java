package tk.dtp000.demoSpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.dtp000.demoSpringMVC.model.User;
@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/user")
	public String user(Model model) {
		User u = new User();
		u.setFullName("abcd chi do");
		model.addAttribute("user", u);
		return "user";
	}
}
