package com.asp.micrositio.eiyu.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.asp.micrositio.eiyu.repository")
@EnableTransactionManagement
public class PersistenceConfig {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
