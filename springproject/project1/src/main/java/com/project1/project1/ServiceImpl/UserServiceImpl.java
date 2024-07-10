package com.project1.project1.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project1.project1.Repository.UserRepository;
import com.project1.project1.Service.UserService;

@Service
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;



    public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public void save(User user){
        userRepository.save(user);
    }


}
