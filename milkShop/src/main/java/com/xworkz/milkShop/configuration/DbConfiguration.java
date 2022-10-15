package com.xworkz.milkShop.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Configuration
public class DbConfiguration {

	public DbConfiguration() {
		System.out.println("Created db configuration");
	}
    @Bean
	public LocalContainerEntityManagerFactoryBean factoryBean(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean factoryBean =new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPackagesToScan("com.xworkz");
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		System.out.println("Getting data source from Spring");
		factoryBean.setDataSource(dataSource);
		
		Map<String, Object> jpaProperties=new HashMap<String, Object>();
		jpaProperties.put("hibernate.show_sql", true);
		jpaProperties.put("Hibernate.dilact","org.hibernate.postgreSqlDialact");

		return factoryBean;

	}
    @Bean
	public DataSource dataSource() {
		
		System.out.println("cteated data source");
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/milkShop");
		dataSource.setPassword("Arjunxwork");
        dataSource.setUsername("root");
		
		return dataSource;

	}

}
