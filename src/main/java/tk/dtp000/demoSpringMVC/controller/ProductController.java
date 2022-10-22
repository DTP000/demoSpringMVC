package tk.dtp000.demoSpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tk.dtp000.demoSpringMVC.model.Product;
import tk.dtp000.demoSpringMVC.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired ProductService productService;
	
	@GetMapping("/products")
	public ModelAndView list() {
		List<Product> products = this.productService.findAll();
		ModelAndView modelAndView = new ModelAndView("product/list");
		modelAndView.addObject("products", products);
		return modelAndView;
	}
	
	@GetMapping(value = "/product/{productId}")
	public ModelAndView viewProduct(@PathVariable Integer productId) {
		Product product = this.productService.findById(productId);
		ModelAndView modelAndView = new ModelAndView("product/detail");
		modelAndView.addObject("product", product);
		return modelAndView;
	}
	
//	@GetMapping(value = "/product")
//    public ModelAndView view(@RequestParam("id") Integer productId){
//        Product product = this.productService.findById(productId);
//        ModelAndView modelAndView = new ModelAndView("product/detail");
//        modelAndView.addObject("product", product);
//        return modelAndView;
//    }
	
	@GetMapping(value = "/product/new")
	public ModelAndView showNewProduct() {
		ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
	}
	
	@PostMapping("/product/new")
    public ModelAndView createProduct(@ModelAttribute("product") Product product){
        int randomId = (int)(Math.random() * 10000);
        product.setId(randomId);//For demo purpose only

        this.productService.store(product);

        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "New product was created");
        return modelAndView;
    }
	
	@PostMapping(value = "/product/{productId}/update")
	public ModelAndView updateProduct(@PathVariable Integer productId, @ModelAttribute("product") Product product) {
		product.setId(productId);
		this.productService.update(product);
		ModelAndView modelAndView = new ModelAndView("product/detail");
		modelAndView.addObject("product", product);
        modelAndView.addObject("message", "Update product success");
		return modelAndView;
	}
	
	@PostMapping(value = "/product/{productId}/delete")
	public ModelAndView deleteProduct(@PathVariable Integer productId) {
		this.productService.destroy(productId);
		List<Product> products = this.productService.findAll();
		ModelAndView modelAndView = new ModelAndView("product/list");
		modelAndView.addObject("products", products);
		return modelAndView;
	}
}
