package com.xworkz.criminals.serviceDao;

import java.util.List;

import com.xworkz.criminals.dto.CriminalDTO;

public interface CriminalServiceDao {
	boolean saveAndValidate(CriminalDTO criminalDTO);
	
	List<CriminalDTO> findAll();
}
