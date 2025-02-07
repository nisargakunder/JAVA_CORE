package com.bankapplication.bank;

import com.bankapplication.bank.repo.UserEntity;
import com.bankapplication.bank.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class BankApplication  implements CommandLineRunner {
	@Autowired
private UserEntityService userEntityService;
@Autowired
private PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
    @Override
	public void run(String... args) throws Exception {
//		userEntityService.addUserEntity(new UserEntity("raj123",passwordEncoder.encode("raj123"), List.of("ROLE_ADMIN")));
//		userEntityService.addUserEntity(new UserEntity("ekta123",passwordEncoder.encode("ekta123"),List.of("ROLE_MGR")));
//		userEntityService.addUserEntity(new UserEntity("gun123",passwordEncoder.encode("gun123"),List.of("ROLE_CLERK")));
	}
}
