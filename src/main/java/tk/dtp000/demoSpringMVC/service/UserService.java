package tk.dtp000.demoSpringMVC.service;

import java.util.List;

import tk.dtp000.demoSpringMVC.model.User;

public interface UserService {
	List<User> findAll();
	
	User findById(int id);
	
	void store(User user);
	
	void destroy(int id);
	
	void update(User user);
}
