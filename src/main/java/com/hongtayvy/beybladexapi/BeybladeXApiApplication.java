package com.hongtayvy.beybladexapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.hongtayvy.beybladexapi")
@EntityScan("com.hongtayvy.beybladexapi.model")
@EnableJpaRepositories("com.hongtayvy.beybladexapi.repository")
public class BeybladeXApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(BeybladeXApiApplication.class, args);
	}

}
