package com.xworkz.criminals.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminals.dao.CriminalDao;
import com.xworkz.criminals.dto.CriminalDTO;
@Repository
public class CriminalDaoImpl implements CriminalDao {
    @Autowired
	private EntityManagerFactory factory;
    
    EntityManager manager;
    
	@Override
	public boolean save(CriminalDTO criminalDTO) {
	
		try {
			manager=factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(criminalDTO);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
	
		
		return true;
	
	}

	@Override
	public List<CriminalDTO> findAll() {
		try {
			manager=factory.createEntityManager();
			Query createNamedQuery = manager.createNamedQuery("findAll");
			List<CriminalDTO> result=createNamedQuery.getResultList();
			return result;
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return findAll();
	}

}
