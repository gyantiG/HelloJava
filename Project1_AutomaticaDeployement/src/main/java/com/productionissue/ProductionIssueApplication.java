package com.productionissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductionIssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductionIssueApplication.class, args);
		System.out.println("Example for manual deployement");
	}

}
