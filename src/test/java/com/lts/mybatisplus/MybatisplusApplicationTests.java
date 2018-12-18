package com.lts.mybatisplus;

import com.lts.mybatisplus.sys.entity.User;
import com.lts.mybatisplus.sys.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplusApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		User admin = userMapper.selectUserById("admin");
		System.out.println(admin);
	}

}

