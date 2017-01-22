package com.lab.waa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lab.waa.model.Product;

@Repository
public class ProductRepositoryImpl implements ProdcutRepository {

	private List<Product> listOfProduct = new ArrayList<>();

	@Override
	public boolean addProduct(Product product) {

		if (listOfProduct.add(product)) {
			System.out.println(product);

			return true;
		}

		return false;

	}

	@Override
	public List<Product> getAllProducts() {
		System.out.println("ok");
		System.out.println(listOfProduct.size());
		return listOfProduct;
	}

	public Product getProductById(String productId) {

		for (Product product : listOfProduct) {
			if (product.getProductId().equals(productId.trim())) {
				return product;
			}
		}

		return null;

	}

	@Override
	public void deleteProductById(String productId) {

		/*
		 * for (Product product : listOfProduct) {
		 * if(product.getProductId().equals(productId.trim())) {
		 * listOfProduct.remove(product); }
		 * 
		 * }
		 */

		listOfProduct.remove(getProductById(productId));

	}

	@Override
	public Product editProductById(String productId) {

		return getProductById(productId);
	}

	@Override
	public boolean updateProduct(Product product) {
	
		int index = listOfProduct.indexOf(product);
		if(listOfProduct.set(index, product) != null){
			
			return true;
			
		}
		return false;
	}

}
