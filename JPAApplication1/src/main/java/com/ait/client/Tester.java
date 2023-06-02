package com.ait.client;

import com.ait.dao.ProductDAO;
import com.ait.dao.impl.ProductDAOImpl;
import com.ait.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) {

		ProductDAO dao = new ProductDAOImpl();
		/*
		 * create a new product entity
		 */
		
		  ProductEntity pEnity = new ProductEntity(); 
		  pEnity.setProductId(129013);
		  pEnity.setProductName("mobile"); pEnity.setQuantity(12);
		  pEnity.setUnitPrice(25000.0);
		  
		  dao.saveProduct(pEnity);
		  
		
		 
		/*
		 * call updateProductById() of DAO class
		 */

	//	ProductEntity p = dao.updateProductById(129012, 56000.0);
	//	System.out.println(p);
		
		/*
		 * load the object
		 */
	/*	
		ProductEntity fetch = dao.loadProductById(129012);
		System.out.println(fetch);
		*/
		/*
		 * delete the object
		 */
		
	//dao.deleteProductById(129012);
		
		
		
		
	}
}
