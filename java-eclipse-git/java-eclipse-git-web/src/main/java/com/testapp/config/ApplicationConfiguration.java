package com.testapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testapp.datasource.FakeDataSource;

//@PropertySource("classpath:datasource.properties")
@Configuration
public class ApplicationConfiguration {

	@Bean
	public FakeDataSource fakeDataSource(@Value("${dave.username}") String userName,
			@Value("${dave.password}") String pasword, @Value("${dave.jdbcurl}") String jdbcurl) {
		return new FakeDataSource(userName, pasword, jdbcurl);
	}

}
	