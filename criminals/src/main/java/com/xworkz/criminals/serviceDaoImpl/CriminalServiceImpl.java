package com.xworkz.criminals.serviceDaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.criminals.dao.CriminalDao;
import com.xworkz.criminals.dto.CriminalDTO;
import com.xworkz.criminals.serviceDao.CriminalServiceDao;
@Service
public class CriminalServiceImpl implements CriminalServiceDao{
	@Autowired
	private CriminalDao dao;

	@Override
	public boolean saveAndValidate(CriminalDTO criminalDTO) {
		System.out.println("Calling validateAndSave");
		if(criminalDTO != null) {
			String name=criminalDTO.getName();
			String wifeName =criminalDTO.getWifeName();
			String rightHandName =criminalDTO.getRightHandName();
			String leftHandName =criminalDTO.getLeftHandName();
			String prsionName =criminalDTO.getPrisonName();
			Double netWorth =criminalDTO.getNetWorth();
			

			if (name.length() > 3 && name.length() < 30 && wifeName.length() > 3 && wifeName.length() < 30
					&& rightHandName.length() > 3 && rightHandName.length() < 30 && leftHandName.length() > 3
					&& leftHandName.length() < 30 && prsionName.length() > 3 && prsionName.length() < 30
					&& netWorth != 0) {
				return this.dao.save(criminalDTO);

			} else {
				System.out.println("Data is Not valid");
			}
		}
		return false;
	}

	@Override
	public List<CriminalDTO> findAll() {
		System.out.println("Calling FindAll Method From Service");
		List<CriminalDTO> find = dao.findAll();
		return this.dao.findAll();
	}

}
