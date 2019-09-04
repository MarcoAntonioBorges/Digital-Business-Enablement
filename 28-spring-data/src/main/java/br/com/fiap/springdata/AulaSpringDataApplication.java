package br.com.fiap.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class AulaSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataApplication.class, args);
	}

}
