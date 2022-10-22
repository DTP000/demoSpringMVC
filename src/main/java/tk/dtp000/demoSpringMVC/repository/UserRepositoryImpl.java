package tk.dtp000.demoSpringMVC.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tk.dtp000.demoSpringMVC.model.Product;
import tk.dtp000.demoSpringMVC.model.User;

public class UserRepositoryImpl implements UserRepository{

	private static final Map<Integer, User> users;
	private static int id;
	static {
		id = 0;
		users = new HashMap<Integer, User>();
		users.put(++id, new User(id, "dtp000", "Phan Dinh Trung", "NguyH13m", "DTP000"));
		users.put(++id, new User(id, "dtp001", "Phan Dinh Trung", "NguyH13m", "DTP001"));
		users.put(++id, new User(id, "dtp002", "Phan Dinh Trung", "NguyH13m", "DTP002"));
		users.put(++id, new User(id, "dtp003", "Phan Dinh Trung", "NguyH13m", "DTP003"));
		users.put(++id, new User(id, "dtp004", "Phan Dinh Trung", "NguyH13m", "DTP004"));
		users.put(++id, new User(id, "dtp005", "Phan Dinh Trung", "NguyH13m", "DTP005"));
		users.put(++id, new User(id, "dtp006", "Phan Dinh Trung", "NguyH13m", "DTP006"));
		users.put(++id, new User(id, "dtp007", "Phan Dinh Trung", "NguyH13m", "DTP007"));
	}

	public List<User> findAll() {
		return new ArrayList<User>(users.values());
	}

	public User findById(int id) {
		return users.get(id);
	}

	public void store(User user) {
		users.put(++id, user);
	}

	public void destroy(int id) {
		users.remove(id);
	}

	public void update(User user) {
		users.put(user.getId(), user);
	}
}
