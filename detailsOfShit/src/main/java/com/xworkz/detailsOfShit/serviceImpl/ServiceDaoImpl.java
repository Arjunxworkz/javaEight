package com.xworkz.detailsOfShit.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.detailsOfShit.dao.ShirtDao;
import com.xworkz.detailsOfShit.dto.ShirtDTO;
import com.xworkz.detailsOfShit.service.ServiceDao;
@Service
public class ServiceDaoImpl implements ServiceDao {
	
	@Autowired
	private ShirtDao dao;

	@Override
	public boolean saveAndValidate(ShirtDTO dto) {
		System.out.println("ServiceDaoImpl is calling");
		dao.save(dto);
		return false;
	}

}
