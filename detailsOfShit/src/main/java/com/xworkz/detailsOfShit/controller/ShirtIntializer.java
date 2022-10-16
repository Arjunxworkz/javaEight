package com.xworkz.detailsOfShit.controller;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.detailsOfShit.configuration.DbConfiguration;
import com.xworkz.detailsOfShit.configuration.SpringConfiguration;
//import com.xworkz.milkShop.configuration.DbConfiguration;
//import com.xworkz.milkShop.configuration.MilkShopConfiguration;

public class ShirtIntializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
	
	private String[] ServletMappings= {"/"};
	private Class[] ServletConfigClasses= {SpringConfiguration.class,DbConfiguration.class};
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses");
		return ServletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		
		return  ServletMappings;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}

