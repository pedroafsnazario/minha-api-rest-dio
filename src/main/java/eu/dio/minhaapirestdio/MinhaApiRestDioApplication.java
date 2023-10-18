package eu.dio.minhaapirestdio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class MinhaApiRestDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhaApiRestDioApplication.class, args);
	}

}
