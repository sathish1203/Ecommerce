package com.portal.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;

import com.portal.daos.ClientDAOImpl;
import com.portal.models.Client;


public class EcommUserService implements UserDetailsService{
	
	
	private ClientDAOImpl clientDAOImpl = (ClientDAOImpl) new ClassPathXmlApplicationContext("spring_beans.xml").getBean("clientDAOImpl");;
	
		
	public	UserDetails loadUserByUsername(String username)
		throws UsernameNotFoundException {
		Client user = clientDAOImpl.getUserByUsername(username);
		if (user != null) {
		List<GrantedAuthority> authorities =
		new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return new User(
		user.getUname(),
		user.getPassword(),
		authorities);
		}
		throw new UsernameNotFoundException(
				"User '" + username + "' not found.");
				}
				}
	
	

