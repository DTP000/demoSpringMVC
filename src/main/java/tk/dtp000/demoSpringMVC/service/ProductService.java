package tk.dtp000.demoSpringMVC.service;

import java.util.List;

import tk.dtp000.demoSpringMVC.model.Product;

public interface ProductService {
	List<Product> findAll();
	
	Product findById(int id);
	
	void store(Product product);
	
	void update(Product product);
	
	void destroy(int id);
}
