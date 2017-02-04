package com.portal.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;

import com.portal.models.Client;

import portal.daos.modelDaos.userAccess;

public class EcommUserService implements UserDetailsService{
	private final userAccess userRepository;

	public EcommUserService(userAccess userRepository) {
		this.userRepository = userRepository;
		}


	
	
	public	UserDetails loadUserByUsername(String username)
		throws UsernameNotFoundException {
		Client user = userRepository.getUserByUsername(username);
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
	
	

