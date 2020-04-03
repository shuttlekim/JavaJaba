package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		
		http.authorizeRequests()
		.mvcMatchers("/","/all/**","/DeptTest.html").permitAll()
		.mvcMatchers("/manager/**").hasRole("MANAGER")
		.anyRequest().authenticated();
		
		http.formLogin();	
		//spring security 가 제공하는 로그인폼을 사용
		
		//로그인 페이지를 사용자가 만들어 지정해 보자
		//http.formLogin().loginPage("/login").permitAll();
		
		//로그아웃을 위한 서비스명도 지정한다
		//http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		//.invalidateHttpSession(true);
		
		
		http.httpBasic();	
		//http기본 프로토콜을 사용
	}
	
}
