package lfcode.api.bible;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BibleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibleApiApplication.class, args);
	}

}
