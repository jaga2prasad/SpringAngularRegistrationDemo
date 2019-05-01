package com.jaga.registerDemo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	Set<String> prod_con = new HashSet<String>();
	
	public static final ApiInfo api_info=new ApiInfo("Employee Registration", "Employee Registraion Demo", "1.0", "", "Jagannatha Prasad", "", "");
	
	@Bean
	public Docket api(){
		prod_con.add("application/json");
		return new Docket(DocumentationType.SWAGGER_2).produces(prod_con).consumes(prod_con).apiInfo(api_info);
	}

	
}
