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
			// TODO Auto-generated method stub
			return (Long) this.hibernateTemplate.save(product);

		}

		
		public List<Product> getAllProducts() {
			// TODO Auto-generated method stub
			return (List<Product>) this.hibernateTemplate.loadAll(Product.class);

		}

		@Transactional
		public Product editProduct(Product product) {
			// TODO Auto-generated method stub
			this.hibernateTemplate.update(product);
			return product;
		
		}

		
		public Product getProductById(Long id) {
			// TODO Auto-generated method stub
			return this.hibernateTemplate.get(Product.class, id);
		}

		@Transactional
		public Product deleteProduct(Long id) {
			// TODO Auto-generated method stub
			Product product = this.getProductById(id);
			
			if(product != null) {
			
				this.hibernateTemplate.delete(product);
				
				return product;
			}
			return null;
		}
		
	
	}