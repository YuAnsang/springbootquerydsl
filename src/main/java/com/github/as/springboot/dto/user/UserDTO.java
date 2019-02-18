package com.github.as.springboot.dto.user;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserDTO {

    private Long id;

    @NonNull
    private String name;
    
    @NonNull
    private Integer age;
}
