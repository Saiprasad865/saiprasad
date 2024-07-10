package com.project1.project1.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project1.project1.Repository.UserRepository;

import jakarta.transaction.Transactional;

	@Service
	public class UserDetailsServiceImpl implements UserDetailsService {
	    @Autowired
	    UserRepository userRepository;

	    @Override
	    @Transactional
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        User user = userRepository.findByEmail(username)
	                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

	        return UserDetailsImpl.build(user);
	    }
	}



