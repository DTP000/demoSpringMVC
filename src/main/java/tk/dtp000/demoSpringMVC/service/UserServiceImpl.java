package tk.dtp000.demoSpringMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.dtp000.demoSpringMVC.model.User;
import tk.dtp000.demoSpringMVC.repository.UserRepository;

public class UserServiceImpl implements UserService{

	@Autowired
	public UserRepository userRepository;
	
	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(id);
	}

	public void store(User user) {
		this.userRepository.store(user);		
	}

	public void destroy(int id) {
		this.userRepository.destroy(id);
	}

	public void update(User user) {
		this.userRepository.update(user);
	}
	
}
