package br.com.heycristhian.springrequestinterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringRequestInterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRequestInterceptorApplication.class, args);
	}

}
