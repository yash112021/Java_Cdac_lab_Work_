package com.demo.config;

import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("data.properties") /* telling that you have to pickup the data from the data properties */
public class TestAnnotationConfig {
	
	
	// now we are not using the location in the bean so we are using this approach your aim is to reduce the xml fil
	@Bean 
	public PropertySourcesPlaceholderConfigurer getPlaceholder() {
		
		System.out.println("inside the getPlaceHolder");
		// creating the the objectofit
		PropertySourcesPlaceholderConfigurer x=new PropertySourcesPlaceholderConfigurer();
		return x;
	}
	
	
}


