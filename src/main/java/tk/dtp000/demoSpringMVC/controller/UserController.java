package tk.dtp000.demoSpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import tk.dtp000.demoSpringMVC.model.User;
import tk.dtp000.demoSpringMVC.service.UserService;

@Controller
public class UserController {

	@Autowired UserService userService;
	
	@GetMapping("/users")
	public ModelAndView list() {
		List<User> users = this.userService.findAll();
		ModelAndView modelAndView = new ModelAndView("user/list");
		modelAndView.addObject("users", users);
		return modelAndView;
	}
	
	@GetMapping(value = "/user/{userId}")
	public ModelAndView viewUser(@PathVariable Integer userId) {
		User user = this.userService.findById(userId);
		ModelAndView modelAndView = new ModelAndView("user/detail");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	
	@GetMapping(value = "/user/new")
	public ModelAndView showNewUser() {
		ModelAndView modelAndView = new ModelAndView("user/create");
        modelAndView.addObject("user", new User());
        return modelAndView;
	}
	
	@PostMapping("/user/new")
    public ModelAndView createUser(@ModelAttribute("user") User user){

        this.userService.store(user);

        ModelAndView modelAndView = new ModelAndView("user/create");
        modelAndView.addObject("user", user);
        modelAndView.addObject("message", "New user was created");
        return modelAndView;
    }
	
	@PostMapping(value = "/user/{userId}/update")
	public String updateUser(@PathVariable Integer userId, @ModelAttribute("user") User user) {
		user.setId(userId);
		this.userService.update(user);
		return "redirect:/user/" + userId;
	}
	
	@PostMapping(value = "/user/{userId}/delete")
	public String deleteProduct(@PathVariable Integer userId) {
		this.userService.destroy(userId);
		return "redirect:/users";
	}
	
}
