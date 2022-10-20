package com.xworkz.criminals.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.criminals.dbconfiguration.DbConfoguration;

public class SpringMvcIntializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {
	
	private String[] servletMappings = { "/" };
	private Class[] servletConfigClasses = { SpringConfiguration.class, DbConfoguration.class };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return servletMappings;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

		configurer.enable();
	}

}
