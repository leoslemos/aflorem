package br.org.aflorem.afloremAplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan("br.org.aflorem.controller")
@EntityScan("br.org.aflorem.model")
@EnableJpaRepositories("br.org.aflorem.repository")
public class AfloremApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfloremApplication.class, args);
	}

}
