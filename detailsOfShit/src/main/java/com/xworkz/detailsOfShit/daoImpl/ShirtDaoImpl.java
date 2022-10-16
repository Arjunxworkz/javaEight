package com.xworkz.detailsOfShit.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.detailsOfShit.dao.ShirtDao;
import com.xworkz.detailsOfShit.dto.ShirtDTO;

@Repository
public class ShirtDaoImpl implements ShirtDao {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(ShirtDTO dto) {
System.out.println("Callling save method");
		
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			EntityTransaction tr=createEntityManager.getTransaction();
			tr.begin();
			createEntityManager.persist(dto);
			tr.commit();
		} catch (PersistenceException e) {
			
			System.out.println("exception save "+e.getMessage());
		}
		finally {
		createEntityManager.close();	
		}
		return false;
	}

	

	
}
