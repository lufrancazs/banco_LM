package br.com.lmf.BancoLM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BancoLmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoLmApplication.class, args);
	}

}
