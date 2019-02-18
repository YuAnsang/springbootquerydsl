package com.github.as.springboot.service.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.as.springboot.domain.user.UserRepository;
import com.github.as.springboot.dto.user.UserDTO;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    public List<UserDTO> findByname(String name) {
        return userRepository.findByName(name);
    }
    
}
