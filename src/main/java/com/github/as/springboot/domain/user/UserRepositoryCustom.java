package com.github.as.springboot.domain.user;

import java.util.List;
import com.github.as.springboot.dto.user.UserDTO;

public interface UserRepositoryCustom {

    List<UserDTO> findByName(String name);
    
}
