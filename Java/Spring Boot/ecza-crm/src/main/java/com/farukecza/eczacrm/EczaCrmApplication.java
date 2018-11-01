package com.farukecza.eczacrm;

import com.farukecza.eczacrm.entity.Role;
import com.farukecza.eczacrm.entity.User;
import com.farukecza.eczacrm.repository.RoleRepository;
import com.farukecza.eczacrm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class EczaCrmApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EczaCrmApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

    }
}
