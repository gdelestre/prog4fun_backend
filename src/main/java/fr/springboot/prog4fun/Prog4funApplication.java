package fr.springboot.prog4fun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


// Pour le déploiement il est necessaire que notre classe hérite de SpringBootServletInitializer. Rajout de la méthode protected.
@SpringBootApplication
public class Prog4funApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Prog4funApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Prog4funApplication.class, args);
	}
}
