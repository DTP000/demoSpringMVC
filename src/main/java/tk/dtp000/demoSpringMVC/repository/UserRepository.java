package tk.dtp000.demoSpringMVC.repository;

import java.util.List;

import tk.dtp000.demoSpringMVC.model.Product;
import tk.dtp000.demoSpringMVC.model.User;

public interface UserRepository {

	List<User> findAll();
	
	User findById(int id);
	
	void store(User user);
	
	void destroy(int id);
	
	void update(User user);
}
