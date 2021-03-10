package br.com.brasil.prev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceDesadioBrasilPrevApplication {

	private static final Logger log = LoggerFactory.getLogger(ServiceDesadioBrasilPrevApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceDesadioBrasilPrevApplication.class, args);
		log.info("--------------------------------------------------------------------> SERVIÇO PRONTO PARA SER CONSUMIDO!");
	}

}
