package za.ac.nwu.ac.web.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RestServiceApplication {

    public static void main(String[] args) {SpringApplication.run(RestServiceApplication.class, args);}
}
