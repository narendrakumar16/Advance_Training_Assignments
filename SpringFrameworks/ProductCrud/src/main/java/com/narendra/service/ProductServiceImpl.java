package com.narendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narendra.dao.ProductDao;
import com.narendra.model.Product;


		@Service
	public class ProductServiceImpl implements ProductService {

		@Autowired
		private ProductDao productDao;
		
		
		public Long addProduct(Product product) {
			
			return this.productDao.addProduct(product);
		}

		
		public List<Product> getAllProducts() {
			
			return this.productDao.getAllProducts();
		}

		
		public Product editProduct(Product product) {
			
			return this.productDao.editProduct(product);
		}

		
		public Product getProductById(Long id) {
			
			return this.productDao.getProductById(id);
		}

		
		public Product deletProduct(Long id) {
			
			return this.productDao.deleteProduct(id);
		}

	}



