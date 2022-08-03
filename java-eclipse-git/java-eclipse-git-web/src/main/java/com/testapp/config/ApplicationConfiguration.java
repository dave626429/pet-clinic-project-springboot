package com.testapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.testapp.datasource.FakeDataSource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class ApplicationConfiguration {

	@Bean
	public FakeDataSource fakeDataSource(@Value("${application.username}") String userName,
			@Value("${application.password}") String pasword, @Value("${application.jdbcurl}") String jdbcurl) {
		return new FakeDataSource(userName, pasword, jdbcurl);
	}

}
