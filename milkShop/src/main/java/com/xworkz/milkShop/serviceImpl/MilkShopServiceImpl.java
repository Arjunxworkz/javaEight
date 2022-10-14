package com.xworkz.milkShop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkShop.dao.MilkShopDao;
import com.xworkz.milkShop.dto.MilkShopDTO;
import com.xworkz.milkShop.service.MilkShopService;
@Service
public class MilkShopServiceImpl implements MilkShopService{
	@Autowired
	private MilkShopDao dao;
	
	public MilkShopServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(MilkShopDTO dtos) {
		System.out.println("save method is calling");
		dao.save(dtos);
		return true;
	}

}
