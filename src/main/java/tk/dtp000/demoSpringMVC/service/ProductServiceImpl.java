package tk.dtp000.demoSpringMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.dtp000.demoSpringMVC.model.Product;
import tk.dtp000.demoSpringMVC.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepository productRepository;
	
	public List<Product> findAll() {
		return this.productRepository.findAll();
	}

	public Product findById(int id) {
		return this.productRepository.findById(id);
	}

	public void store(Product product) {
		this.productRepository.store(product);
	}

	public void update(Product product) {
		this.productRepository.update(product);
	}

	public void destroy(int id) {
		this.productRepository.destroy(id);
	}

}
