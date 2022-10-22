package tk.dtp000.demoSpringMVC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;import tk.dtp000.demoSpringMVC.repository.ProductRepository;
import tk.dtp000.demoSpringMVC.repository.ProductRepositoryImpl;
import tk.dtp000.demoSpringMVC.service.ProductService;
import tk.dtp000.demoSpringMVC.service.ProductServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
	"tk.dtp000.demoSpringMVC"
})
public class ApplicationConfig {
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public ProductService productService() {
		return (ProductService) new ProductServiceImpl();
	}
	
	@Bean
	public ProductRepository productRepository() {
		return new ProductRepositoryImpl();
	}
}
