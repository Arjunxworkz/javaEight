package com.xworkz.milkShop.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class MilkShopConfiguration {

	
	public MilkShopConfiguration() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	@Bean
	public ViewResolver resolver() {
		return new InternalResourceViewResolver("/",".jsp");
		
	}
}
