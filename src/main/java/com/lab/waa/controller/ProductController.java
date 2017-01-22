package com.lab.waa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lab.waa.model.Product;
import com.lab.waa.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/")
	public String getHome(Product product) {

		return "product";
	}
	
	
	
	
	@RequestMapping(value = "/product")
	public String addProduct(Product product) {

		return "product";
	}
	

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String getProductForm(@ModelAttribute("product")  Product product, Model model) {
		
		

		if (productService.addProduct(product)) {
			
			

			return "redirect:productList";

		} else {

			return "product";
		}

	}
	
	
	
	@RequestMapping(value = "/productList")
	public String getProductList( Model model) {
		
		model.addAttribute("products", productService.getAllProducts());
		
		return "productList";
	
	}
	
	
	
	@RequestMapping(value = "/delete/{productId}")
	public String deleteProductById(@PathVariable String productId, Model model){
		
		productService.deleteProductById(productId);
		//model.addAttribute("products", productService.getAllProducts());
		return "redirect:/productList";
		
		
	}
	
	
	
	@RequestMapping(value = "/edit/{productId}")
	public String editProductById(@PathVariable String productId, Model model){
		
		
		model.addAttribute("product", productService.editProductById(productId));
		
		return "edit_product";
		
	}
	
	
	@RequestMapping(value = "/edit/{productId}", method = RequestMethod.POST)
	public String updateProductById(@ModelAttribute("product")  Product product, Model model){
		
		if(productService.updateProduct(product)){
			return "redirect:/productList";
		}
		return "edit_product";
		
		
		
	}
	
	

}
