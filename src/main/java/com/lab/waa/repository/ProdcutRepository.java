package com.lab.waa.repository;

import java.util.List;

import com.lab.waa.model.Product;

public interface ProdcutRepository {

	public boolean addProduct(Product product);

	public List<Product> getAllProducts();

	public void deleteProductById(String productId);

	public Product editProductById(String productId);

	public boolean updateProduct(Product product);

}
