package com.github.as.springboot.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.github.as.springboot.domain.user.User;
import com.github.as.springboot.domain.user.UserRepository;
import com.github.as.springboot.dto.user.UserDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTest {

    @Autowired
    private UserRepository userRepository;

    @After
    public void tearDown() throws Exception {
        userRepository.deleteAllInBatch();
    }

    @Test
    public void querydsl_기본_기능_확인() {
        //given
        String name = "test";
        userRepository.save(User.builder().name(name).age(20).build());

        //when
        List<UserDTO> result = userRepository.findByName(name);

        //then
        assertThat(result.size(), is(1));
        assertThat(result.get(0).getName(), is(name));
    }
}