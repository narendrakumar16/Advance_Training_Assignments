package com.narendra.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.narendra.model.Product;

	
	@Repository
	public class ProductDaoImpl implements ProductDao {

		@Autowired
		private HibernateTemplate hibernateTemplate;
		
		
		@Transactional
		public Long addProduct(Product product) {
			
			return (Long) this.hibernateTemplate.save(product);
		}

		
		public List<Product> getAllProducts() {
			
			return this.hibernateTemplate.loadAll(Product.class);
		}

		
		@Transactional
		public Product editProduct(Product product) {
			
			this.hibernateTemplate.update(product);
			return product;
		}

		
		public Product getProductById(Long id) {
			
			return this.hibernateTemplate.get(Product.class, id);
		}

		
		@Transactional
		public Product deleteProduct(Long id) {
			
			Product product = this.getProductById(id);
			
			this.hibernateTemplate.delete(product);
			
			return product;
		}

		public Long addProduct(com.narendra.dao.Product product) {
			// TODO Auto-generated method stub
			return null;
		}

		public com.narendra.dao.Product editProduct(com.narendra.dao.Product product) {
			// TODO Auto-generated method stub
			return null;
		}

		public com.narendra.dao.ProductDao getProductById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		public com.narendra.dao.Product deleteProduct(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
	    
		
	}



