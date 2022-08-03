package com.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.testapp.datasource.FakeDataSource;

@SpringBootApplication
public class JavaEclipseGitApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(JavaEclipseGitApplication.class, args);
		
		FakeDataSource fakeDataSource =ctx.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource);
	} 

}
