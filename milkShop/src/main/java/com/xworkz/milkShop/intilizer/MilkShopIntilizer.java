package com.xworkz.milkShop.intilizer;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.milkShop.configuration.MilkShopConfiguration;

public class MilkShopIntilizer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
	
	private String[] ServletMappings= {"/"};
	private Class[] ServletConfigClasses= {MilkShopConfiguration.class};
	
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
