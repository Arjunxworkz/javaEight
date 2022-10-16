package com.xworkz.detailsOfShit.service;

import com.xworkz.detailsOfShit.dto.ShirtDTO;

public interface ServiceDao {
boolean saveAndValidate(ShirtDTO dto);
}
