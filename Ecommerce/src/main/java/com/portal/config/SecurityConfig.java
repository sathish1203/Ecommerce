package com.portal.config;

	import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.
	configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.
	configuration.WebSecurityConfigurerAdapter;

import com.portal.daos.HibernateSession;

import com.portal.security.EcommUserService;

import portal.daos.modelDaos.userAccess;
	@Configuration
	@EnableWebSecurity
	public class SecurityConfig extends WebSecurityConfigurerAdapter {
		
	
		
		protected void configure(HttpSecurity http) throws Exception {
			http
	            .authorizeRequests()
		            .antMatchers("/landing").hasRole("USER")
		            .antMatchers("/admin").hasRole("ADMIN")
		            .anyRequest().permitAll()
	                .and()
	            .formLogin()
	                .loginPage("/login")
	                .permitAll()
	                .and()
	            .csrf()
	            	.disable();
			}
	
	
		@Override
		protected void configure(AuthenticationManagerBuilder auth)
		throws Exception {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans.xml");
			   HibernateSession db_session = (HibernateSession) context.getBean("h2_db_01");
			   userAccess userAcc = new userAccess(db_session.getSessionFactory());
			   System.out.println("In configure Auth of Security COnfig");
		auth
		.userDetailsService(new EcommUserService(userAcc));
		}
	}
