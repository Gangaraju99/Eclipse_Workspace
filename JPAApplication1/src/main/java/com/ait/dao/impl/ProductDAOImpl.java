package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.dao.ProductDAO;
import com.ait.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("books");
	
	
	@Override
	public ProductEntity saveProduct(ProductEntity product) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(product);
			tx.commit();
			System.out.println(" product is inserted to the dabase");
		}catch(Exception e ) {
			tx.rollback();
			System.out.println("Error in inserting to the database");
		}
		finally {
			entityManager.close();
		}
		return product;
	}

	@Override
	public ProductEntity loadProductById(Integer productId) {
		EntityManager entityManager  = factory.createEntityManager();
		/*
		 * find() : early load
		 * getReference(): lazy load
		 */
		ProductEntity p = entityManager.find(ProductEntity.class,productId);
		entityManager.close();
		return p;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double new_Unit_price) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p = entityManager.find(ProductEntity.class,productId);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		p.setUnitPrice(new_Unit_price);
		tx.commit();
		entityManager.close();
		
		
		return p;
	}

	@Override
	public void deleteProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p = entityManager.find(ProductEntity.class,productId );
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.remove(p);
		tx.commit();
		entityManager.close();
		
		
		
	
	}

}
