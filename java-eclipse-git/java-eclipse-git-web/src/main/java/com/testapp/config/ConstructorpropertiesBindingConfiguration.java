package com.testapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ConstructorBinding
@ConfigurationProperties("dave")
@Getter
@RequiredArgsConstructor
@ToString
public class ConstructorpropertiesBindingConfiguration {
	private final String username;
	private final String password;
	private final String jdbcurl;
}
