package com.xworkz.milkShop.intilizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milkShop.dto.MilkShopDTO;
import com.xworkz.milkShop.service.MilkShopService;

@Controller
@RequestMapping("/milk")
public class MilkShopController {
    @Autowired
	private MilkShopService milkShopService;
    
    
    public MilkShopController() {
		System.out.println("running "+ this.getClass().getSimpleName());
	}
   @PostMapping
  public String onSave(MilkShopDTO dto){
	   
	   milkShopService.validateAndSave(dto);
	   
	   return "display";
    	
    }
}
