package co.simplon.p25.elise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class EliseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EliseApplication.class, args);
	}

}