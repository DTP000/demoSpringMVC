package tk.dtp000.demoSpringMVC.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tk.dtp000.demoSpringMVC.model.Product;

public class ProductRepositoryImpl implements ProductRepository{

	private static final Map<Integer, Product> products;
	
	static {
		products = new HashMap<Integer, Product>();
		products.put(1, new Product(1, "Mạch Loa Vi Tính TDA2030 Liền Nguồn Xung 2.1 BTL F560X Giá Rẻ", 205000));
		products.put(2, new Product(2, "Mạch TDA2050 OR TDA2030 2.1 Nhôm Dày Cho Loa Vi Tính", 165000));
		products.put(3, new Product(3, "Mạch TDA2050 OR TDA2030A 2.1 3 IC Chuyên Dụng Loa Vi Tính", 165000));
		products.put(4, new Product(4, "Mạch TDA2030A 2.1 Liền Nguồn - Hạt Rẻ", 120000));
		products.put(5, new Product(5, "Mạch Công Suất 32 Sò TOSHIBA Điện ÁP Cao 2 Lớp FR4", 450000));
		products.put(6, new Product(6, "Mạch Loa Vi Tính TDA2030A 2.1 BTL Đỏ Volume Rời 18W x 18W x 36W", 289000));
		products.put(7, new Product(7, "Mạch TDA 2030 2.1 BTL Siêu Mạnh Cho Loa Vi Tính", 219000));
		products.put(8, new Product(8, "Mạch Nguồn 4 Tụ FR4 Không Bảo Vệ Full Nguồn Phụ", 125000));
		products.put(9, new Product(9, "Mạch 8 Sò Sanken Stereo Hifi Chất Lượng Cao 2 Kênh", 450000));
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(products.values());
	}

	public Product findById(int id) {
		return products.get(id);
	}

	public void store(Product product) {
		products.put(product.getId(), product);
	}

	public void destroy(int id) {
		products.remove(id);
	}

	public void update(Product product) {
		products.put(product.getId(), product);
	}

	
}
