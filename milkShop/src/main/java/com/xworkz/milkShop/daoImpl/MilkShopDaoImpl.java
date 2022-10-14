package com.xworkz.milkShop.daoImpl;

import org.springframework.stereotype.Repository;

import com.xworkz.milkShop.dao.MilkShopDao;
import com.xworkz.milkShop.dto.MilkShopDTO;
@Repository
public class MilkShopDaoImpl implements MilkShopDao {

	@Override
	public boolean save(MilkShopDTO dto) {
		
		return true;
	}

}
