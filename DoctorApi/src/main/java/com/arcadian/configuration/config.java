package com.arcadian.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.arcadian.service2.interface2;
import com.arcadian.service2.interfaceimpl2;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.arcadian")
public class config extends WebMvcConfigurationSupport{
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("inside View Resolver +++++++");
		registry.addViewController("/").setViewName("signup");
	}
	@Bean
	public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
System.out.println("lol");
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
	
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://112.196.38.250:3306/thanqueue");
		dataSource.setUsername("arcadian1");
		dataSource.setPassword("mysql");
		return dataSource;
		                                                             
	}
	@Bean
	public interface2  doctor()
	{
		return new interfaceimpl2();
	}

}
