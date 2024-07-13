package spring_micro_services.microservices_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MicroservicesBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBasicsApplication.class, args);
	}

}
