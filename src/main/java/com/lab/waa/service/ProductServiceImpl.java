package com.lab.waa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.waa.model.Product;
import com.lab.waa.repository.ProdcutRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	ProdcutRepository productRepository;

	@Override
	public boolean addProduct(Product product) {
		
		
		return productRepository.addProduct(product);
		
		
	}


	public List<Product> getAllProducts() {
		
		return (List<Product>) productRepository.getAllProducts();
	}


	@Override
	public void deleteProductById(String productId) {
		
		productRepository.deleteProductById(productId);
	}


	@Override
	public Product editProductById(String productId) {
		
				
		return productRepository.editProductById(productId);
		
		
	}


	@Override
	public boolean updateProduct(Product product) {
		
		return productRepository.updateProduct(product);
	}

}
