package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.db.EmpManager;
import com.example.demo.vo.MemberVo;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableScheduling
@Configuration
public class JavaJabaApplication {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	public static void main(String[] args) {
		
		//EmpManager.insertMember(new MemberVo("lee", "Suin", "010-999-8888", 20, PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123"), "MANAGER"));
		//EmpManager.insertMember(new MemberVo("Jack", "Owen", "010-242-1255", 20, PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123"), "USER"));
		//EmpManager.insertMember(new MemberVo("Lana", "lay", "010-000-2222", 20,  PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123"), "USER"));
		
		
		SpringApplication.run(JavaJabaApplication.class, args);
	}

}