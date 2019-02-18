package com.github.as.springboot.domain.user;

import static com.github.as.springboot.domain.user.QUser.user;
import java.util.List;
import com.github.as.springboot.dto.user.UserDTO;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<UserDTO> findByName(String name) {
        return queryFactory.select(Projections.constructor(UserDTO.class, user.name, user.age))
                .from(user).where(user.name.eq(name)).fetch();
    }
}
