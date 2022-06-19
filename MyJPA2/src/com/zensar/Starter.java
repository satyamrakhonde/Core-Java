package com.zensar;
import com.zensar.model.Department;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA2");
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        EntityTransaction entityTransaction = entityManager.getTransaction();
	        entityTransaction.begin();
	        Department dept = new Department();
	        dept.setId(100);
	        dept.setName("R&D");
	        entityManager.persist(dept);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	        entityManagerFactory.close();
	}

}
