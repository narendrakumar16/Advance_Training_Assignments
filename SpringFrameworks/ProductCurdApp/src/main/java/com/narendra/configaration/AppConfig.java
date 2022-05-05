package com.narendra.configaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.narendra.productapp.App;

@Configuration
@ComponentScan("com.narendra")
public class AppConfig {

	@Bean
	public App getApp() {

		return new App();
	}

}
