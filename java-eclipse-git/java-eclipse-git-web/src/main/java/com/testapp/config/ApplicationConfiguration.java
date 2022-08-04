package com.testapp.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testapp.datasource.FakeDataSource;

//@PropertySource("classpath:datasource.properties")
@EnableConfigurationProperties(ConstructorpropertiesBindingConfiguration.class)
@Configuration
public class ApplicationConfiguration {

	/*
	 * @Bean public FakeDataSource fakeDataSource(@Value("${dave.username}") String
	 * userName,
	 * 
	 * @Value("${dave.password}") String pasword, @Value("${dave.jdbcurl}") String
	 * jdbcurl) { return new FakeDataSource(userName, pasword, jdbcurl); }
	 */
	
	@Bean
	public FakeDataSource fakeDataSource(PropertiesBindingConfiguration propertiesBindingConfiguration) {
		return new FakeDataSource(propertiesBindingConfiguration.getUsername(), propertiesBindingConfiguration.getPassword(), propertiesBindingConfiguration.getJdbcurl());
	}

}
	