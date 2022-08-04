package com.testapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
@ConfigurationProperties("dave")
@Data
@NoArgsConstructor
public class PropertiesBindingConfiguration {
	private String username;
	private String password;
	private String jdbcurl;
}
