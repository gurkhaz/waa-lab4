package com.lab.waa.service;

import com.lab.waa.model.Product;

public interface ProductService {
	
	public boolean addProduct(Product product);
	
	public Object getAllProducts();

	public void deleteProductById(String productId);

	public Product editProductById(String productId);

	public boolean updateProduct(Product product);

}
