package com.github.as.springboot.domain.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id @GeneratedValue
    private Long id;
    
    private String name;
    
    private int age;

    @Builder
    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
