package com.asp.micrositio.eiyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.asp.micrositio.eiyu"/*, "com.eiyu.common.filter"*/ })
public class EiyuApplication {

	public static void main(String[] args) {
		SpringApplication.run(EiyuApplication.class, args);
	}

}
