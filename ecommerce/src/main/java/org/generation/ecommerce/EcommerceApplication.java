package org.generation.ecommerce;

import org.generation.ecommerce.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}//main
	
	@Bean//esto nos permite decirle a la aplicación @SpringBootApplication que hay un bean, para que lo busque y sepa que hay un filtro
	public FilterRegistrationBean<JwtFilter>jwtFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean=
				new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/products/*");
		registrationBean.addUrlPatterns("/api/users/*");
		return registrationBean;
	}//jwtFilter
	

}
