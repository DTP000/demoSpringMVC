package tk.dtp000.demoSpringMVC.repository;
import java.util.List;

import tk.dtp000.demoSpringMVC.model.Product;

public interface ProductRepository {

	List<Product> findAll();
	
	Product findById(int id);
	
	void store(Product product);
	
	void destroy(int id);
	
	void update(Product product);
}
